package com.ghost.gympro.utils;

import com.ghost.gympro.dtos.NotificacionSimpleDTO;
import com.ghost.gympro.dtos.projections.SMSResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Supplier;

@Service
@RequiredArgsConstructor
@Log4j2
public class SMSSendService implements NotificacionSimple {

    @Value("${sms.base-api-url}")
    private String BASE_API_URL;

    @Value("${sms.auth-username}")
    private String AUTHORIZATION_USERNAME;

    @Value("${sms.auth-password}")
    private String AUTHORIZATION_PASSWORD;


    public final RestTemplate restTemplate;


    @Override
    public void sendSimpleNotificacion(NotificacionSimpleDTO request) {
        RequestEntity<NotificacionSimpleDTO> requestEntity = RequestEntity
                .post(this.BASE_API_URL)
                .headers(headers.get())
                .contentType(MediaType.APPLICATION_JSON)
                .body(request);
        try {
            var response = this.restTemplate.exchange(requestEntity, SMSResponseDTO.class);
            if (response.getStatusCode().is2xxSuccessful())
                System.out.println(response.getBody().toString());
        } catch (HttpClientErrorException e) {
            log.error("Error message: {}", e.getMessage());
        }
    }

    private final Supplier<HttpHeaders> headers = () -> {

        String auth = new String(Base64.getEncoder().encode(String.format("%s:%s", this.AUTHORIZATION_USERNAME, this.AUTHORIZATION_PASSWORD)
                .getBytes(StandardCharsets.UTF_8)));
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + auth);
        return headers;
    };
}

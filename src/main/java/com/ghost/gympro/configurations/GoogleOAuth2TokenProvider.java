package com.ghost.gympro.configurations;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class GoogleOAuth2TokenProvider {

    @Value("${gmail.oauth.client-id}")
    private String clientId;

    @Value("${gmail.oauth.client-secret}")
    private String clientSecret;

    @Value("${gmail.oauth.refresh-token}")
    private String refreshToken;

    /**
     * Genera un nuevo Access Token usando el Refresh Token de larga duración.
     * @return El Access Token válido.
     */
    public String getAccessToken() throws IOException {

        Credential credential = new GoogleCredential.Builder()
                .setTransport(new NetHttpTransport())
                .setJsonFactory(GsonFactory.getDefaultInstance())
                .setClientSecrets(clientId, clientSecret)
                .build();

        credential.setRefreshToken(refreshToken);

        // Fuerza la renovación del token
        credential.refreshToken();

        return credential.getAccessToken();
    }
}
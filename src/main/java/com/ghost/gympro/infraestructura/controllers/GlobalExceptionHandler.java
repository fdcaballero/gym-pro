package com.ghost.gympro.infraestructura.controllers;

import com.ghost.gympro.dtos.ErrorDetails;
import com.ghost.gympro.domain.excepcions.EmailYaRegistradoException;
import com.ghost.gympro.domain.excepcions.RecursoNoEncontradoException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorDetails> handleNoSuchElementException(NoSuchElementException ex, WebRequest request) {
        ErrorDetails details = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(RecursoNoEncontradoException.class)
    public ResponseEntity<ErrorDetails> handleRecursoNoEncontrado(RecursoNoEncontradoException ex, WebRequest request) {
        ErrorDetails details = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmailYaRegistradoException.class)
    public ResponseEntity<ErrorDetails> handleEmailYaRegistrado(EmailYaRegistradoException ex, WebRequest request) {
        ErrorDetails details = new ErrorDetails(
                LocalDateTime.now(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                HttpStatus.CONFLICT.value()
        );
        return new ResponseEntity<>(details, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorDetails> handleDataIntegrityViolation(DataIntegrityViolationException ex, WebRequest request) {
        // Podemos intentar extraer un mensaje más amigable del error de la base de datos
        String message = "Conflicto de datos: Un registro con este identificador ya existe o la data es inválida (ej. clave única violada).";

        ErrorDetails details = new ErrorDetails(
                LocalDateTime.now(),
                message,
                request.getDescription(false).replace("uri=", ""),
                HttpStatus.CONFLICT.value()
        );
        return new ResponseEntity<>(details, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception ex, WebRequest request) {

        ErrorDetails details = new ErrorDetails(
                LocalDateTime.now(),
                "Ocurrió un error inesperado en el servidor.",
                request.getDescription(false).replace("uri=", ""),
                HttpStatus.INTERNAL_SERVER_ERROR.value()
        );
        ex.printStackTrace();

        return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

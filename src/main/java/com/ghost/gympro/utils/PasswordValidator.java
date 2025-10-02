package com.ghost.gympro.utils;

import java.util.regex.Pattern;

public class PasswordValidator extends StringValidator {

    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{8,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    private static PasswordValidator instance;


    private PasswordValidator() {
        super(PASSWORD_REGEX);
    }

    public static PasswordValidator getInstance() {
        if (instance == null) {
            instance = new PasswordValidator();
        }
        return instance;
    }



    @Override
    public String validateAndGetError(final String password) {
        if (password == null || password.isEmpty()) {
            return "La contraseña no debe estar vacía.";
        }
        if (password.length() < 8) {
            return "La contraseña debe tener al menos 8 caracteres.";
        }
        if (!password.matches(".*[0-9].*")) {
            return "La contraseña debe contener al menos un número.";
        }
        if (!password.matches(".*[a-z].*")) {
            return "La contraseña debe contener al menos una letra minúscula.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "La contraseña debe contener al menos una letra mayúscula.";
        }
        if (!password.matches(".*[!@#$%^&*()-+].*")) {
            return "La contraseña debe contener al menos un carácter especial (!@#$%^&*()-+).";
        }
        if (password.matches(".*\\s.*")) {
            return "La contraseña No debe contener espacios en blanco.";
        }

        if (!isValid(password)) {
            return "La contraseña no cumple con todos los requisitos de seguridad.";
        }

        return "OK";
    }

}

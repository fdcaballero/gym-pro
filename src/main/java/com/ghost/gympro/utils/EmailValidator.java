package com.ghost.gympro.utils;



public class EmailValidator extends StringValidator {

    private static EmailValidator instance;

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";


    private EmailValidator(String param) {
        super(param);
    }


    public static EmailValidator getInstance(String pattern) {
        if (instance == null) {
            String param = (pattern == null) ? EMAIL_REGEX : pattern;
            instance = new EmailValidator(param);
        }
        return instance;
    }


    @Override
    public String validateAndGetError(String email) {

        if (email == null || email.trim().isEmpty())
            return "El correo electrónico no debe estar vacío.";

        if (!email.contains("@"))
            return "El correo electrónico debe contener el símbolo '@'.";

        if (email.startsWith("@") || email.endsWith("@"))
            return "El símbolo '@' no puede estar al inicio o al final.";


        // 3. Verificar que haya al menos un punto después del '@' (para el dominio.tld)
        String domainPart = email.substring(email.indexOf("@") + 1);
        if (!domainPart.contains(".")) {
            return "El dominio debe contener al menos un punto (ej. 'dominio.com').";
        }

        // 4. Verificar la longitud del TLD (Dominio de Nivel Superior)
        String[] parts = email.split("\\.");
        if (parts.length > 0) {
            String tld = parts[parts.length - 1];
            if (tld.length() < 2 || tld.length() > 6) {
                return "El dominio de nivel superior (TLD) parece incorrecto o demasiado corto/largo.";
            }
        }

        if (!isValid(email))
            return "El formato general del correo electrónico no es válido.";


        return "OK"; // Si pasa todas las comprobaciones
    }
}

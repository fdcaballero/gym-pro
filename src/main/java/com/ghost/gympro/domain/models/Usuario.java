package com.ghost.gympro.domain.models;


import com.ghost.gympro.utils.PasswordValidator;
import lombok.Getter;
import lombok.Setter;

public class Usuario {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String usuario;
    @Setter
    @Getter
    private String correo;

    @Getter
    private String password;
    @Getter
    @Setter
    private Boolean activo;

    public Usuario() {

    }


    public void setPassword(String password) {

        PasswordValidator passwordValidator = PasswordValidator.getInstance();
        if (passwordValidator.isValid(password)) {
            this.password = password;
            return;
        }
        //TODO cambiar a una excepcion personalizada
        throw new RuntimeException(passwordValidator.validateAndGetError(password));
    }
}

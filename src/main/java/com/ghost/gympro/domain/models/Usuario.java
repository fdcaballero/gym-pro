package com.ghost.gympro.domain.models;


import com.ghost.gympro.domain.excepcions.DomainException;
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
    private Boolean activo = true;

    public Usuario() {

    }

    public void setPassword(String password) {

        PasswordValidator passwordValidator = PasswordValidator.getInstance();
        if (passwordValidator.isValid(password)) {
            this.password = password;
            return;
        }
        throw new DomainException(passwordValidator.validateAndGetError(password));
    }
}

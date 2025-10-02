package com.ghost.gympro.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CrearUsuarioDTO {
    @NotEmpty
    private String usuario;

    @NotEmpty
    @Email(message = "El campo debe ser un email válido")
    private String correo;
    @NotEmpty(message = "Campo obligatorio")
    private String password;

}

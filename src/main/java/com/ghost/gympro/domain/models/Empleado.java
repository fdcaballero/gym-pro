package com.ghost.gympro.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Persona {

    private Set<Rol> roles;

    private Empleado(EmpleadoBuilder builder) {
        super(builder.id, builder.nombre,
                builder.apellido, builder.telefono, builder.correo, builder.fechaNacimiento, builder.usuario);
        this.setRoles(builder.roles);
    }

    //IMPLEMENTACION BUILDER
    public static class EmpleadoBuilder {

        public EmpleadoBuilder() {
        }

        private Long id;
        private String nombre;
        private String apellido;
        private String telefono;
        private String correo;
        private LocalDate fechaNacimiento;
        private Usuario usuario;
        private Set<Rol> roles;

        public EmpleadoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public EmpleadoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public EmpleadoBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public EmpleadoBuilder correo(String correo) {
            this.correo = correo;
            return this;
        }

        public EmpleadoBuilder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public EmpleadoBuilder usuario(Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        public EmpleadoBuilder roles(Set<Rol> roles) {
            this.roles = roles;
            return this;
        }

        public Empleado build() {
            return new Empleado(this);
        }


    }

}


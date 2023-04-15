package es.progcipfpbatoi.modelo.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String        nombre;
    private String        apellidos;
    private Dni           dni;
    private Correo        email;
    private TelefonoMovil telefonoMovil;
    private LocalDate     fechaNacimiento;
    private CodigoPostal codigoPostal;
    private Password      password;

    public User(String nombre, String apellidos, Dni dni, Correo email,
                TelefonoMovil telefonoMovil, LocalDate fechaNacimiento,
                CodigoPostal codigoPostal, Password password) {
        this.nombre          = nombre;
        this.apellidos       = apellidos;
        this.dni             = dni;
        this.email           = email;
        this.telefonoMovil   = telefonoMovil;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoPostal    = codigoPostal;
        this.password        = password;
    }

    public Dni getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        User user = (User) o;
        return Objects.equals( dni, user.dni );
    }

    @Override
    public int hashCode() {
        return Objects.hash( dni );
    }
}

package es.progcipfpbatoi.modelo.entidades;

import java.time.LocalDate;

public class User {
    private String        nombre;
    private String        apellidos;
    private Dni           dni;
    private Correo        email;
    private TelefonoMovil telefonoMovil;
    private LocalDate     fechaNacimiento;
    private CodigoPostal codigoPostal;
    private Password      password;
}

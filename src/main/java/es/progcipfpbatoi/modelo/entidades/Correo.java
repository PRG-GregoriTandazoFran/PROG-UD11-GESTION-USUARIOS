package es.progcipfpbatoi.modelo.entidades;

import es.progcipfpbatoi.utils.ValidatorCorreo;

public class Correo {
    private String correo;

    public Correo(String correo) {
        if ( ValidatorCorreo.isValid( correo ) ) {
            this.correo = correo;
        }
    }
}

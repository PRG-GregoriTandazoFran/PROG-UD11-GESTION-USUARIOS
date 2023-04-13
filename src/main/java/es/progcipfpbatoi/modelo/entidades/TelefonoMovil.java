package es.progcipfpbatoi.modelo.entidades;

import es.progcipfpbatoi.utils.ValidatorTelefono;

public class TelefonoMovil {
    private String telefono;

    public TelefonoMovil(String telefono) {
        if ( ValidatorTelefono.isValid( telefono ) ){
            this.telefono = telefono;
        }
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "telefono='" + telefono + '\'' +
                '}';
    }
}

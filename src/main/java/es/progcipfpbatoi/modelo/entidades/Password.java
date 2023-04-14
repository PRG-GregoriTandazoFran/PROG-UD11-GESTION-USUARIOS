package es.progcipfpbatoi.modelo.entidades;

import es.progcipfpbatoi.utils.ValidatorPassword;

public class Password {
    private String password;

    public Password(String password) {
        if ( ValidatorPassword.isValid( password ) ) {
            this.password = password;
        }
    }
}

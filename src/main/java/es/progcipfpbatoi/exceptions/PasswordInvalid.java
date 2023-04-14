package es.progcipfpbatoi.exceptions;

import es.progcipfpbatoi.utils.ValidatorPassword;

public class PasswordInvalid extends Exception {
    public PasswordInvalid(String message) {
        super( message );
    }
}

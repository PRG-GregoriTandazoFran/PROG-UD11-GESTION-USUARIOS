package es.progcipfpbatoi.utils;

import es.progcipfpbatoi.exceptions.CorreoInvalid;

public class ValidatorCorreo {

    //https://www3.ntu.edu.sg/home/ehchua/programming/howto/Regexe.html -> correo's regex web page
    private final static String REGEX_EMAIL = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$";

    public static boolean isValid(String correo) {
        try {
            if ( correo.matches( REGEX_EMAIL ) ) {
                return true;
            }
            throw new CorreoInvalid();
        } catch ( CorreoInvalid e1 ) {
            System.out.println( e1.getMessage() );
        }
        return false;
    }

}

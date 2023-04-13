package es.progcipfpbatoi.utils;

import es.progcipfpbatoi.exceptions.NumeroTelefonoInvalido;
import es.progcipfpbatoi.modelo.entidades.TelefonoMovil;

public class ValidatorTelefono {
    private final static int    SIZE_1                     = 9;
    private final static int    SIZE_MIN                   = 11;
    private final static int    SIZE_MAX                   = 13;
    private final static String REGEX_PHONE_OPTIONAL_PLUS  = "^\\+?34[0-9]{9}";
    private final static String REGEX_PHONE_OPTIONAL_ZEROS = "^(00?)34[0-9]{9}";

    public static boolean isValid(String telefono) {
        try {
            if ( isValidSize( telefono ) && areValidDigits( telefono ) ) {
                return true;
            }
        } catch ( NumeroTelefonoInvalido e1 ) {
            System.out.println( e1.getMessage() );
        }
        return false;
    }

    private static boolean isValidSize(String telefono) throws NumeroTelefonoInvalido {
        if ( telefono.length() == SIZE_1 || telefono.length() >= SIZE_MIN && telefono.length() <= SIZE_MAX ) {
            return true;
        }
        throw new NumeroTelefonoInvalido( "Tamaño inválido" );
    }

    private static boolean areValidDigits(String telefono) throws NumeroTelefonoInvalido {
        if ( telefono.matches( REGEX_PHONE_OPTIONAL_PLUS ) || telefono.matches( REGEX_PHONE_OPTIONAL_ZEROS ) ) {
            return true;
        }
        throw new NumeroTelefonoInvalido( "Dígitos inválidos" );
    }

    public static void main(String[] args) {
        TelefonoMovil tlf = new TelefonoMovil( "34642603912" );
        System.out.println( tlf );
    }
}

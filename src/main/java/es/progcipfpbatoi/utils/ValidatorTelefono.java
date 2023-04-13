package es.progcipfpbatoi.utils;

import es.progcipfpbatoi.exceptions.NumeroTelefonoInvalido;
import es.progcipfpbatoi.modelo.entidades.TelefonoMovil;

public class ValidatorTelefono {
    private final static int    MIN_SIZE                   = 11;
    private final static int    MEDIUM_SIZE                = 12;
    private final static int    MAX_SIZE                   = 13;
    private final static String REGEX_PHONE_OPTIONAL_PLUS  = "^\\+?34[0-9]{9}";
    private final static String REGEX_PHONE_OPTIONAL_ZEROS = "^(00?)34[0-9]{9}";

    public static boolean isValid(String telefono) {
        try {
            if ( isValidSize( telefono ) && areValidDigits( telefono ) && isCorrectStartNumber( telefono )) {
                return true;
            }
        } catch ( NumeroTelefonoInvalido e1 ) {
            System.out.println( e1.getMessage() );
        }
        return false;
    }

    private static boolean isValidSize(String telefono) throws NumeroTelefonoInvalido {
        if ( telefono.length() >= MIN_SIZE && telefono.length() <= MAX_SIZE ) {
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

    private static boolean isCorrectStartNumber(String telefono) throws NumeroTelefonoInvalido {
        if ( starWiths( telefono ) == '6' || starWiths( telefono ) == '7' ) {
            return true;
        }
        throw new NumeroTelefonoInvalido( "No empieza por 6 o 7" );
    }

    private static char starWiths(String telefono) throws NumeroTelefonoInvalido {
        switch ( telefono.length() ) {
            case MIN_SIZE -> {
                return startWithsPrefixFormat( telefono );
            }
            case MEDIUM_SIZE -> {
                return startWithsPlusPrefixFormat( telefono );
            }
            case MAX_SIZE -> {
                return startWithsZerosPrefixFormat( telefono );
            }
        }
        throw new NumeroTelefonoInvalido( "No empieza por 6 o 7" );
    }

    private static char startWithsPrefixFormat(String telefono) {
        return telefono.charAt( 2 );
    }

    private static char startWithsPlusPrefixFormat(String telefono) {
        return telefono.charAt( 3 );
    }

    private static char startWithsZerosPrefixFormat(String telefono) {
        return telefono.charAt( 4 );
    }

    public static void main(String[] args) {
        TelefonoMovil tlf = new TelefonoMovil( "34642603912" );

        System.out.println( tlf );
    }
}

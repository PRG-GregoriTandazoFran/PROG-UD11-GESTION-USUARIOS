package es.progcipfpbatoi.utils;

import es.progcipfpbatoi.exceptions.CodigoPostalInvalid;
import es.progcipfpbatoi.modelo.entidades.CodigoPostal;

public class ValidatorCodigoPostal {
    private final static String COD_POSTAL_REGREX = "^(5[0-2] | (0[1-9] | [1-4][0-9])) [0-9]{3}$";

    public static boolean isValid(String codPostal) {
        try {
            if ( isValidSizePostal( codPostal ) && areValidDigits( codPostal ) ) {
                return true;
            }
        } catch ( CodigoPostalInvalid e1 ) {
            System.out.println( e1.getMessage() );
        }
        return false;
    }

    private static boolean isValidSizePostal(String codPostal) throws CodigoPostalInvalid {
        if ( codPostal.length() == 5 ) {
            return true;
        }
        throw new CodigoPostalInvalid( "El tamaño no es válido" );
    }

    private static boolean areValidDigits(String codPostal) throws CodigoPostalInvalid {
        if (codPostal.matches( COD_POSTAL_REGREX ) ) {
            return true;
        }
        throw new CodigoPostalInvalid( "Los dígitos no son válidos" );
    }


    public static void main(String[] args) {
        String       codPostal = "52100";
        CodigoPostal codPos    = new CodigoPostal( codPostal );
        System.out.println( codPos );
    }
}

package es.progcipfpbatoi.utils;

import es.progcipfpbatoi.exceptions.DniInvalid;
import es.progcipfpbatoi.modelo.entidades.Dni;

public class Validator {
    private final static String DNI_REGREX = "[0-9]{8}";


    public static boolean isValidDni(String dni) {
        try {
            if ( isValidDigits( dni ) && isValidaSize( dni ) ) {
                return true;
            }
        } catch ( DniInvalid e1 ) {
            System.out.println( e1.getMessage() );
        }
        return false;
    }

    private static boolean isValidDigits(String dni) throws DniInvalid {
        if ( dni.matches( DNI_REGREX ) ) {
            return true;
        }
        throw new DniInvalid( "Dítigos inválidos" );
    }

    private static boolean isValidaSize(String dni) throws DniInvalid {
        if ( dni.length() == 8 ) {
            return true;
        }
        throw new DniInvalid( "Tamaño inválido" );
    }

    public static void main(String[] args) {
        String dni  = "21691308";
        Dni    dni1 = new Dni( dni );
        System.out.println(dni1);
    }
}

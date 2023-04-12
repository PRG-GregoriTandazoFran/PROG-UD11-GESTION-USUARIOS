package es.progcipfpbatoi.modelo.entidades;

import es.progcipfpbatoi.utils.Validator;

public class Dni {
    private              String dni;
    private final static String POSSIBLE_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public Dni(String dni) {
        if ( Validator.isValidDni( dni ) ) {
            this.dni = dni + calculateDniLetter( dni );
        }
    }

    private char calculateDniLetter(String dni) {
        int dniNumber   = Integer.parseInt( dni );
        int index = dniNumber % POSSIBLE_LETTERS.length();
        return POSSIBLE_LETTERS.charAt( index );
    }

    @Override
    public String toString() {
        return "Dni{" +
                "dni='" + dni + '\'' +
                '}';
    }
}

package es.progcipfpbatoi.utils;

import es.progcipfpbatoi.exceptions.PasswordInvalid;

public class ValidatorPassword {
    public final static  int    MIN_SIZE            = 5;
    public final static  int    MAX_SIZE            = 20;
    private final static String ESPECIAL_CHARACTERS = "[-._!\"`'#%&,:;<>=@{}~$()*+/\\\\?\\[\\]^|]";
    private final static String REGEX_PASSWORD      = ESPECIAL_CHARACTERS+"?[\\w]{5,20}"+ESPECIAL_CHARACTERS+"?";

    public static boolean isValid(String password) {
        try {
            if ( password.matches( REGEX_PASSWORD ) && hasCharacter( password ) ) {
                return true;
            }
            throw new PasswordInvalid("Debe medir entre "+MIN_SIZE+" y "+MAX_SIZE+". Y debe tener mayúsculas y minúsculas");
        } catch ( PasswordInvalid e1 ) {
            System.out.println( e1.getMessage() );
        }
        return false;
    }

    private static boolean hasCharacter(String password) throws PasswordInvalid {
        for ( int i = 0; i < password.length(); i++ ) {
            for ( int j = 0; j < ESPECIAL_CHARACTERS.length(); j++ ) {
                if ( password.charAt( i ) == ESPECIAL_CHARACTERS.charAt( j ) ) {
                    return true;
                }
            }
        }
        throw new PasswordInvalid("Debe tener como mínimo 1 carácter especial");
    }

    public static void main(String[] args) {
        String password = "ABc?25";
        System.out.println(isValid( password ));

    }
}

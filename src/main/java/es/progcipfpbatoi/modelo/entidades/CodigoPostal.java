package es.progcipfpbatoi.modelo.entidades;

import es.progcipfpbatoi.utils.ValidatorCodigoPostal;

public class CodigoPostal {
    private String codigo;

    public CodigoPostal(String codigo) {
        if ( ValidatorCodigoPostal.isValid( codigo ) ) {
            this.codigo = codigo;
        }
    }

    @Override
    public String toString() {
        return "CodigoPostal{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}

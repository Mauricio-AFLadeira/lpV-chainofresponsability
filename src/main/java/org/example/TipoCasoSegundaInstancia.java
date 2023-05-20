package org.example;

public class TipoCasoSegundaInstancia implements TipoCaso {

    private static TipoCasoSegundaInstancia tipoCasoSegundaInstancia = new TipoCasoSegundaInstancia();

    private TipoCasoSegundaInstancia() {};

    public static TipoCasoSegundaInstancia getTipoCasoSegundaInstancia() {
        return tipoCasoSegundaInstancia;
    }
}

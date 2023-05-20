package org.example;

public class TipoCasoInstanciaMaxima implements TipoCaso {

    private static TipoCasoInstanciaMaxima tipoCasoInstanciaMaxima = new TipoCasoInstanciaMaxima();

    private TipoCasoInstanciaMaxima() {};

    public static TipoCasoInstanciaMaxima getTipoCasoInstanciaMaxima() {
        return tipoCasoInstanciaMaxima;
    }
}

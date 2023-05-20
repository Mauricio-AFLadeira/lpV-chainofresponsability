package org.example;

public class TipoCasoPrimeiraInstancia implements TipoCaso {

    private static TipoCasoPrimeiraInstancia tipoCasoPrimeiraInstancia = new TipoCasoPrimeiraInstancia();

    private TipoCasoPrimeiraInstancia() {};

    public static TipoCasoPrimeiraInstancia getTipoCasoPrimeiraInstancia() {
        return tipoCasoPrimeiraInstancia;
    }
}

package org.example;

public class TipoCasoSaudePublica implements TipoCaso {

    private static TipoCasoSaudePublica tipoCasoSaudePublica = new TipoCasoSaudePublica();

    private TipoCasoSaudePublica() {};

    public static TipoCasoSaudePublica getTipoCasoSaudePublica() {
        return tipoCasoSaudePublica;
    }
}

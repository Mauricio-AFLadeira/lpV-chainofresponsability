package org.example;

public class JudiciarioJuiz extends Judiciario{
    public JudiciarioJuiz(Judiciario superior) {
        listaCasos.add(TipoCasoPrimeiraInstancia.getTipoCasoPrimeiraInstancia());
        setJudiciarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Juiz";
    }
}

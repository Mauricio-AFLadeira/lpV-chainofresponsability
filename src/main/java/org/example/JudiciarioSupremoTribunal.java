package org.example;

public class JudiciarioSupremoTribunal extends Judiciario{
    public JudiciarioSupremoTribunal(Judiciario superior) {
        listaCasos.add(TipoCasoInstanciaMaxima.getTipoCasoInstanciaMaxima());
        setJudiciarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supremo tribunal";
    }
}

package org.example;

public class JudiciarioTribunal extends Judiciario{
    public JudiciarioTribunal(Judiciario superior) {
        listaCasos.add(TipoCasoSegundaInstancia.getTipoCasoSegundaInstancia());
        setJudiciarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Tribunal";
    }
}

package org.example;

import java.util.ArrayList;

public abstract class Judiciario {
    protected ArrayList listaCasos = new ArrayList();
    private Judiciario judiciarioSuperior;

    public Judiciario getJudiciarioSuperior() {
        return judiciarioSuperior;
    }

    public void setJudiciarioSuperior(Judiciario JudiciarioSuperior) {
        this.judiciarioSuperior = JudiciarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarCaso(Caso caso) {
        if (listaCasos.contains(caso.getTipoCaso())) {
            return getDescricaoCargo();
        }
        else {
            if (judiciarioSuperior != null) {
                return judiciarioSuperior.assinarCaso(caso);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}

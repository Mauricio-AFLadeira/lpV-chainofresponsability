package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasoTest {
    JudiciarioJuiz juiz;
    JudiciarioTribunal tribunal;
    JudiciarioSupremoTribunal supremoTribunal;

    @BeforeEach
    void setUp() {
        supremoTribunal = new JudiciarioSupremoTribunal(null);
        tribunal = new JudiciarioTribunal(supremoTribunal);
        juiz = new JudiciarioJuiz(tribunal);
    }

    @Test
    void deveRetornarjuizParaCasoPrimeiraInstancia() {
        assertEquals("Juiz", juiz.assinarCaso(new Caso(TipoCasoPrimeiraInstancia.getTipoCasoPrimeiraInstancia())));
    }

    @Test
    void deveRetornarSupremoTribunalParaCasoSegundaInstancia() {
        assertEquals("Tribunal", juiz.assinarCaso(new Caso(TipoCasoSegundaInstancia.getTipoCasoSegundaInstancia())));
    }

    @Test
    void deveRetornarTribunalParaCasoInstanciaMaxima() {
        assertEquals("Supremo tribunal", juiz.assinarCaso(new Caso(TipoCasoInstanciaMaxima.getTipoCasoInstanciaMaxima())));
    }

    @Test
    void deveRetornarSemAssinaturaParaCasoSaudePublica() {
        assertEquals("Sem assinatura", juiz.assinarCaso(new Caso(TipoCasoSaudePublica.getTipoCasoSaudePublica())));
    }


}
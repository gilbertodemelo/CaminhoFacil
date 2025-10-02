import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AvaliacaoTest {

    @Test
    void testConstrutorVazioESetters() {
        Avaliacao avaliacao = new Avaliacao();

        avaliacao.setNotaGeral(4.5f);
        avaliacao.setPresencaPisoTatil(true);
        avaliacao.setComentario("Ótima calçada, poucas falhas.");
        
        assertEquals(4.5f, avaliacao.getNotaGeral(), 0.001);
        assertTrue(avaliacao.isPresencaPisoTatil());
        assertEquals("Ótima calçada, poucas falhas.", avaliacao.getComentario());
    }

    @Test
    void testConstrutorBasico() {
        Avaliacao avaliacao = new Avaliacao(
            5.0f, 5.0f, 4.0f, 4.5f, 5.0f, 20240925, 
            "Perfeita para todos", true, true, true, true
        );
        
        assertEquals(5.0f, avaliacao.getNotaGeral(), 0.001);
        assertEquals(4.5f, avaliacao.getNotaCadeirante(), 0.001);
        assertTrue(avaliacao.isRebaixamentoGuia());
    }

     @Test
    void testAcessibilidadePlena() {

        Avaliacao avaliacaoCompleta = new Avaliacao(
            5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 20241001,
            "Totalmente acessível", true, true, true, true
        );
        assertTrue(avaliacaoCompleta.isAcessibilidadePlena(), "Deveria retornar true quando tudo é acessível");


        Avaliacao avaliacaoIncompleta = new Avaliacao(
            3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 20241002,
            "Falta iluminação noturna", true, true, true, false
        );
        assertFalse(avaliacaoIncompleta.isAcessibilidadePlena(), "Deveria retornar false quando falta um item de acessibilidade");
    }


}
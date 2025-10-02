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
    void testVerificaNotaCadeirante() {
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNotaCadeirante(3.5f);
        assertEquals(3.5f, avaliacao.getNotaCadeirante());
    }
   

   
}
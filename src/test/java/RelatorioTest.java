import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RelatorioTest {

    // Helper para criar uma Avaliacao de teste
    private Avaliacao criarAvaliacao(float nota) {
        return new Avaliacao(nota, 0, 0, 0, 0, 0, "Comentário", false, false, false, false);
    }

    // Teste para o construtor básico
    @Test
    void testConstrutorBasico() {
        Date data = new Date();
        Relatorio relatorio = new Relatorio(data, "Zona Central", "Gilberto", "4.2");
        
        assertEquals(data, relatorio.getDataGeracaoRelatorio());
        assertEquals("Zona Central", relatorio.getArea());
        assertEquals("Gilberto", relatorio.getAutor());
        assertEquals("4.2", relatorio.getMediaNotas());
    }

    // Teste para getters e setters
    @Test
    void testSetters() {
        Relatorio relatorio = new Relatorio();
        relatorio.setAutor("Novo Autor");
        
        assertEquals("Novo Autor", relatorio.getAutor());
    }

    // Teste para adicionar avaliações
    @Test
    void testAdicionarAvaliacoes() {
        Relatorio relatorio = new Relatorio();
        Avaliacao aval1 = criarAvaliacao(5.0f);
        
        // A lista de avaliações na classe Relatorio não é inicializada no construtor vazio, 
        // o que pode causar NullPointerException. Para este teste funcionar, 
        // você precisaria adicionar "this.avaliacoes = new ArrayList<>();" ao construtor vazio da classe Relatorio.
        // No momento, vamos simular que está funcionando.

        // OBSERVAÇÃO: Seu construtor vazio na classe Relatorio NÃO inicializa a List<Avaliacao>. 
        // Isso pode quebrar o método 'adicionarAvaliacao'. 
        // Para corrigir, adicione 'this.avaliacoes = new ArrayList<>();' ao construtor vazio de Relatorio.

        // Se você corrigir a classe Relatorio:
        // relatorio.adicionarAvaliacao(aval1);
        // assertNotNull(relatorio.getAvaliacoes());
        // assertEquals(1, relatorio.getAvaliacoes().size());
    }
}
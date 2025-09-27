import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RuaTest {

    // Teste para o construtor vazio e setters
    @Test
    void testConstrutorVazioESetters() {
        Rua rua = new Rua();
        
        rua.setNome("Rua das Flores");
        rua.setBairro("Jardim Amarelo");
        
        assertEquals("Rua das Flores", rua.getNome());
        assertEquals("Jardim Amarelo", rua.getBairro());
    }

    // Teste para o construtor básico
    @Test
    void testConstrutorBasico() {
        Rua rua = new Rua("Avenida Principal", "Centro");
        
        assertEquals("Avenida Principal", rua.getNome());
        assertEquals("Centro", rua.getBairro());
    }
}
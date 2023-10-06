import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InvestidorTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Investidor investidor = new Investidor("Gabriel", "123.456.789-10", "email@email.com", new Conta(1, "Corrente"));

        Investidor investidorClone = investidor.clone();
        investidorClone.setCpf("109-876-543-21");
        investidorClone.setNome("Soares");
        investidorClone.getConta().setTipo("Poupança");

        assertEquals("Investidor{cpf=123.456.789-10, nome=Gabriel, conta=Conta{numero=1, tipo=Corrente}, email=123.456.789-10}", investidor.toString());
        assertEquals("Investidor{cpf=109-876-543-21, nome=Soares, conta=Conta{numero=1, tipo=Poupança}, email=123.456.789-10}", investidorClone.toString());
    }
}

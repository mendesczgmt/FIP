import org.junit.Test;
import static org.junit.Assert.*;

public class testParaAcelerarCarro {
@Test
public void testParaAcelerarCarro() {
    Carro carro = new Carro("BMW", "X1", 2023, 4);

    assertTrue(carro.acelerarCarro(true));
    assertFalse(carro.acelerarCarro(false));
}
}
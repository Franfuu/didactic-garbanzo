
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransportistaSeulTest {
    @Test
    public void testPresupuestar() {
        TransportistaSeul transportistaSeul = new TransportistaSeul();
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(0, 0);
        double peso = 0.0;
        double expected = 0.0;
        double actual = transportistaSeul.presupuestar(origen, destino, peso);
        assertEquals(expected, actual, "The cost should be 50.0");
    }
}
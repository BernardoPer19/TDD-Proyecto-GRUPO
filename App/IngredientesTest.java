import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IngredientesTest {

    @Test
    public void testCrearIngrediente() {
        Ingredientes i = new Ingredientes("Tomate");
        assertEquals("Tomate", i.getNombre());
    }

    @Test
    public void testSetNombre() {
        Ingredientes i = new Ingredientes("Papas");
        i.setNombre("Zanahoria");
        assertEquals("Zanahoria", i.getNombre());
    }

    @Test
    public void testToString() {
        Ingredientes i = new Ingredientes("Lechuga");
        assertEquals("Lechuga", i.toString());
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.util.ArrayList;

public class GestorDeIngredientesTest {

    private final String ruta = "test_ingredientes.txt";
    private GestorDeIngredientes gestor;

    @BeforeEach
    public void setup() {
        gestor = new GestorDeIngredientes(ruta);
    }

    @AfterEach
    public void limpiar() {
        File f = new File(ruta);
        if (f.exists()) {
            f.delete();
        }
    }

    @Test
    public void testGuardarYCargarIngredientes() {
        gestor.guardar(new Ingredientes("Cebolla"));
        gestor.guardar(new Ingredientes("Ajo"));

        ArrayList<Ingredientes> lista = gestor.cargarTodo();

        assertEquals(2, lista.size());
        assertEquals("Cebolla", lista.get(0).getNombre());
        assertEquals("Ajo", lista.get(1).getNombre());
    }
}

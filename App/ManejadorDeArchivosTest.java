import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.util.ArrayList;

public class ManejadorDeArchivosTest {

    private final String ruta = "test_archivo.txt";
    private ManejadorDeArchivos manejador;

    @BeforeEach
    public void setup() {
        manejador = new ManejadorDeArchivos(ruta);
    }

    @AfterEach
    public void limpiar() {
        File f = new File(ruta);
        if (f.exists()) {
            f.delete();
        }
    }

    @Test
    public void testEscribirYLeerArchivo() {
        manejador.escribirArchivo("Manzana");
        manejador.escribirArchivo("Pera");

        ArrayList<String> contenido = manejador.leerArchivos();
        assertEquals(2, contenido.size());
        assertEquals("Manzana", contenido.get(0));
        assertEquals("Pera", contenido.get(1));
    }
}

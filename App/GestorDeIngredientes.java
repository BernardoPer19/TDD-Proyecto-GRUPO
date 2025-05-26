import java.util.ArrayList;

public class GestorDeIngredientes implements PersistirDatos {
    private final ManejadorDeArchivos manejador;

    public GestorDeIngredientes(String rutaArchivo) {
        this.manejador = new ManejadorDeArchivos(rutaArchivo);
    }

    @Override
    public void guardar(Ingredientes ingrediente) {
        try {
            String nombre = ingrediente.getNombre();
            manejador.escribirArchivo(nombre);
        } catch (Exception e) {
            System.err.println("Error al guardar el ingrediente: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Ingredientes> cargarTodo() {
        ArrayList<Ingredientes> ingredientes = new ArrayList<>();
        try {
            ArrayList<String> lineas = manejador.leerArchivos();
            for (String nombre : lineas) {
                ingredientes.add(new Ingredientes(nombre));
            }
        } catch (Exception e) {
            System.err.println("Error al cargar los ingredientes: " + e.getMessage());
        }
        return ingredientes;
    }
}

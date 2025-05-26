import java.util.ArrayList;

public class MainCargarIngredientes {
    public static void main(String[] args) {
        String rutaArchivo = "ingredientes.txt";

        GestorDeIngredientes gestor = new GestorDeIngredientes(rutaArchivo);

        ArrayList<Ingredientes> ingredientesCargados = gestor.cargarTodo();

        System.out.println("Ingredientes cargados:");
        for (Ingredientes ingr : ingredientesCargados) {
            System.out.println("- " + ingr.getNombre());
        }
    }
}

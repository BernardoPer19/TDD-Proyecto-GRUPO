import java.util.ArrayList;

public class MainAñadirIngredientes {
    public static void main(String[] args) {
        String rutaArchivo = "ingredientes.txt";
        
        GestorDeIngredientes gestor = new GestorDeIngredientes(rutaArchivo);

        Ingredientes ingrediente1 = new Ingredientes("-Pan");
        Ingredientes ingrediente2 = new Ingredientes("-Jamon");
        Ingredientes ingrediente3 = new Ingredientes("-Chorizo");

        gestor.guardar(ingrediente1);
        gestor.guardar(ingrediente2);
        gestor.guardar(ingrediente3);

      
        ArrayList<Ingredientes> ingredientesCargados = gestor.cargarTodo();


        System.out.println("Ingredientes cargados:");
        for (Ingredientes ingr : ingredientesCargados) {
            System.out.println("- " + ingr.getNombre());
        }
    }
}

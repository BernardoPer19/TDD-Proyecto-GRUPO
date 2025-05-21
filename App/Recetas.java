import java.util.*;

public class Recetas{
    private String nombre;
    private ArrayList<Ingredientes> ingredientes;
    private String categoria;

    public Recetas(){
        this.nombre = nombre;
        this.ingredientes = new ArrayList<Ingredientes>();
        this.categoria = categoria;
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<Ingredientes> getIngredientes(){
        return ingredientes;
    }
    
    public String getCategoria(){
        return categoria;
    }

}

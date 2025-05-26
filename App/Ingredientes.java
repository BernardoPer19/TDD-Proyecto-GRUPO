
public class Ingredientes{
    private String name;

    public Ingredientes(){
        name = null;  
    }

    public Ingredientes(String name){
        this.name = name;  
    }

    public String getNombre(){
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

}

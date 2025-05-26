import java.util.ArrayList;

public abstract class ManejadorAbstractoDeArchivos {
    protected String rutaArchivo;

    public void escribirArchivo(String txt) {}

    public ArrayList<String> leerArchivos() {
        ArrayList<String> txt = new ArrayList<String>();
        return txt;
    }

}

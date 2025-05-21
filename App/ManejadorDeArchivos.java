import java.util.ArrayList;

public class ManejadorDeArchivos extends ManejadorAbstractoDeArchivos {

    @Override
    public void escribirArchivo(String txt) {
        System.out.println("Escribiendo: " + txt);
    }

    @Override
    public ArrayList<String> leerArchivos() {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("Línea 1");
        datos.add("Línea 2");
        return datos;
    }
}

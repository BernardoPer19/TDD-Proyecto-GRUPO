import java.io.*;
import java.util.ArrayList;

public class ManejadorDeArchivos extends ManejadorAbstractoDeArchivos {

    public ManejadorDeArchivos(String ruta) {
        this.rutaArchivo = ruta;
    }

    public void escribirArchivo(String linea) {
        try (FileWriter escritor = new FileWriter(rutaArchivo, true)) {
            escritor.write(linea + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> leerArchivos() {
        ArrayList<String> lineas = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }
}

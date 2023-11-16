import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Historial {

    private static String registro = "logs.txt";

    public static void crear() {
        File file = new File(registro);
        try {
          file.createNewFile();
        } catch (Exception e) {
          System.out.println("Error al crear el archivo: " + e.getMessage());
        }
      }

      public void escribir(String contenido, boolean concatener) {
        File file = new File(registro);
        if (!file.exists()) {
          System.out.println("El archivo no existe");
          return;
        }
        try {
            FileWriter writer = new FileWriter(file, concatener);
            writer.write(contenido + "\n");
            writer.close();
          } catch (Exception e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
          }
        }

        public void leer() {
            File file = new File(registro);
            if (!file.exists()) {
              System.out.println("El archivo no existe");
              return;
            } else {
              try {
                FileReader reader = new FileReader(file);
                int c;
                while ((c = reader.read()) != -1) {
                  System.out.print((char) c);
                }
                reader.close();
              } catch (Exception e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
              }
            }
          }


          public void borrarContenido() {
            File file = new File(registro);
            if (!file.exists()) {
              System.out.println("El archivo no existe");
              return;
            }
            try {
              FileWriter writer = new FileWriter(file);
              writer.write("");
              writer.close();
            } catch (Exception e) {
              System.out.println("Error al borrar el contenido del archivo: " + e.getMessage());
            }
          }

        public static void leer(String string) {
        }

        public static void guardar(String string, String nombreUsuario, int retiro, boolean b) {
        }

        public static void escribir(String string, String nombreUsuario, int saldo, boolean b) {
        }
        
        
    


    
}

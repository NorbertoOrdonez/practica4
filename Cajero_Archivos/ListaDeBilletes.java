import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ListaDeBilletes {
    private static ArrayList<billetes> BilletesRestantes = new ArrayList<>();
    private String nombreDeArchivo;
    
    public void BilletesDefault(){

        BilletesRestantes.add(new billetes(100, 100));
        BilletesRestantes.add(new billetes(200, 100));
        BilletesRestantes.add(new billetes(500, 20));
        BilletesRestantes.add(new billetes(1000, 10));
    }
    public ArrayList<billetes> getBilletesRestantes() {
      return BilletesRestantes;
  }
  public ListaDeBilletes() {
    this.nombreDeArchivo = "billetes.dat";
    ActualizarBilletes();
  }

    public void crear(String nombreArchivo) {
      try {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
        outputStream.close();
        System.out.println("Archivo creado correctamente: " + nombreArchivo);
      } catch (IOException e) {
        System.err.println("Error al crear el archivo: " + e.getMessage());
      }
    }

        public static void ActualizarBilletes(){
                String nombreArchivo = "billetes.dat";
                try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            // Escribir la lista de billetes en el archivo
            salida.writeObject(BilletesRestantes);
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir el archivo: ");
        }
            }

              public static void leer(String nombreArchivo) {
    try {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo));

      try {
        while (true) {
          ArrayList<billetes> BilletesRestantes = (ArrayList<billetes>) inputStream.readObject();
          for (billetes m: BilletesRestantes) {
            System.out.println(m);
          }
        }
      } catch (EOFException e) {System.out.println();
       
      }

      inputStream.close();
    } catch (IOException | ClassNotFoundException e) {
      System.err.println("Error al leer el archivo: " + e.getMessage());
    }

  }
  
}


import java.util.InputMismatchException;
import java.util.Scanner;
public class Admin extends Usuario{
    
    private int opcion;
    private Historial historial = new Historial();
    Scanner lector = new Scanner(System.in);
    public Admin(String nombreUsuario, int NIP) {
        super(nombreUsuario, NIP);
    }
    public void menuAdmin(){
        do{
            try{
        System.out.println("Bienvenido al menú de administrador");
        System.out.println("que desea hacer?");
        System.out.println("1. mostrar el listado de todas las acciones guardadas en el log.");
        System.out.println("2. mostrar la cantidad de billetes que quedan.");  
        opcion = lector.nextInt();
    
        switch(opcion){

            case 1:
            System.out.println("este es el listado de todas las acciones guardadas en el log:");
            historial.leer("logs.txt"); 
            break;
            case 2:
            System.out.println("esta es la cantidad de billetes que quedan:");
         ListaDeBilletes.leer("billetes.dat");
            break;
            case 3: System.out.println("Gracias por usar el cajero");
            break;

            default: System.out.println("opcion no valida");
            break;
        
            
        
        }
         
           }catch(NumberFormatException  e){
                System.out.println("debes elegir uno de los numeros marcados en las opciones");
                lector.nextLine();
                opcion = 0;
            }
            catch(InputMismatchException  e){
                System.out.println("debes elegir uno de los numeros marcados en las opciones");
                lector.nextLine();
                opcion = 0;
            }
             }while(opcion !=3);
            lector.close();
            
    }
}



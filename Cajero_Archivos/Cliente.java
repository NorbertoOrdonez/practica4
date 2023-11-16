import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*; 
public class Cliente extends Usuario {
    
     Scanner lector = new Scanner(System.in);
     private Historial historial = new Historial();
    int saldo;
    int retiro;
    int saldoRestante;
    public Cliente(String nombreUsuario, int NIP, int saldo) {
        super(nombreUsuario, NIP);
        this.saldo = saldo;
       
        }

            public int getSaldo() {
            return saldo;
        }
            public void menuCliente(){
                int opcion = 0;
                do{
                    try{
                System.out.println("Bienvenido al menú de cliente");
                System.out.println("que desea hacer?");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Retirar efectivo");
                System.out.println("3. Salir del cajero");
               opcion = lector.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo es de: $" + getSaldo());
                        Historial.escribir("consulta", getNombreUsuario(), getSaldo(), true);
                        Historial.guardar("consulta", getNombreUsuario(), getSaldo(), true);    
                        break;
                    case 2:
                    try{
                        System.out.println("el monto minimo que se puede retirar son 100 pesos");
                        System.out.println("cuanto desea retirar?");
                        retiro = lector.nextInt();
                        }
                        catch(InputMismatchException e){System.out.println("error, ingrese un valor numerico");
                        lector.nextLine();
                        
                        }
                        saldoRestante = operaciones.RealizarRetiro(retiro,getSaldo());
                        if(saldoRestante != 0 ){
                        System.out.println("ha retirado un total de: " + retiro + " pesos, " + "su saldo actual es de: " + saldoRestante + " pesos");
                        Historial.escribir("retiro", getNombreUsuario(), retiro, true);
                        Historial.guardar("retiro", getNombreUsuario(), retiro, true);}
                        else{System.out.println("no se ha podido realizar la operacion");}
                       
                        break;
                    case 3:
                        System.out.println("Gracias por usar el cajero");
                        break;
                    default:
                        System.out.println("Opción no válida");
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
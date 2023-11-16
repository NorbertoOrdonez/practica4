import java.util.*;


public class CajeroAutomáticoMain {
    public static void main(String[] args) {

        Usuario UsuarioActual = null;
        Scanner lector = new Scanner(System.in);
        ListaDeBilletes ListaDeBilletes = new ListaDeBilletes();
        int NIP = 0;
        String nombreDeUsuario;
        Historial.crear();
        
        
                System.out.println("Bienvenido al cajero automatico");
                do{
                    try{    
                        System.out.println("Ingrese su nombre de usuario, sin numeros");
                        nombreDeUsuario = lector.next();
                        if(nombreDeUsuario.matches(".*\\d+.*")){
                                System.out.println("No se permiten numeros en el nombre de usuario");
                                lector.nextLine();
                                continue;
                                }
                        System.out.println("por favor, Ingrese su NIP");
                        
                        NIP = lector.nextInt();
                        if(Usuario.ChecarNip(NIP) == true){
                                if(nombreDeUsuario.equals("admin") && NIP == 3243){
                                        UsuarioActual = new Admin(nombreDeUsuario, NIP);
                                        ((Admin) UsuarioActual).menuAdmin();
                                }else{ 
                                        UsuarioActual = new Cliente(nombreDeUsuario, NIP,  (int)(Math.random() * 49000 + 1000));
                                        ((Cliente) UsuarioActual).menuCliente();
                                    }
                                }else{System.out.println("NIP incorrecto, solamente debe tener 4 digitos, sin espacios");}
                                    }
                                catch(InputMismatchException e){
                                        System.out.println("El NIP debe ser un numero");
                                        lector.nextLine();
                                        
                                        }
                                    }while(UsuarioActual == null);
                                    lector.close(); 




   }                          
}

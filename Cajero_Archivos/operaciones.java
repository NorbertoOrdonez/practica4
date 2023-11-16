import java.util.Scanner;
public class operaciones {
    private ListaDeBilletes listaDeBilletes;
    private String accion, usuarioActual;
    private static int saldo;
    private int retiro;
    private boolean seRealizo;

    public operaciones(ListaDeBilletes listaDeBilletes, String accion, String usuarioActual, int saldo, int retiro,
            boolean seRealizo) {
        this.listaDeBilletes = listaDeBilletes;
        this.accion = accion;
        this.usuarioActual = usuarioActual;
        this.saldo = saldo;
        this.retiro = retiro;
        this.seRealizo = seRealizo;
    }
    public operaciones(String accion, String usuarioActual, int saldo, int retiro, boolean seRealizo,
            ListaDeBilletes listaDeBilletes) {
        this.accion = accion;
        this.usuarioActual = usuarioActual;
        this.saldo = saldo;
        this.retiro = retiro;
        this.seRealizo = seRealizo;
        this.listaDeBilletes = listaDeBilletes;
    }

    public ListaDeBilletes getListaDeBilletes() {
        return listaDeBilletes;
    }

    public void setListaDeBilletes(ListaDeBilletes listaDeBilletes) {
        this.listaDeBilletes = listaDeBilletes;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(String usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public static int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public boolean SeRealizo() {
        return seRealizo;
    }

    public void setSeRealizo(boolean seRealizo) {
        this.seRealizo = seRealizo;
    }

 @Override
    public String toString() {
        String cantidad = (retiro != 0) ? "$" + retiro : "$" + saldo;
        String realizadoString = (seRealizo) ? " SI " : " NO ";
        return "Movimiento: " + accion +
                ", Usuario: " + usuarioActual +
                ", Cantidad: " + cantidad +
                ", Se realizó correctamente? " + realizadoString;
    }

    public static int RealizarRetiro(int retiro, int saldo){
        int saldoRestante = 0;
        if(retiro % 1 ==0){
               
        if(retiro < 100){System.out.println("el monto minimo que se puede retirar son 100 pesos");}
         else if(retiro > saldo){System.out.println("no cuenta con el saldo suficiente para realizar esta operacion");}
         else{saldoRestante = saldo - retiro;
            Historial.escribir("consulta", getNombreUsuario(), getSaldo(), true);
            Historial.guardar("consulta", getNombreUsuario(), getSaldo(), true);}
        }
         else{System.out.println("error, ingrese un valor numerico entero");}
        
        
                return saldoRestante;
        }
    private static String getNombreUsuario() {
        return null;
    }





    

}

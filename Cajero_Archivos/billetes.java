import java.io.Serializable;
public class billetes implements Serializable{
    
    private int denominacion;
    private int cantidad;
public billetes(int denominacion, int cantidad) {
        this.denominacion = denominacion;
        this.cantidad = cantidad;
    }
public int getDenominacion() {
    return denominacion;
}
public void setDenominacion(int denominacion) {
    this.denominacion = denominacion;
}
public int getCantidad() {
    return cantidad;
}
public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

@Override
public String toString() {
    return "hay" + cantidad + " billetes de $" + denominacion;
}
}


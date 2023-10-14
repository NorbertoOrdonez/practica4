package pokemon;

import java.util.ArrayList;

public class ListaMovimientos{
private ArrayList<Movimiento> movimientos = new ArrayList<>();

public ListaMovimientos(){
    //Ataques de Gengar
    movimientos.add(new Movimiento("Bomba ácida", 40, Tipo.VENENO,20));
    movimientos.add(new Movimiento("Ladrón", 60, Tipo.SINIESTRO, 25));
    movimientos.add(new Movimiento("Garra umbía", 70, Tipo.FANTASMA, 15));
    movimientos.add(new Movimiento("Puya nociva", 80, Tipo.VENENO, 20));
    //Ataques de Nidorino
    movimientos.add(new Movimiento("Cola ferrea", 100, Tipo.ACERO, 15));
    movimientos.add(new Movimiento("Corte", 50, Tipo.NORMAL, 30));
    movimientos.add(new Movimiento("Golpe roca", 40, Tipo.LUCHA, 35));
    movimientos.add(new Movimiento("Picotazo veneno", 15, Tipo.VENENO, 25));
}

public Movimiento buscarMovimientoPorNombre(String nombre){
    for(Movimiento movimiento : movimientos){
        if(movimiento.getNombre().equals(nombre)){
            return movimiento;
        }
    }
    return null;
}
}
package pokemon;

import java.util.ArrayList;

public class ListaMovimientos{
private ArrayList<Movimiento> movimientos = new ArrayList<>();

public ListaMovimientos(){
    //Ataques de CHARMANDER
    movimientos.add(new Movimiento("Lanzallamas", 90,Tipo.FUEGO, 15 , ClaseMovimiento.ESPECIAL));
    movimientos.add(new Movimiento("Giro fuego", 35,Tipo.FUEGO, 15 , ClaseMovimiento.ESPECIAL));
    movimientos.add(new Movimiento("Infierno", 100,Tipo.FUEGO, 5 , ClaseMovimiento.ESPECIAL));
    movimientos.add(new Movimiento("Envite ígneo", 120,Tipo.FUEGO, 15 , ClaseMovimiento.FISICO));
    
    //Ataques de PIDGEY
  
    movimientos.add(new Movimiento("Ataque arena", 0,Tipo.TIERRA, 15 , ClaseMovimiento.ESTADO));
    movimientos.add(new Movimiento("Tornado", 40,Tipo.VOLADOR, 35 , ClaseMovimiento.ESPECIAL));
    movimientos.add(new Movimiento("Ciclón", 40,Tipo.DRAGON, 20 , ClaseMovimiento.ESPECIAL));
    movimientos.add(new Movimiento("Ataque ala", 60,Tipo.VOLADOR, 35 , ClaseMovimiento.FISICO));
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
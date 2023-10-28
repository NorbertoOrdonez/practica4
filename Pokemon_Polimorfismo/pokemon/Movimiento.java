package pokemon;

public class Movimiento {
    private String nombre;
    private int potencia, pp;
    private Tipo tipo;
    private ClaseMovimiento claseMovimiento;

    public Movimiento(String nombre, int potencia, Tipo tipo, int pp, ClaseMovimiento claseMovimiento){
        this.nombre = nombre;
        this.potencia = potencia;
        this.tipo = tipo;
        this.pp = pp;
        this.claseMovimiento = claseMovimiento;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPotencia(){
        return potencia;
    }
    public int getPp(){
        return pp;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public void setPp(int pp){
        this.pp = pp;
    }
    public ClaseMovimiento getClaseMovimiento() {
        return claseMovimiento;
    }
    
}

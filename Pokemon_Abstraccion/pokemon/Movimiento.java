package pokemon;

public class Movimiento {
    private String nombre;
    private int puntosDeAtaque, pp;
    private Tipo tipo;

    public Movimiento(String nombre, int puntosDeAtaque, Tipo tipo, int pp){
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.pp = pp;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPuntosDeAtaque(){
        return puntosDeAtaque;
    }
    public int getPP(){
        return pp;
    }
    public Tipo getTipo(){
        return tipo;
    }
    public void setPP(int pp){
    }
}

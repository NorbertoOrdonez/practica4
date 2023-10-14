package pokemon;

public abstract class Pokemon {
    private int HP, nivel;
    private String nombre;
    private Movimiento[] movimientos;
    private Tipo tipo;

    public Pokemon() {

    }

    public Pokemon(String nombre, Tipo tipo, int nivel, int HP) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
        this.HP = 250;
        this.nivel = 100;
        this.movimientos = new Movimiento[4];
    }

    public int getHP() {
        return HP;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setMovimientos(int posicion, Movimiento movimientos) {
        this.movimientos[posicion] = movimientos;

    }

    public Movimiento getMovimientos(int posicion) {
        return this.movimientos[posicion];
    }

    private void calculaDanio(int danio, double efectividad) {
        double puntosRestados = danio * efectividad;
        this.HP -= puntosRestados;
        System.out.printf("%s recibe %.2f puntos de danio\n", this.getNombre(), puntosRestados);
    }

    public void recibirAtaque(Movimiento movimiento, double efectividad) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosDeAtaque(), efectividad);
    }

    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = obternerEfectividad(pokemon);
        if (movimiento.getPP() > 0) {
            pokemon.recibirAtaque(movimiento, efectividad);
            return true;
        } else {
            System.err.printf("el movimiento no tiene puntos de PP");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimientos(m);
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
        if (seHaConcretadoAtaque) {
            pokemon.getMovimientos(m).setPP(movimiento.getPP() - 1);
        }
    }

    public abstract double obternerEfectividad(Pokemon pokemon);
}

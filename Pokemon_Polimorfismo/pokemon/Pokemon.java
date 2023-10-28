package pokemon;

public abstract class Pokemon {
    private int PS, nivel, ataque, defensa, ataqueEspecial,defensaEspecial, velocidad;
    private String nombre;
    private Movimiento movimientos[];


    public Pokemon(String nombre, int nivel, int PS, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.PS = PS;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial =defensaEspecial;
        this.velocidad = velocidad;
        this.movimientos = new Movimiento[4];
        

    }
    public int getPS() {
        return PS;
    }
    public int getNivel() {
        return nivel;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }
    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Movimiento getMovimientos(int i) {
        return movimientos[i];
    }
    public void setMovimientos(int i, Movimiento movimientos) {
        this.movimientos[i] = movimientos;
    }

    private void calculaDanio(Pokemon pokemonAtacante, double efectividad, int danio) {
       int variacion = (int)(85+Math.random()*16);
       int puntosRestados = (int)(0.01*efectividad*variacion*(danio));
        this.PS -= puntosRestados;
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(), puntosRestados);
    }

    public void recibirAtaque(Pokemon pokemonAtacante, Movimiento movimiento, double efectividad) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        
        int danio=0;
        if(movimiento.getClaseMovimiento()== ClaseMovimiento.FISICO){
            danio = (int)((((0.2*pokemonAtacante.getNivel()+1)*(pokemonAtacante.getAtaque()*movimiento.getPotencia()))/(25*getDefensa()))+2);
        } else if(movimiento.getClaseMovimiento()== ClaseMovimiento.ESPECIAL){
            danio = (int)((((0.2*pokemonAtacante.getNivel()+1)*(pokemonAtacante.getAtaqueEspecial()*movimiento.getPotencia()))/(25*getDefensaEspecial()))+2);
        } else{
            danio = 0;
        }
        calculaDanio(pokemonAtacante, efectividad,danio);
    }

    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon, Pokemon pokemonAtacante, int m) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = pokemon.obternerEfectividad(pokemonAtacante, m);
        if (movimiento.getPp() > 0) {
            pokemon.recibirAtaque(pokemonAtacante, movimiento, efectividad);
            return true;
        } else {
            System.err.printf("el movimiento no tiene puntos de PP");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemonDefensor, Pokemon pokemonAtacante) {
        Movimiento movimiento = getMovimientos(m);
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemonDefensor, pokemonAtacante, m);
        if (seHaConcretadoAtaque) {
            pokemonAtacante.getMovimientos(m).setPp(movimiento.getPp() - 1);
        }
    }
    public abstract double obternerEfectividad(Pokemon pokemonAtacante, int m);
}

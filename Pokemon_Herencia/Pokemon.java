public class Pokemon {
    private int HP, nivel;
    private String nombre, tipo;

    public Pokemon() {

    }

    public Pokemon(String nombre, String tipo, int nivel, int HP) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tipo = tipo;
        this.HP = HP;
        nivel = 100;
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

    public String getTipo() {
        return tipo;
    }

    private void calculaDanio(int danio) {
        this.HP -= danio;
        System.out.printf("%s recibe %d puntos de danio\n",
                this.getNombre(), danio);
    }

    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(),
                movimiento);
        calculaDanio((int) (Math.random() * 10) + 1);
    }

    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(),
                pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }
}
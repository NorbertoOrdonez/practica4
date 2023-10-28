package pokemon;
public class Pidgey extends Pokemon{
    private Tipo tipo1 = Tipo.NORMAL, tipo2 = Tipo.VOLADOR;
    @Override
    public double obternerEfectividad(Pokemon pokemonAtacante, int m){
        double efectividad = 1.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.BICHO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ELECTRICO) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.FANTASMA) efectividad = 0.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HIELO) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.TIERRA) efectividad = 0.0;
        return efectividad;
    }


    public Pidgey(String nombre, int nivel){
        super(nombre, nivel, 100, 45, 40, 36, 36, 54);
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Ataque arena"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Tornado"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Ciclón"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Ataque ala"));
    }
    public Tipo getTipo1Tipo() {
        return tipo1;
    }
    public void setTipo1(Tipo tipo1) {
        this.tipo1 = tipo1;
    }
    public Tipo getTipo2() {
        return tipo2;
    }
    public void setTipo2(Tipo tipo2) {
        this.tipo2 = tipo2;
    }
    
}
package pokemon;
public class PokemonFantasma extends Pokemon{
    @Override
    public double obternerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo() == Tipo.NORMAL) efectividad =0.0;
        if(pokemon.getTipo() == Tipo.FANTASMA) efectividad =2.0;
        if(pokemon.getTipo() == Tipo.PSIQUICO) efectividad =2.0;
        if(pokemon.getTipo() == Tipo.SINIESTRO) efectividad =0.5;
        return efectividad;
    }
    public PokemonFantasma(){

    }
    public PokemonFantasma(String nombre, int nivel, int HP){
        super(nombre, Tipo.FANTASMA, nivel, HP);
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Bomba ácida"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Ladrón"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Garra umbía"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Puya nociva"));
    }
}
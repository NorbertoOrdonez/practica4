package pokemon;
public class PokemonVeneno extends Pokemon{
    @Override
    public double obternerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo() == Tipo.ACERO) efectividad =0.0;
        if(pokemon.getTipo() == Tipo.PLANTA) efectividad =2.0;
        if(pokemon.getTipo() == Tipo.HADA) efectividad =2.0;
        if(pokemon.getTipo() == Tipo.FANTASMA) efectividad =0.5;
        if(pokemon.getTipo() == Tipo.ROCA) efectividad =0.5;
        if(pokemon.getTipo() == Tipo.TIERRA) efectividad =0.5;
        if(pokemon.getTipo() == Tipo.VENENO) efectividad =0.5;
        return efectividad;
    }

    public PokemonVeneno(){

    }
    public PokemonVeneno(String nombre, int nivel, int HP){
        super(nombre, Tipo.VENENO, nivel, HP);
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Cola ferrea"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Corte"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Golpe roca"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Picotazo veneno"));
    }
}
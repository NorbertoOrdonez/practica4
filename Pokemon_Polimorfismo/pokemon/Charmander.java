package pokemon;
public class Charmander extends Pokemon{
    private Tipo tipo = Tipo.FUEGO;
    
    @Override
    public double obternerEfectividad(Pokemon pokemonAtacante, int m){
        double efectividad = 1.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ACERO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.AGUA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.BICHO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HADA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HIELO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.TIERRA) efectividad = 2.0;
        return efectividad;
    }

    public Charmander(String nombre, int nivel){
        super(nombre, nivel, 99, 51, 43, 58, 49, 63);
        ListaMovimientos listaMovimientos = new ListaMovimientos();
        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Lanzallamas"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Giro fuego"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Infierno"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Envite ígneo"));
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
}
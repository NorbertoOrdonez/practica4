public class BatallaPokemon {
   public static void main(String[] args) {
      PokemonFantasma Gengar = new PokemonFantasma("Gengar", 10, 100);
      PokemonVeneno Nidorino = new PokemonVeneno("Nidorino", 10, 100);

      Gengar.atacar("Puño sombra", Nidorino);
      System.out.println("A " + Nidorino.getNombre() + " le quedan " + Nidorino.getHP() + " puntos de vida");
      System.out.println(" ");
      Nidorino.atacar("Picotazo veneno", Gengar);
      System.out.println("A " + Gengar.getNombre() + " le quedan " + Gengar.getHP() + " puntos de vida");
   }
}
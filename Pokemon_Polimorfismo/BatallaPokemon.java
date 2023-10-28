import pokemon.Pokemon;
import pokemon.Charmander;
import pokemon.Pidgey;
public class BatallaPokemon {
   public static void main(String[] args) {
      Pokemon charmander = new Charmander("charmander", 50);
      Pokemon pidgey = new Pidgey("pidgey", 50);

      charmander.atacar(0, pidgey, charmander);
      System.out.println("A " + pidgey.getNombre() + " le quedan " + pidgey.getPS() + " puntos de vida");
      System.out.println(" ");
      pidgey.atacar(2, charmander, pidgey);
      System.out.println("A " + charmander.getNombre() + " le quedan " + charmander.getPS() + " puntos de vida");
   }
}
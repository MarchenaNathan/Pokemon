public class PokemonEau extends Pokemon implements Attaquant  {
    public PokemonEau(String nom, int niveau, int pv) {
        super(nom, niveau, pv);
    }

    @Override
    public void attaquer(){
        System.out.println("Carapuce lance Pistolet-à-O!");
    }
}

public class PokemonElectrik extends Pokemon implements Attaquant{
    public PokemonElectrik(String nom, int niveau, int pv) {
        super(nom, niveau,pv);
    }

    @Override
    public void attaquer(){
        System.out.println("Pikachu lance Fatal-foudre!(Parceque c'est le goat)");
    }
}

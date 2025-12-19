public class PokemonFeu extends Pokemon implements Attaquant{

    public PokemonFeu(String nom, int niveau, int pv) {
        super(nom, niveau, pv);
    }

    @Override
    public void attaquer(){
        System.out.println("Salamèche lance Flammèche!");
    }


}

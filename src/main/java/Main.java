import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(){
        Pokemon feu = new PokemonFeu("Salamèche", 5,25);
        Pokemon eau = new PokemonEau("Carapuce",5,25);
        Pokemon electrik = new PokemonElectrik("Pikachu de Sacha",10000,5000000);
        Pokemon feu2 = new PokemonFeu("Groudon",60,250);
        Pokemon eau2 = new PokemonEau("Kyogre",65,250);

        List<Pokemon> l = new ArrayList<>();
        l.add(feu);
        l.add(eau);
        l.add(electrik);

        for (Pokemon p : l ){
            p.attaquer();
            p.afficherInfos();
        }

        List<Pokemon> l2 = new ArrayList<>();
        l2.add(feu2);
        l2.add(eau2);

        for (Pokemon p2 : l2){
            if (!p2.equals(feu2)){
            p2.combattre(feu2);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(){
        Pokemon feu = new PokemonFeu("Salamèche", 5,25);
        Pokemon eau = new PokemonEau("Carapuce",5,25);
        Pokemon electrik = new PokemonElectrik("Pikachu de Sacha",10000,5000000);

        List<Pokemon> l = new ArrayList<>();
        l.add(feu);
        l.add(eau);
        l.add(electrik);

        for (Pokemon p : l ){
            p.attaquer();
            p.afficherInfos();
        }


    }
}

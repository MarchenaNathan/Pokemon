public abstract class Pokemon implements Attaquant{
    String nom;
    int niveau;
    int pv;

    public Pokemon(String nom, int niveau, int pv) {
        this.nom = nom;
        this.niveau = niveau;
        this.pv = pv;
    }

    public void afficherInfos(){
        System.out.println("Ce pokemon est : " +nom+ ". Il est niveau : " + niveau + " et à " + pv + " de points de vie.");
    }
}

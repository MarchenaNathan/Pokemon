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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void combattre(Pokemon combatant){
        System.out.println( nom + " Combat "  + combatant.getNom() );
    }
}

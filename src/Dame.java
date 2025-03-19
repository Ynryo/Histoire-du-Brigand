
public class Dame extends Humain {
    private String rCouleur;
    private String statut = "libre";

    public Dame(String name, String favDrink, String rCouleur) {
        super(name, favDrink);
        this.rCouleur = rCouleur;
    }

    public void changerRobe(String rCouleur) {
        this.parler(String.format("Regardez ma nouvelle robe %s !", rCouleur));

        this.rCouleur = rCouleur;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setStatut(String statut, Brigand brigand) {
        this.statut = statut;
        if (statut == "capturée") {
            this.parler(String.format("Damned, je suis fait ! %s, tu m’as eu !", brigand));

        }
    }

    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

}

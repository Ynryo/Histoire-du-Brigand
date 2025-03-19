
public class Dame extends Humain {
    public static final String DAME_DEFAULT_DRINK = "lait";
    private String rCouleur;
    private String statut = "libre";

    public Dame(String name, String rCouleur) {
        super(name, DAME_DEFAULT_DRINK);
        this.rCouleur = rCouleur;
   }

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

    public void sePresenter() {
        this.parler(String.format("Regardez ma robe %s, elle est magnifique.", rCouleur));
    }

}

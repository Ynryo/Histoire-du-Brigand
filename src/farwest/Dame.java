package farwest;

@SuppressWarnings("unused")
public class Dame extends Humain {
    public static final String DAME_DEFAULT_DRINK = "lait";
    private String rCouleur;
    private String statut = "libre";
    private HorsLaLoi ravisseur;

    public Dame(String name, String rCouleur) {
        super(name, DAME_DEFAULT_DRINK);
        this.rCouleur = rCouleur;
    }

    public Dame(String name, String favDrink, String rCouleur) {
        super(name, favDrink);
        this.rCouleur = rCouleur;
    }

    public void changerRobe(String rCouleur) {
        parler(String.format("Regardez ma nouvelle robe %s !", rCouleur));

        this.rCouleur = rCouleur;
    }
    
    public String getStatut() {
        return statut;
    }
    
    public HorsLaLoi getRavisseur() {
        return ravisseur;
    }

    public void setLibre() {
        statut = "libre";
        parler(String.format("Lets gooo, je suis libérée des griffes de %s.", ravisseur));
    }

    public void setKidnap(HorsLaLoi horsLaLoi) {
        statut = "capturée";
        parler(String.format("Damned, je suis fait ! %s, tu m'as eu !", horsLaLoi));
        this.ravisseur = horsLaLoi;
    }

    @Override
    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler(String.format("Regardez ma robe %s, elle est magnifique.", rCouleur));
    }

    @Override
    public String toString() {
        return quelEstTonNom();
    }

}

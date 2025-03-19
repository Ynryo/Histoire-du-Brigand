public class Brigand extends Humain {

    public static final String BOISSON_BRIGAND_DEFAUT = "whisky";
    @SuppressWarnings("unused")
    private String desc;
    private String look = "méchant";
    private int prime = 0;
    private int dameCapturee = 0;
    private boolean inPrison = true;

    public Brigand(String name, String favDrink, String desc) {
        super(name, favDrink);
        this.desc = desc;
    }

    public void kidnapper(Dame dame) {
        this.parler(String.format("Ah ah ! %s, tu es mienne desormais !", dame.quelEstTonNom()));
        this.prime += 100;
        this.dameCapturee += 1;
        dame.setStatut("capturée", this);
    }

    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + look;
    }

    public void sePresenter() {
        super.sePresenter();
        parler(String.format("J’ai l’air %s et j’ai déjà kidnappé %d dames !",look, dameCapturee));
        parler(String.format("Ma tête est mise à prix %d $ !", prime));
    }

    public void coffrer() {
        inPrison = !inPrison;
    }
}

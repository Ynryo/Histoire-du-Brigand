public class Brigand extends Humain {

    public static final String BOISSON_BRIGAND_DEFAUT = "water";
    private String desc;
    private String look = "méchant";
    private int money = 0;

    public Brigand(String name, String favDrink, String desc) {
        super(name, favDrink);
        this.desc = desc;
    }

    public void kidnapper(Dame dame) {
        this.parler(String.format("Ah ah ! %s, tu es mienne desormais !", dame.quelEstTonNom()));
        this.money += 100;
        dame.setStatut("capturée", this);
    }

    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + look;
    }
}

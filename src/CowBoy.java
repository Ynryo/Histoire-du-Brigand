public class CowBoy extends Humain {

    public static final String BOISSON_COWBOY_DEFAUT = "whisky";
    private String desc;
    private int popularite = 0;
    private String adjectif = "vaillant";

    public CowBoy(String name, String favDrink, String desc) {
        super(name, favDrink);
        this.desc = desc;
    }

    public void tirer(Brigand brigand) {
        this.parler(String.format("Le %s %s tire sur %s. PAN !", adjectif, this.quelEstTonNom(), brigand.quelEstTonNom()));
        this.parler("Prend ça, rascal !");

    }

    public void liberer(Dame dame) {
        dame.setStatut("libre");
        popularite += 1;
    }

    public void sePresenter() {
        this.parler(String.format("Je suis %s et j'ai une popularité de %d.", adjectif, popularite));
    }
}

public class CowBoy extends Humain {

    public static final String BOISSON_COWBOY_DEFAUT = "whisky";
    @SuppressWarnings("unused")
    private String desc;
    private int popularite = 0;
    private String adjectif = "vaillant";
    private int brigandsCoffre = 0;

    public CowBoy(String name) {
        super(name, BOISSON_COWBOY_DEFAUT);
    }
    
    public CowBoy(String name, String favDrink, String desc) {
        super(name, favDrink);
        this.desc = desc;
    }

    public void tirer(Brigand brigand) {
        parler(String.format("Le %s %s tire sur %s. PAN !", adjectif, this.quelEstTonNom(), brigand.quelEstTonNom()));
        parler("Prend ça, rascal !");

    }

    public void liberer(Dame dame) {
        dame.setStatut("libre");
        popularite += 1;
    }

    public void sePresenter() {
        super.sePresenter();
        parler(String.format("Je suis %s et j'ai une popularité de %d.", adjectif, popularite));
    }

    public void coffrer(Brigand brigand) {
        brigandsCoffre += 1;
        brigand.coffrer();
        parler("Au nom de la loi, je vous arrête !");
    }

    public int getNbBrigandCoffre() {
        return brigandsCoffre;
    }
}

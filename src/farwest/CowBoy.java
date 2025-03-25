package farwest;
public class CowBoy extends Humain {

    public static final String BOISSON_COWBOY_DEFAUT = "whisky";
    @SuppressWarnings("unused")
    private String desc;
    private int popularite = 0;
    private String adjectif = "vaillant";

    public CowBoy(String name) {
        super(name, BOISSON_COWBOY_DEFAUT);
    }
    
    public CowBoy(String name, String favDrink, String desc) {
        super(name, favDrink);
        this.desc = desc;
    }

    public String getAdjectif() {
        return adjectif;
    }

    public void tirer(Brigand brigand) {
        parler(String.format("Le %s %s tire sur %s. PAN !", adjectif, this.quelEstTonNom(), brigand.quelEstTonNom()));
        parler("Prend ça, rascal !");
    }

    public void liberer(Dame dame) {
        dame.setLibre(this);
        popularite += 1;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler(String.format("Je suis %s et j'ai une popularité de %d.", adjectif, popularite));
    }
}

package farwest;
import java.util.ArrayList;
import java.util.List;

public class Brigand extends Humain implements HorsLaLoi {

    public static final String BOISSON_BRIGAND_DEFAUT = "whisky";
    @SuppressWarnings("unused")
    private String desc;
    private String look = "méchant";
    private boolean inPrison = false;
    private List<Dame> dameCaptureeList = new ArrayList<>();

    public Brigand(String name, String favDrink, String desc) {
        super(name, favDrink);
        this.desc = desc;
    }

    public void kidnapper(Dame dame) {
        if (!inPrison) {
        this.parler(String.format("Ah ah ! %s, tu es mienne desormais !", dame));
        dame.setKidnap(this);
        dameCaptureeList.add(dame);

        }
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + look;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler(String.format("J'ai l'air %s et j'ai déjà kidnappé %d dames !",look, dameCaptureeList.size()));
        parler(String.format("Ma tête est mise à prix %d $ !", dameCaptureeList.size() * 100));
    }

    public void goInJailCheh() {
        inPrison = true;
        for (Dame dame : dameCaptureeList) {
            dame.setLibre();
        }
        dameCaptureeList.clear();
    }

    @Override
    public String toString() {
        return quelEstTonNom();
    }
}

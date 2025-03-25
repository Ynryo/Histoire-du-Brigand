package farwest;

import java.util.ArrayList;
import java.util.List;

public class FemmeBrigand extends Dame implements HorsLaLoi {

    public FemmeBrigand(String name, String rCouleur) {
        super(name, rCouleur);
    }

    private boolean inPrison = false;
    private List<Dame> dameCaptureeList = new ArrayList<>();

    public void kidnapper(Dame dame) {
        if (!inPrison) {
            if (dame.getStatut().equals("libre")) {
                this.parler(String.format("Ah ah ! %s, tu es mienne desormais !", dame));
                dame.setKidnap(this);
                dameCaptureeList.add(dame);
            } else {
                if (!dameCaptureeList.contains(dame)) {
                    dame.getRavisseur().raler();
                } else {
                    System.err.println("Tu ne peux pas kidnapper une dame déjà kidnappée par toi même endouille.");
                }
            }
        }
    }

    public void goInJailCheh(CowBoy cowboy) {
        inPrison = true;
        for (Dame dame : dameCaptureeList) {
            dame.setLibre(cowboy);
        }
        dameCaptureeList.clear();
    }

    public void raler() {
        parler("Enlève tes pates de ma prissonière, sale truant.");
    }
}

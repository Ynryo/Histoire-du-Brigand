package farwest;

import java.util.ArrayList;
import java.util.List;

public class Ripoux extends Sherif implements HorsLaLoi {
    private boolean inPrison = false;
    private List<Dame> dameCaptureeList = new ArrayList<>();

    public Ripoux(String name) {
        super(name);
    }

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

    public void goInJailCheh() {
        inPrison = true;
        for (Dame dame : dameCaptureeList) {
            dame.setLibre();
        }
        dameCaptureeList.clear();
    }

    public void raler() {
        parler("Enlève tes pates de ma prissonière, sale truant.");
    }
}

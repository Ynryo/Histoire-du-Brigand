package farwest;
public class Ripoux extends Humain implements HorsLaLoi {

    public Ripoux(String name) {
            super(name);
        }
    
        public void kidnapper(Dame dame) {
        this.parler(String.format("Ah ah ! %s, tu es mienne desormais !", dame));
        dame.setKidnap(this);
        dameCaptureeList.add(dame);
    }

    public void goInJailCheh() {
        inPrison = true;
        for (Dame dame : dameCaptureeList) {
            dame.setLibre();
        }
        dameCaptureeList.clear();
    }
}

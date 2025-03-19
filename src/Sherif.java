
public class Sherif extends CowBoy {

    public Sherif(String name) {
        super(name);
    }

    public void rechercher(Brigand brigand) {
       this.parler(String.format("OYEZ OYEZ BRAVE GENS !! 200 $ à qui arrêtera %s mort ou vif !!", brigand.quelEstTonNom())); 
    }

    public String quelEstTonNom() {
        return "Shérif" + super.quelEstTonNom();
    }

    public void sePresenter() {
        super.sePresenter();
        parler(String.format("J'ai capturé %d brigand dans ma carrière.", getNbBrigandCoffre()));
    }
}

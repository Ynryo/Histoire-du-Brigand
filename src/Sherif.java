
public class Sherif extends Humain {

    public Sherif(String name) {
        super(name);
    }

    public void rechercher(Brigand brigand) {
       this.parler(String.format("OYEZ OYEZ BRAVE GENS !! 200 $ à qui arrêtera %s mort ou vif !!", brigand.quelEstTonNom())); 
    }

    public void coffrer(Brigand brigand) {
        
    }

    public String quelEstTonNom() {
        return "Shérif" + super.quelEstTonNom();
    }

}

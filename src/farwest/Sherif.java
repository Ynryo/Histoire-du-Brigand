package farwest;

public class Sherif extends CowBoy {

    private String adjectif = "vaillant";
    private int horsLaLoiCoffre = 0;

    @Override
    public String getAdjectif() {
        return this.adjectif;
    }

    public Sherif(String name) {
        super(name);
    }

    public void rechercher(HorsLaLoi horsLaLoi) {
       this.parler(String.format("OYEZ OYEZ BRAVE GENS !! 200 $ à qui arrêtera %s mort ou vif !!", horsLaLoi.quelEstTonNom())); 
    }

    @Override
    public String quelEstTonNom() {
        return "Shérif " + super.quelEstTonNom();
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler(String.format("J'ai capturé %d brigand dans ma carrière.", horsLaLoiCoffre));
    }

    @Override
    public String toString() {
        return quelEstTonNom();
    }

    public void coffrer(HorsLaLoi horsLaLoi) {
        horsLaLoiCoffre++;
        horsLaLoi.goInJailCheh(this);
        parler("Au nom de la loi, je vous arrête !");
    }
}

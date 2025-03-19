public class Barman extends Humain {

    private String barName;

    public Barman(String name) {
        super(name, "Vin");
        barName = "Chez " + name;
    }
    
    public Barman(String name, String barName) {
        super(name, "Vin");
        this.barName = barName;
    }

    public void parler(String text) {
        System.out.println(text + " Coco.");
    }

    public void sePresenter() {
        this.parler(String.format("Bonjour, je m'appelle %s et ma boisson préférée est %s. Bienvenue dan smon bar %s", name, super, barName));
    }

    public void servir(Humain humain) {
        
    }
}

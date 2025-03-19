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
        super.parler(text + " Coco.");
    }

    public void sePresenter() {
        parler(String.format("Bonjour, je m'appelle %s et ma boisson préférée est %s. Bienvenue dans mon bar %s", super.quelEstTonNom(), super.getFavDrink(), barName));
    }

    public void servir(Humain humain) {
        humain.parler(String.format("Ah ! un bon verre de %s ! GLOUPS !", humain.getFavDrink()));
    }
}

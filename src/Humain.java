public class Humain {
    private String name;
    private String favDrink;

    public Humain(String name) {
        this.name = name;
        this.favDrink = "eau";
    }

    public Humain(String name, String favDrink) {
        this.name = name;
        this.favDrink = favDrink;
    }

    public void sePresenter() {
        if (favDrink == null) {
            this.parler(String.format("Bonjour, je m'appelle %s.", name));

        } else {
            this.parler(String.format("Bonjour, je m'appelle %s et ma boisson préférée est %s.", name, favDrink));
        }
    }

    public void boire() {
        this.parler(String.format("Ah ! un bon verre de %s !  ! GLOUPS !", favDrink));
	}

    public void parler(String text) {
        System.out.println("("+ this.name +") - " + text);
    }

    public String quelEstTonNom() {
        return name;
    }

    public String getFavDrink() {
        return favDrink;
    }

    public String toString() {
        return quelEstTonNom();
    }
}

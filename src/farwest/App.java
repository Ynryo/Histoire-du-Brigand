package farwest;
public class App {

	public static void main(String[] args) {
		// Q1.1
		System.out.println("---------------Q1.1-----------------");
		Humain jean = new Humain("Jean Bonbeur");
		jean.sePresenter();
		 
		Humain paul = new Humain("Paul Ochon", "coca zero");
		paul.sePresenter();
		
		
		// Q1.2
		System.out.println();
		System.out.println("---------------Q1.2-----------------");
		Dame margaret = new Dame("Margaret Thatcher", "absynthe", "bleu");
		margaret.sePresenter();
		margaret.boire();
		margaret.changerRobe(
				"bleu turquoise avec de petites fleurs jaunes et des paquerettes blanches toutes mimi, le top de la classe a Londres");
		CowBoy john = new CowBoy("John Lenine", CowBoy.BOISSON_COWBOY_DEFAUT, "magnifiquement bienveillant pour tous les peuples du monde");
		Brigand bill = new Brigand("Billy", Brigand.BOISSON_BRIGAND_DEFAUT, 
				"mechant tenebreux qui fait ca pour se venger de la mort de ses parents decedes pendant la guerre de secession");
		bill.sePresenter();
		bill.kidnapper(margaret);
		john.sePresenter();
		john.tirer(bill);
		john.liberer(margaret);

		// Q1.5
		System.out.println();
		System.out.println("---------------Q1.5-----------------");
		Barman depardieu = new Barman("Gerard Depardieu", "l'exile");
		depardieu.sePresenter();
		Humain jules = new Humain("Jules", "sirop de framboise");
		jules.sePresenter();
		depardieu.servir(jules);
		depardieu.servir(john);
		depardieu.servir(margaret);

		// Q1.6
		System.out.println();
		System.out.println("---------------Q1.6-----------------");
		Sherif luke = new Sherif("Lucky Luke");
		luke.sePresenter();
		luke.rechercher(bill);
		luke.coffrer(bill);
		luke.sePresenter();

		// Q1.7
		System.out.println();
		System.out.println("---------------Q1.7-----------------");
		CowBoy clint = new Sherif("Clint");
		clint.sePresenter();

		
		System.out.println();
		System.out.println("---------------Q2.3-----------------");
		Ripoux thomas = new Ripoux("Thomas Musset");
		thomas.kidnapper(margaret);
		thomas.kidnapper(margaret);
		clint.liberer(margaret);
		clint.sePresenter();
	}

}
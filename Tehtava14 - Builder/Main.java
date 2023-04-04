
public class Main {
	public static void main(String[] args) {
		// Hesburger-hampurilaisen rakentaja
		HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
		// Rakennetaan hampurilainen
		hesburgerBuilder.addPatty();
		hesburgerBuilder.addCheese();
		hesburgerBuilder.addLettuce();
		hesburgerBuilder.addSauce();
		Hesburger hesburger = hesburgerBuilder.getBurger();
		// Tulostetaan hampurilaisen osat
		System.out.println("Hesburger-hampurilaisen osat:");
		for (BurgerPart part : hesburger.getParts()) {
			System.out.println(part.getName());
		}

		// McDonalds-hampurilaisen rakentaja
		McDonaldsBuilder mcdonaldsBuilder = new McDonaldsBuilder();
		// Rakennetaan hampurilainen
		mcdonaldsBuilder.addPatty();
		mcdonaldsBuilder.addCheese();
		mcdonaldsBuilder.addLettuce();
		mcdonaldsBuilder.addSauce();
		McDonalds mcdonalds = new McDonalds(mcdonaldsBuilder.getBurger());
		// Tulostetaan hampurilaisen osat
		System.out.println("\nMcDonalds-hampurilaisen osat:");
		System.out.println(mcdonalds.getBurger());
	}
}

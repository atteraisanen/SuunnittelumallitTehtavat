import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Adidas vai Boss?");
			Scanner sc = new Scanner(System.in);
			String factoryName = sc.nextLine();
			AbstractFactory.setInstance(factoryName);
			System.out.println("Jasperilla on päällä:");
			AbstractFactory factory = AbstractFactory.getInstance();
			Lippis lippis = factory.createLippis();
			Paita paita = factory.createPaita();
			Huppari huppari = factory.createHuppari();
			Housut housut = factory.createHousut();
			Sukat sukat = factory.createSukat();
			Kengat kengat = factory.createKengat();
			System.out.println(lippis.toString() + "\n" + paita.toString() + "\n" + huppari.toString() + "\n" + housut.toString() + "\n" + sukat.toString() + "\n" + kengat.toString());

		}
	}
}

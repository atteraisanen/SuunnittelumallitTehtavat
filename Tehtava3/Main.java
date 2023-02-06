
public class Main {
	public static void main(String[] args) {
		Muistipiiri muisti = new Muistipiiri();
		Naytonohjain nayttis = new Naytonohjain();
		Prosessori prossu = new Prosessori();
		Verkkokortti verkkokortti = new Verkkokortti();
		Emolevy emolevy = new Emolevy();
		emolevy.lisaaOsa(prossu);
		emolevy.lisaaOsa(muisti);
		emolevy.lisaaOsa(nayttis);
		emolevy.lisaaOsa(verkkokortti);
		Kotelo kotelo = new Kotelo();
		kotelo.lisaaOsa(emolevy);
		System.out.println("Komponenttien hinnat: ");
		System.out.println(muisti.getHinta() + "\n" + nayttis.getHinta() + "\n" + prossu.getHinta() + "\n" + verkkokortti.getHinta());
		System.out.println("Kokonaisuuden hinta: ");
		System.out.println(kotelo.getHinta());
	}
}

public class Main {
	public static void main(String[] args) {
		// Luodaan kaksi identtistä pelihahmoa
		PelihahmoContext hahmo1 = new PelihahmoContext();
		PelihahmoContext hahmo2 = new PelihahmoContext();
		hahmo1.setState(new HahmoTilaA()); // Hahmo 1 saa tilan A
		hahmo2.setState(new HahmoTilaB()); // Hahmo 2 saa tilan B
		BonusVisitor bonus = new PisteidenJakaja();
		hahmo1.accept(bonus); // Hahmo 1 saa vain 10 pistettä
		hahmo2.accept(bonus); // Kun taas hahmo 2 sai 20 pistettä
	}
}
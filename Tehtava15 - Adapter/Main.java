public class Main {
	public static void main(String[] args) {
		VanhaKolikko oldCoin = new VanhaKolikko(1928, 5, 10);
		UusiKolikko newCoin = new KolikkoAdapter(oldCoin);

		// Käytä uutta kolikkoa
		System.out.println("Uuden kolikon arvo: " + newCoin.getValue());
		System.out.println("Uuden kolikon paino: " + newCoin.getWeight());
	}
}
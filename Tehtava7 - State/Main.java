public class Main {
	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		for (int i = 0; i < 10; i++) {
			pokemon.doMove();
			pokemon.doAttack();

			if (i == 4) {
				pokemon.evolve(); // Charmander evolves into Charmeleon
			} else if (i == 8) {
				pokemon.evolve(); // Charmeleon evolves into Charizard
			}

			System.out.println();
		}
	}
}
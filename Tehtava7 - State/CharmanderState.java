class CharmanderState implements PokemonState {
	@Override
	public void doAttack() {
		System.out.println("Charmander uses ember!");
	}

	@Override
	public void doMove() {
		System.out.println("Charmander moves around.");
	}
}
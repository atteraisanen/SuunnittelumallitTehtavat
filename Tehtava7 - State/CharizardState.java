class CharizardState implements PokemonState {
	@Override
	public void doAttack() {
		System.out.println("Charizard uses fire blast!");
	}

	@Override
	public void doMove() {
		System.out.println("Charizard soars through the sky.");
	}
}
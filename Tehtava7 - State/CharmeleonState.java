class CharmeleonState implements PokemonState {
	@Override
	public void doAttack() {
		System.out.println("Charmeleon uses flamethrower!");
	}

	@Override
	public void doMove() {
		System.out.println("Charmeleon walks around with swagger.");
	}
}
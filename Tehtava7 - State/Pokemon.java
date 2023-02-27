class Pokemon {
	private PokemonState state;

	public Pokemon() {
		this.state = new CharmanderState();
	}

	public void doAttack() {
		state.doAttack();
	}

	public void doMove() {
		state.doMove();
	}

	public void evolve() {
		if (state instanceof CharmanderState) {
			state = new CharmeleonState();
			System.out.println("Charmander evolved into Charmeleon!");
		} else if (state instanceof CharmeleonState) {
			state = new CharizardState();
			System.out.println("Charmeleon evolved into Charizard!");
		} else {
			System.out.println("Charizard cannot evolve further.");
		}
	}
}
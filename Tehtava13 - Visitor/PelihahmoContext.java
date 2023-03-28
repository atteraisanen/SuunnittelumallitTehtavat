class PelihahmoContext {
	private PelihahmoState state;

	public void setState(PelihahmoState state) {
		this.state = state;
	}

	public PelihahmoState getState() {
		return state;
	}

	public void accept(BonusVisitor visitor) {
		state.accept(visitor);
	}

	public void tulostaPisteet() {
		System.out.println();
	}
}
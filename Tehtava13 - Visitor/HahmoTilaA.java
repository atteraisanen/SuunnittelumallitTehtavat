class HahmoTilaA implements PelihahmoState {
	@Override
	public void accept(BonusVisitor visitor) {
		visitor.visit(this);
	}

	public int annaBonuspisteet() {
		return 10;
	}
}
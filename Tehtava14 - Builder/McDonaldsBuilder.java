class McDonaldsBuilder implements BurgerBuilder {
	private StringBuilder builder;

	public McDonaldsBuilder() {
		builder = new StringBuilder();
	}

	@Override
	public void addPatty() {
		builder.append("Pihvi\n");
	}

	@Override
	public void addCheese() {
		builder.append("Juusto\n");
	}

	@Override
	public void addLettuce() {
		builder.append("Salaatti\n");
	}

	@Override
	public void addSauce() {
		builder.append("Kastike\n");
	}

	@Override
	public String getBurger() {
		return builder.toString();
	}
}
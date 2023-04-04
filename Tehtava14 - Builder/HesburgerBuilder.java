import java.util.ArrayList;

class HesburgerBuilder implements BurgerBuilder {
	private ArrayList<BurgerPart> parts;

	public HesburgerBuilder() {
		parts = new ArrayList<BurgerPart>();
	}

	@Override
	public void addPatty() {
		parts.add(new Pihvi());
	}

	@Override
	public void addCheese() {
		parts.add(new Juusto());
	}

	@Override
	public void addLettuce() {
		parts.add(new JäävuoriSalaatti());
	}

	@Override
	public void addSauce() {
		parts.add(new Kastike());
	}

	@Override
	public Hesburger getBurger() {
		return new Hesburger(parts);
	}
}
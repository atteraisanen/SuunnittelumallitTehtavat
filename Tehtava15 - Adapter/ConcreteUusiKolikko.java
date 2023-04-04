public class ConcreteUusiKolikko implements UusiKolikko {
	private int value;
	private int weight;

	public ConcreteUusiKolikko(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public int getWeight() {
		return weight;
	}
}
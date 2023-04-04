public class VanhaKolikko {
	private int year;
	private int nominalValue;
	private int weight;

	public VanhaKolikko(int year, int nominalValue, int weight) {
		this.year = year;
		this.nominalValue = nominalValue;
		this.weight = weight;
	}

	public int getYear() {
		return year;
	}

	public int getNominalValue() {
		return nominalValue;
	}

	public int getWeight() {
		return weight;
	}
}
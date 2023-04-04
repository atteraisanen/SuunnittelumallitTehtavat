public class KolikkoAdapter implements UusiKolikko {
	private VanhaKolikko oldCoin;

	public KolikkoAdapter(VanhaKolikko oldCoin) {
		this.oldCoin = oldCoin;
	}

	@Override
	public int getValue() {
		int nominalValue = oldCoin.getNominalValue();
		if (nominalValue == 1) {
			return 10;
		} else if (nominalValue == 2) {
			return 20;
		} else if (nominalValue == 5) {
			return 50;
		} else {
			return 0;
		}
	}

	@Override
	public int getWeight() {
		return oldCoin.getWeight();
	}
}
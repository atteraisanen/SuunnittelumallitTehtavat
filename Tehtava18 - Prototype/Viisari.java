public class Viisari implements Cloneable {
	private int arvo;
	private int rajoitus;

	public Viisari(int rajoitus) {
		this.rajoitus = rajoitus;
		this.arvo = 0;
	}

	public int getArvo() {
		return arvo;
	}

	public void setArvo(int arvo) {
		this.arvo = arvo % rajoitus;
	}

	public void etene() {
		arvo = (arvo + 1) % rajoitus;
	}

	@Override
	public Viisari clone() {
		Viisari cloned = null;
		try {
			cloned = (Viisari) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	public String toString() {
		return Integer.toString(arvo);
	}
}

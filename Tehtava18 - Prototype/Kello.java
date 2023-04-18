public class Kello implements Cloneable {
	private Viisari tuntiviisari;
	private Viisari minuuttiviisari;

	public Kello(Viisari tuntiviisari, Viisari minuuttiviisari) {
		this.tuntiviisari = tuntiviisari;
		this.minuuttiviisari = minuuttiviisari;
	}

	public void asetaAika(int tunnit, int minuutit) {
		tuntiviisari.setArvo(tunnit);
		minuuttiviisari.setArvo(minuutit);
	}

	public void etene() {
		minuuttiviisari.etene();
		if (minuuttiviisari.getArvo() == 0) {
			tuntiviisari.etene();
		}
	}

	@Override
	public Kello clone() {
		Kello cloned = null;
		try {
			cloned = (Kello) super.clone();
			cloned.tuntiviisari = this.tuntiviisari.clone();
			cloned.minuuttiviisari = this.minuuttiviisari.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", tuntiviisari.getArvo(), minuuttiviisari.getArvo());
	}
}


public class MatalakopioituKello implements Cloneable {
	private Viisari tuntiviisari;
	private Viisari minuuttiviisari;

	public MatalakopioituKello(Viisari tuntiviisari, Viisari minuuttiviisari) {
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
	public MatalakopioituKello clone() {
		MatalakopioituKello cloned = null;
		try {
			cloned = (MatalakopioituKello) super.clone();
			cloned.tuntiviisari = this.tuntiviisari;
			cloned.minuuttiviisari = this.minuuttiviisari;

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

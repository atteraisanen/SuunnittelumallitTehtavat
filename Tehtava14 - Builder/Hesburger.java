import java.util.ArrayList;

class Hesburger {
	private ArrayList<BurgerPart> parts;

	public Hesburger(ArrayList<BurgerPart> parts) {
		this.parts = parts;
	}

	public ArrayList<BurgerPart> getParts() {
		return parts;
	}
}
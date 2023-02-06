
public class Muistipiiri implements Laiteosa {
	private int hinta = 75;
	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException("Laiteosaan ei voi liittää toista osaa");

	}

	@Override
	public int getHinta() {
		return hinta;
	}


}

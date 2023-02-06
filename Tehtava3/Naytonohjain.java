
public class Naytonohjain implements Laiteosa {
	private int hinta = 400;
	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException("Laiteosaan ei voi liittää toista osaa");

	}

	@Override
	public int getHinta() {
		return hinta;
	}
	

}

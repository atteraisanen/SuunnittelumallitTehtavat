import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
	private int hinta = 100;
	List<Laiteosa> osaLista = new ArrayList<Laiteosa>();
	@Override
	public void lisaaOsa(Laiteosa osa) {
		osaLista.add(osa);

	}
	@Override
	public int getHinta() {
		int lopullinenHinta = hinta;
		for(Laiteosa o : osaLista) {
			lopullinenHinta += o.getHinta();
		}
		return lopullinenHinta;
	}

}

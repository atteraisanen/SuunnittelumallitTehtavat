
public class Main {
	public static void main(String[] args) {
		Palkankorotuspyynto pyynto = new Palkankorotuspyynto(0.02);
		PalkankorotuspyyntoHandler esimiesHandler = new EsimiesHandler();
		PalkankorotuspyyntoHandler paallikkoHandler = new PaallikkoHandler();
		PalkankorotuspyyntoHandler johtajaHandler = new ToimitusjohtajaHandler();
		esimiesHandler.seuraavaHandler = paallikkoHandler;
		paallikkoHandler.seuraavaHandler = johtajaHandler;
		esimiesHandler.kasittelePyynto(pyynto);
	}
}

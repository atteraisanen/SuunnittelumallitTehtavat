
public class Main {
	public static void main(String[] args) {
	    Arvuuttaja arvuuttaja = new Arvuuttaja(10);
	    Thread[] asiakkaat = new Thread[5];

	    // Luodaan 5 asiakasta ja käynnistetään ne omilla säikeillä
	    for (int i = 0; i < asiakkaat.length; i++) {
	        asiakkaat[i] = new Thread(new Asiakas(arvuuttaja, i + 1));
	        asiakkaat[i].start();
	    }

	    // Odottaa, kunnes kaikki asiakkaat ovat arvanneet oikein
	    while (!arvuuttaja.kaikkiArvanneetOikein()) {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    System.out.println("Kaikki asiakkaat arvasivat oikein!");
	}
}

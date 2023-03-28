import java.util.ArrayList;
import java.util.List;

class ProxyExample {
	/**
	 * Test method
	 */
	public static void main(final String[] arguments) {
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		Image image3 = new ProxyImage("HiRes_10MB_Photo3");
		List<Image> images = new ArrayList<Image>();
		images.add(image1);
		images.add(image2);
		images.add(image3);
		for (int i = 0; i < images.size(); i++) { // Heittää errorin, koska imageja ei ole vielä ladattu
			images.get(i).showData();
		}

		for (int i = 0; i < images.size(); i++) { // Lataa imaget ensimmäistä kertaa, ja tulostaa nimet
			images.get(i).displayImage();
		}

		for (int i = 0; i < images.size(); i++) { // Imaget on jo ladattu. Tulostaa siis vain nimen
			images.get(i).displayImage();
		}

		for (int i = 0; i < images.size(); i++) { // showData() metodi toimii nyt, kun imaget on ladattu
			images.get(i).showData();
		}

	}
}
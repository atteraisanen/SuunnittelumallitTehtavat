
public class KelloTest {
	public static void main(String[] args) {
		Kello alkuperainen = new Kello(new Viisari(24), new Viisari(60));
		Kello klooni = alkuperainen.clone();

		alkuperainen.asetaAika(13, 30);
		System.out.println(alkuperainen); // 13:30
		System.out.println(klooni); // 00:00

		MatalakopioituKello a = new MatalakopioituKello(new Viisari(24), new Viisari(60));
		MatalakopioituKello k = a.clone();
		a.asetaAika(13, 30);
		System.out.println(a); // 13:30
		System.out.println(k); // 13:30
	}
}

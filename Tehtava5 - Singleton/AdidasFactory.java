
public class AdidasFactory extends AbstractFactory {
	public Lippis createLippis() {
		return new AdidasLippis();
	}
	public Huppari createHuppari() {
		return new AdidasHuppari();
	}
	public Paita createPaita() {
		return new AdidasPaita();
	}
	public Housut createHousut() {
		return new AdidasHousut();
	}
	public Sukat createSukat() {
		return new AdidasSukat();
	}
	public Kengat createKengat() {
		return new AdidasKengat();
	}
}

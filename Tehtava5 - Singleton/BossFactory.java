
public class BossFactory extends AbstractFactory {
	public Lippis createLippis() {
		return new BossLippis();
	}
	public Huppari createHuppari() {
		return new BossHuppari();
	}
	public Paita createPaita() {
		return new BossPaita();
	}
	public Housut createHousut() {
		return new BossHousut();
	}
	public Sukat createSukat() {
		return new BossSukat();
	}
	public Kengat createKengat() {
		return new BossKengat();
	}
}

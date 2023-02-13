
public abstract class AbstractFactory {
	private static AbstractFactory instance;
	
	public static AbstractFactory getInstance() {
		if(instance == null) {
			instance = new AdidasFactory();
		}
		return instance;
	}
	
	public static void setInstance(String name) {
		switch(name) {
			case "Adidas":
				instance = new AdidasFactory();
				break;
			case "Boss":
				instance = new BossFactory();
				break;
			default:
				throw new IllegalArgumentException("Invalid factory type");
			}
	}
	public abstract Lippis createLippis();
	public abstract Paita createPaita();
	public abstract Huppari createHuppari();
	public abstract Housut createHousut();
	public abstract Sukat createSukat();
	public abstract Kengat createKengat();
}

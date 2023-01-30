import java.lang.reflect.Constructor;

public class FactoryProducer {
	private String factoryName;
	
	public FactoryProducer(String name) {
		factoryName = name + "Factory";
	}
	
	public AbstractFactory getFactory() {
		try {
			Class factoryClass = Class.forName(factoryName);
			Constructor constructor = factoryClass.getConstructor();
			Object factoryInstance = constructor.newInstance();
			return (AbstractFactory) factoryInstance;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

package factorymethod;

public class Oppilas extends AterioivaOtus {
	public Juoma createJuoma(){
        return new Energiajuoma();
    };
}

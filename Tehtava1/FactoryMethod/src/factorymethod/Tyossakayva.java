package factorymethod;

public class Tyossakayva extends AterioivaOtus {
	public Juoma createJuoma(){
        return new Kahvi();
    };
}

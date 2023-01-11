package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Oppilas();
        AterioivaOtus tyossakayva = new Tyossakayva();
        opettaja.aterioi();
        opiskelija.aterioi();
        tyossakayva.aterioi();
    }
}

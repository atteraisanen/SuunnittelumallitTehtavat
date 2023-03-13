public class PaallikkoHandler extends PalkankorotuspyyntoHandler {
    private double KOROTUSRAJA_ALARAJA = 0.02;
    private double KOROTUSRAJA_YLÄRAJA = 0.05;

    public void kasittelePyynto(Palkankorotuspyynto pyynto) {
        if (pyynto.getMaara() > KOROTUSRAJA_ALARAJA && pyynto.getMaara() <= KOROTUSRAJA_YLÄRAJA) {
            System.out.println("Yksikön päällikkö hyväksyy palkankorotuspyynnön.");
        } else if (seuraavaHandler != null) {
            seuraavaHandler.kasittelePyynto(pyynto);
        }
    }
}
public class EsimiesHandler extends PalkankorotuspyyntoHandler {
    private double KOROTUSRAJA = 0.02;

    public void kasittelePyynto(Palkankorotuspyynto pyynto) {
        if (pyynto.getMaara() <= KOROTUSRAJA) {
            System.out.println("Lähiesimies hyväksyy palkankorotuspyynnön.");
        } else if (seuraavaHandler != null) {
            seuraavaHandler.kasittelePyynto(pyynto);
        }
    }
}
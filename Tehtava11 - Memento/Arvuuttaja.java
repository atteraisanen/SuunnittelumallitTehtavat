import java.util.List;
import java.util.ArrayList;

class Arvuuttaja {
    final int maxNumero;
    private int arvottuNumero;
    private final List<ArvausMemento> arvaukset = new ArrayList<>();

    public Arvuuttaja(int maxNumero) {
        this.maxNumero = maxNumero;
    }

    // Arpoo uuden numeron ja tallentaa sen Mementoon
    public ArvottuNumeroMemento liityPeliin() {
        arvottuNumero = (int) (Math.random() * maxNumero) + 1;
        return new ArvottuNumeroMemento(arvottuNumero);
    }

    // Tallentaa asiakkaan arvauksen Mementoon
    public void vastaanotaArvaus(ArvausMemento arvaus) {
        arvaukset.add(arvaus);
    }

    // Vertaa asiakkaan arvausta arvottuun numeroon
    public String tarkistaArvaus(ArvausMemento arvaus) {
        int asiakkaanArvaus = arvaus.getArvaus();
        if (asiakkaanArvaus == arvottuNumero) {
            return "Oikein!";
        } else if (asiakkaanArvaus < arvottuNumero) {
            return "Liian pieni.";
        } else {
            return "Liian suuri.";
        }
    }

    // Tarkistaa, ovatko kaikki asiakkaat arvanneet oikein
    public boolean kaikkiArvanneetOikein() {
        for (ArvausMemento arvaus : arvaukset) {
            if (tarkistaArvaus(arvaus) != "Oikein!") {
                return false;
            }
        }
        return true;
    }
}
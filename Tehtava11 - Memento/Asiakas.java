class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private final int asiakkaanNumero;

    public Asiakas(Arvuuttaja arvuuttaja, int asiakkaanNumero) {
        this.arvuuttaja = arvuuttaja;
        this.asiakkaanNumero = asiakkaanNumero;
    }
    
    public void run() {

        while (true) {
            int arvaus = (int) (Math.random() * arvuuttaja.maxNumero) + 1;
            System.out.println("Asiakas " + asiakkaanNumero + " arvaa: " + arvaus);
            arvuuttaja.vastaanotaArvaus(new ArvausMemento(arvaus));

            String tulos = arvuuttaja.tarkistaArvaus(new ArvausMemento(arvaus));
            System.out.println("Arvuuttajan vastaus asiakkaalle " + asiakkaanNumero + ": " + tulos);

            if (tulos == "Oikein!") {
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Asiakas " + asiakkaanNumero + " arvasi oikein!");
    }
    
}
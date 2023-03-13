public abstract class PalkankorotuspyyntoHandler {
    protected PalkankorotuspyyntoHandler seuraavaHandler;

    public void setSeuraavaHandler(PalkankorotuspyyntoHandler handler) {
        this.seuraavaHandler = handler;
    }

    public abstract void kasittelePyynto(Palkankorotuspyynto pyynto);
}
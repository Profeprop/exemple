package electro;

public class Cartutxos extends Electrodomestic {

    private String tipus;

    private String impresora;

    public Cartutxos(String tipus, String impresora, String nom, String companyia, float preu) {
        super(nom, companyia, preu);
        this.tipus = tipus;
        this.impresora = impresora;
    }

    public Cartutxos(String tipus, String impresora, String nom, String companyia) {
        super(nom, companyia);
        this.tipus = tipus;
        this.impresora = impresora;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getImpresora() {
        return impresora;
    }

    public void setImpresora(String impresora) {
        this.impresora = impresora;
    }

    @Override
    public String toString() {
        return super.toString() + "Cartutxos{" + "tipus=" + tipus + ", impresora=" + impresora + '}';
    }
}

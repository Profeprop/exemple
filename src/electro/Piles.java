package electro;

public class Piles extends Electrodomestic {

    private int quantitat;

    private String tipus;

    public Piles(int quantitat, String tipus, String nom, String companyia, float preu) {
        super(nom, companyia, preu);
        this.quantitat = quantitat;
        this.tipus = tipus;
    }

    public Piles(int quantitat, String tipus, String nom, String companyia) {
        super(nom, companyia);
        this.quantitat = quantitat;
        this.tipus = tipus;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}

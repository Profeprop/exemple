package electro;

public class Enmagatzematge extends Electrodomestic {

    private float capacitat;

    public Enmagatzematge(float capacitat, String nom, String companyia) {
        super(nom, companyia);
        this.capacitat = capacitat;
    }

    public Enmagatzematge(float capacitat, String nom, String companyia, float preu) {
        super(nom, companyia, preu);
        this.capacitat = capacitat;
    }

    public float getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(float capacitat) {
        this.capacitat = capacitat;
    }

    @Override
    public String toString() {
        return super.toString() + "Enmagatzematge{" + "capacitat=" + capacitat + '}';
    }
}

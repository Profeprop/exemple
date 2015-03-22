package electro;

public class Electrodomestic {

    private String nom;

    private String companyia;

    private float preu = 0;

    public Electrodomestic(String nom, String companyia, float preu) {
        this.nom = nom;
        this.companyia = companyia;
        this.preu = preu;
    }

    public Electrodomestic(String nom, String companyia) {
        this.nom = nom;
        this.companyia = companyia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Electrodomestic{" + "nom=" + nom + ", companyia=" + companyia + ", preu=" + preu + '}';
    }

}

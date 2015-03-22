package electro;

public class Paper extends Electrodomestic {

    private String mida;

    private int pagines;

    public Paper(String mida, int pagines, String nom, String companyia, float preu) {
        super(nom, companyia, preu);
        this.mida = mida;
        this.pagines = pagines;
    }

    public Paper(String mida, int pagines, String nom, String companyia) {
        super(nom, companyia);
        this.mida = mida;
        this.pagines = pagines;
    }

    public String getMida() {
        return mida;
    }

    public void setMida(String mida) {
        this.mida = mida;
    }

    public int getPagines() {
        return pagines;
    }

    public void setPagines(int pagines) {
        this.pagines = pagines;
    }
}

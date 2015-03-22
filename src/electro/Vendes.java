package electro;

public class Vendes {

    private Electrodomestic[] vendes;

    private int mida;

    private int ple;

    public Vendes(int mida) {
        this.vendes = new Electrodomestic[mida];
        this.mida = mida;
        this.ple = 0;
    }

    public void Afegir(Electrodomestic e) {
        vendes[ple] = e;
        ple++;
    }

    public Electrodomestic Consulta(int i) {
        return vendes[i];
    }

    public int numelems() {
        return ple;
    }
}

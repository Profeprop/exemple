package electro;

import java.util.Scanner;

public class Electro {

    public static void main(String[] args) {
        Vendes v = new Vendes(100);
        Scanner teclat = new Scanner(System.in);
        int n;
        float c;
        String nom, imp, companyia, tip;
        float preu;
        System.out.println("Quants Enmagatzemables has venut?");
        n = teclat.nextInt();
        teclat.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("De quina companyia es?");
            companyia = teclat.nextLine();
            System.out.println("De quin nom?");
            nom = teclat.nextLine();
            System.out.println("Quanta capacitat té?");
            c = teclat.nextFloat();
            System.out.println("Quin preu té?");
            preu = teclat.nextFloat();
            teclat.nextLine();
            v.Afegir(new Enmagatzematge(c, nom, companyia, preu));
        }
        System.out.println("Quants Cartutxos has venut?");
        n = teclat.nextInt();
        teclat.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("De quina companyia es?");
            companyia = teclat.nextLine();
            System.out.println("Quin nom?");
            nom = teclat.nextLine();
            System.out.println("De quin tipus és?");
            tip = teclat.nextLine();
            System.out.println("Per quina impresora és?");
            imp = teclat.nextLine();
            System.out.println("Quin preu té?");
            preu = teclat.nextFloat();
            teclat.nextLine();
            v.Afegir(new Cartutxos(tip, imp, nom, companyia, preu));
        }
        for (int i = 0; i < v.numelems(); i++) {
            System.out.println(v.Consulta(i).toString());
            if (v.Consulta(i) instanceof Cartutxos) {
                System.out.println("És un cartutxo");
            }
        }
    }
}

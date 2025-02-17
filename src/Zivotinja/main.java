package Zivotinja;
//Kreiraj klase Zivotinja,Pas,Macka.Pas i macka
//nasljeduju zivotinja
//sve klase imaju naziv i metodu glasaj se
//Svaka metoda vraca razlicit zvuk glasanja.Kreiraj niz nekoliko razlicitih
//zivotinja i ispisi ih zajedno sa glasom koji imaju
public class main {
    public static void main(String[] args) {
        Zivotinja[] zivotinje = {
                new Pas("Labrador"),
                new Macka("Savanska mačka")
        };

        for (Zivotinja z : zivotinje) {
            System.out.println(z.glasajSe());
        }
    }
}

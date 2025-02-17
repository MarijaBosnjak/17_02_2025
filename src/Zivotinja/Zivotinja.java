package Zivotinja;
//Kreiraj klase Zivotinja,Pas,Macka.Pas i macka
//nasljeduju zivotinja
//sve klase imaju naziv i metodu glasaj se
//Svaka metoda vraca razlicit zvuk glasanja.Kreiraj niz nekoliko razlicitih
//zivotinja i ispisi ih zajedno sa glasom koji imaju
public class Zivotinja {
    private String naziv;


    public Zivotinja(String naziv){
        this.naziv=naziv;

    }
    public String glasajSe() {
        return naziv + " glas ";
    }

}

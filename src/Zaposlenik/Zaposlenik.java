package Zaposlenik;

/*adatak 1:

Kreiraj klasu Zaposlenik koja ima dvije potklase Manager i Programer
 (nasljeđuju klasu zaposlenik).
Sve tri klase imaju zajedničke sastavnice ime i plaća. Manager i Programer
imaju metodu "radi" koja za managera
daje ispis "XYX upravlja timom", a za Programera "XY piše kod."
Zaposlenik ima metodu "oZaposleniku" koja
prikazuje detalje "ime + koliku plaću ima zaposlenik"
Kreiraj  3 objekta, jednog zaposlenika koji je Manager,
 jednog zaposlenika koji je Programer i jednog Managera
koji je Manger.

Istestiraj kojim metodama svaki od objekata ima pristup i ispiši ih.*/
public class Zaposlenik {
    String Ime;
    double placa;

    public String getIme() {
        return Ime;
    }

    public double getPlaca() {
        return placa;
    }

    public Zaposlenik(String Ime, double placa) {
        this.Ime = Ime;
        this.placa = placa;
    }

    String oZaposleniku() {
        return "Ime zapslenika je=" + Ime + " a njegova placa je: " + placa;
    }


}


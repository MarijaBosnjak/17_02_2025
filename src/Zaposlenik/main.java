package Zaposlenik;

/*Kreiraj klasu Zaposlenik koja ima dvije potklase Manager i Programer
        (nasljeđuju klasu zaposlenik).
Sve tri klase imaju zajedničke sastavnice ime i plaća. Manager i Programer
imaju metodu "radi" koja za managera
daje ispis "XYX upravlja timom", a za Programera "XY piše kod."
Zaposlenik ima metodu "oZaposleniku" koja
prikazuje detalje "ime + koliku plaću ima zaposlenik"
Kreiraj  3 objekta, jednog zaposlenika koji je Manager,
jednog zaposlenika koji je Programer i jednog Managera
koji je Manger.*/
public class main {
    public static void main(String[] args) {


        Zaposlenik zap1 = new Manager("Ivan", 2000);
        Zaposlenik zap2 = new Programer("Pero", 2500);
        Manager manager = new Manager("Ana", 5650);
        System.out.println(zap1.getIme());
        System.out.println(zap1.getPlaca());
        System.out.println(zap1.oZaposleniku());
        System.out.println(zap2.getIme());
        System.out.println(zap2.getPlaca());
        System.out.println(zap2.oZaposleniku());
        System.out.println(manager.getIme());
        System.out.println(manager.getPlaca());
        System.out.println(manager.oZaposleniku());
        System.out.println(manager.radi());


    }
}

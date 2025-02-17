//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // zelim kreirati novi objekt koji mi je osoba, ili student ili profesor ili apsolvent// samo t
        // o moze
        //objekt osoba
        Osoba osoba = new Osoba();
        System.out.println(osoba.getOib());

        Osoba stud1 = new Student();
        System.out.println(stud1.getOib());

        Student stud2 = new Student();
        System.out.println(stud2.getMatBrojStudenta());
        System.out.println(stud2.getOib());
        //Objekt profesor
        Profesor prof = new Profesor();
        // System.out.println(prof.getMatBrojStudenta());
        System.out.println(prof.getOib());
        Apsolvent aps = new Apsolvent();
        System.out.println(aps.getMatBrojStudenta());
        System.out.println(aps.getOib());
        // Zaposlenik zap1=new Manager();
        //  System.out.println(zap1.oZaposleniku());
        // System.out.println(zap1.radi());
        //  Zaposlenik zap2=new Programer();
        // System.out.println(zap2.oZaposleniku());
        //System.out.println(zap2.radi());
        // Manager manager1=new Manager();
        // System.out.println(manager1.oZaposleniku());
        // System.out.println(manager1.radi());


    }
}
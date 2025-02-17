package Zivotinja;

public class Macka extends Zivotinja {
    public Macka(String naziv) {
        super(naziv);
    }


    public String glasajSe() {
        return super.glasajSe() + " mjau!";
    }
}
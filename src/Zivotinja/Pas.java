package Zivotinja;

public class Pas extends Zivotinja {
    public Pas(String naziv) {
        super(naziv);
    }


    public String glasajSe() {
        return super.glasajSe() + "Av, av!";
    }
}

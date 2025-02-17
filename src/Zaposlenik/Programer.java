package Zaposlenik;

public class Programer extends Zaposlenik{
    public Programer(String Ime, double placa){
        super(Ime,placa);
    }
    String radi(){
        return "Programer" +Ime +"\t" +"piše kod";
    }
}


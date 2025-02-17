package Zaposlenik;

public class Manager extends Zaposlenik{
    public Manager(String Ime, double placa){
        super(Ime,placa);
    }
    public String radi(){
        return "Manager " +Ime +" upravlja timon";
    }
}

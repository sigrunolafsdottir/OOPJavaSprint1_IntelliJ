package ooj.sprint1.övningar.övning2;

public class Bil extends Fordon implements  IHjulburen{
    private int motoreffekt;
    int antalHjul = 4;
    
    public Bil(int hastighet, int vikt, int motoreffekt) {
        super(hastighet, vikt);
        this.motoreffekt = motoreffekt;
    }
    
    public void växla(){}
    
    public void printMe(){
        System.out.println("Bil med hastighet " +getHastighet()+ " km/h, vikt " + getVikt()
                +" kg och motoreffekt: " + motoreffekt);
    }
    
    public int getAntalHjul(){
        return antalHjul;
    }
}

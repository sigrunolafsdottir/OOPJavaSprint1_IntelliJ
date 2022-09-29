package ooj.sprint1.övningar.övning2.Uppg2CD;

public class Bil extends Fordon implements Printable, Hjulburen {
    private int motoreffekt;
    int antalHjul = 4;

    public Bil(int hastighet, int vikt, int motoreffekt) {
        super(hastighet, vikt);
        this.motoreffekt = motoreffekt;
    }

    public void växla() {
    }

    @Override
    public void printMe() {
        System.out.println("Bil med hastighet " + getHastighet() + " km/h, vikt " + getVikt() + " kg och motoreffekt: " + motoreffekt);
    }

    public int getAntalHjul() {
        return antalHjul;
    }
}

package ooj.sprint1.övningar.övning2.Uppg2a;

public class Fordon {

    private int hastighet;
    private int vikt;

    Fordon() {}

    Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public int getHastighet() {
        return hastighet;
    }

    public int getVikt() {
        return vikt;
    }

    public void ändraHastighet(int nyHastighet) {
        hastighet = nyHastighet;
    }


}

package ooj.sprint1.övningar.övning2.Uppg2B;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Huvudprogram {

    public void printFordon(Fordon fordon) {
        fordon.printMe();
    }


    public Huvudprogram() {
        Tåg tåg = new Tåg(180, 300000, 5);
        Bil bil = new Bil(200, 1000, 70);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(20, 5, 10);

        Fordon f = new Cykel(15, 7, 3);

        printFordon(bil);
        printFordon(båt);
        printFordon(tåg);
        printFordon(cykel);

        printFordon(f);

        System.out.println();

        List<Fordon> lista = Arrays.asList(tåg, bil, cykel, båt, f);



        for (Fordon ford : lista) {
            ford.printMe();
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Huvudprogram övn2 = new Huvudprogram();
    }

}

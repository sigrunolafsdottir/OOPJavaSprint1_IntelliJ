package ooj.sprint1.övningar.övning2.Uppg2CD;

import java.util.Arrays;
import java.util.List;

public class Övningsuppgift2 {

    public void printFordon(Fordon fordon) {
        fordon.printMe();
    }


    public void printViaInterface(Printable whatever) {
        whatever.printMe();
    }

    public void printAntalHjul(Hjulburen hjulburen) {
        System.out.println("Antal hjul " + hjulburen.getAntalHjul());
    }

    Övningsuppgift2() {
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


        printViaInterface(bil);
        printViaInterface(båt);
        printViaInterface(tåg);
        printViaInterface(cykel);

        System.out.println();

        Hjulburen bil2 = new Bil(300, 1500, 24);
        Hjulburen cykel2 = new Cykel(30, 15, 24);
        Printable p = new Cykel(45, 12, 78);

        printAntalHjul(bil);
        printAntalHjul(cykel2);
        printAntalHjul(cykel);

        System.out.println();

        List<Printable> hlist = Arrays.asList(tåg, båt, bil, cykel, p);

        for (Printable h : hlist) {
            h.printMe();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Övningsuppgift2 övn2 = new Övningsuppgift2();
    }

}

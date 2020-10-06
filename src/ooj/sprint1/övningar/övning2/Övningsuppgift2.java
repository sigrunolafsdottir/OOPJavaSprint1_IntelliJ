package ooj.sprint1.övningar.övning2;

public class Övningsuppgift2 {
   
    public void printAntalHjul(IHjulburen hjulburen){
        System.out.println("Antal hjul "+hjulburen.getAntalHjul());
    }
    
    public static void printFordon(Fordon fordon){
        fordon.printMe();
    }
    
    public void printViaInterface(Printable whatever){
        whatever.printMe();
    }
    
    public Övningsuppgift2(){
        Tåg tåg = new Tåg(180, 300000, 5);
        Bil bil = new Bil(200, 1000, 70);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(20, 5, 10);

        //tåg.printMe();

        //Fordon fff = new Fordon();
    /*
        Fordon f = new Tåg(500, 140000, 3);
        Fordon f2 = new Bil(500, 140000, 3);
        
       printFordon(bil);
        printFordon(båt);
        printFordon(tåg);
        printFordon(cykel);
        
        printFordon(f);
        printFordon(f2);
        
        System.out.println();*/

        //tillhör Uppgift 2c
        printViaInterface(bil);
        printViaInterface(båt);
        printViaInterface(tåg);
        printViaInterface(cykel);
        
        
        Printable p = new Bil(34, 45, 56);
        printViaInterface(p);
        
        
      //  IHjulburen bil2 = new Bil(300, 1500, 24);
      //  IHjulburen cykel2 = new Cykel(30, 15, 24);
        
    //    printAntalHjul(bil2);
    //    printAntalHjul(cykel2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tåg tåg = new Tåg(180, 300000, 5);
        printFordon(tåg);


       // Övningsuppgift2 övn2 = new Övningsuppgift2();
    }
    
}

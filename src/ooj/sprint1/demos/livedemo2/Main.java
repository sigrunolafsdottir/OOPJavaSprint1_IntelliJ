package ooj.sprint1.demos.livedemo2;

public class Main {

    public static void main (String[] args){

        Fabric fab = new Fabric("cotton");
        Product prod = new Product(50, "fdsfsfdsfs");
        Garment garm = new Garment(fab);

       // fab.printMe();

       // prod.printMe();

        garm.printMe();
    }

}

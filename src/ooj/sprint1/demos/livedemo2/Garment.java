package ooj.sprint1.demos.livedemo2;

public class Garment extends Product{

    private Fabric fab;

    public Garment(){}

    public Garment(Fabric fab){
        this.fab = fab;
    }

    public void printMe(){
        System.out.println("I'm a garment, my price is "+getPrice());
    }
}

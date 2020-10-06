package ooj.sprint1.demos.livedemo2;

public class Fabric {

    public String material;

    public Fabric(){}

    public Fabric(String material){
        this.material = material;
    }

    public void printMe(){
        System.out.println("I'm a fabric "+material);
    }

}

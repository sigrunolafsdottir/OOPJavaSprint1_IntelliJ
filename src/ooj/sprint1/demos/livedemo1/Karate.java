package ooj.sprint1.demos.livedemo1;

public class Karate extends Ufc {

    protected String benämning;

    public Karate (){}

    public Karate (String benämning, Viktklass vk){
        this.benämning = benämning;
        this.vk = vk;
    }

    public Karate (String benämning){
        this.benämning = benämning;

    }

    public void printMe(){
        System.out.println("Jag är "+ benämning +", med vikt " + vk.getVikt());
       // System.out.println("Jag är "+ benämning +", med vikt " + this.vk.getVikt());
    }


}

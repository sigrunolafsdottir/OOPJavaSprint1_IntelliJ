package ooj.sprint1.demos.livedemo1;

public class Main {

    public static void main(String[] args){
        Viktklass vk = new Viktklass(100);

        Ufc myUfc = new Ufc(vk);
        Karate karate = new Karate("karate");

        myUfc.printMe();
        karate.printMe();

    }


}

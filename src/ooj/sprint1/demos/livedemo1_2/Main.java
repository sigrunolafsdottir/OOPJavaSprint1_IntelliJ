package ooj.sprint1.demos.livedemo1_2;


import ooj.sprint1.demos.livedemo1.Karate;
import ooj.sprint1.demos.livedemo1.Ufc;
import ooj.sprint1.demos.livedemo1.Viktklass;

public class Main {

    public static void main(String[] args){
        Viktklass vk = new Viktklass(100);

        Ufc myUfc = new Ufc(vk);
        Karate karate = new Karate("karate");
        MMA mma = new MMA(23);

        mma.printMe();

       // myUfc.printMe();
       // karate.printMe();

    }


}

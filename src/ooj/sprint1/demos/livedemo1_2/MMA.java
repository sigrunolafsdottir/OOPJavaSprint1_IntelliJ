package ooj.sprint1.demos.livedemo1_2;

import ooj.sprint1.demos.livedemo1.Ufc;
import ooj.sprint1.demos.livedemo1.Viktklass;

public class MMA extends Ufc {

    public MMA (){}

    public MMA ( int i){

        this.vk = vk;
        this.setMinVariabel(i);
    }

    public void printMe(){
        System.out.println("Jag är MMA, med vikt " + this.getMinVariabel());
        // System.out.println("Jag är "+ benämning +", med vikt " + this.vk.getVikt());
    }

}

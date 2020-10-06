package ooj.sprint1.demos.livedemo1;

public class Ufc {

    private int minVariabel = 5;
    protected Viktklass vk;

    public Ufc (){}

    public Ufc (Viktklass vikt){
        vk = vikt;
    }

    public void printMe(){
        System.out.println("Jag är en Ufc, med vikt " + vk.getVikt());
    }

    public int getMinVariabel(){
        return minVariabel;
    }

    public void setMinVariabel(int i){
        minVariabel = i;
    }
}

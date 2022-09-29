package ooj.sprint1.livedemoJAVA22_27sept.polymorfismPepparkaka;

abstract class Godsak {
    int kaloriinehåll;
    public Godsak(int k){
        kaloriinehåll = k;
    }
    public Godsak(){}

    public void printMe(){
        System.out.println("jag är en godsak");
    }
    abstract void print2();
}

class Pepparkaka extends Godsak{
    boolean gräddad;
    //int kaloriinehåll;
    String form;
    public Pepparkaka(boolean gräddad, String form, 
            int kaloriinnehåll){
        this.gräddad = gräddad;
        this.form = form;
        this.kaloriinehåll = kaloriinnehåll;
    }

    public void printMe(){
        System.out.println("jag är en pepparkaka");
    }

    public void print2(){
        System.out.println("jag är en pepparkaka 2");
    }
}







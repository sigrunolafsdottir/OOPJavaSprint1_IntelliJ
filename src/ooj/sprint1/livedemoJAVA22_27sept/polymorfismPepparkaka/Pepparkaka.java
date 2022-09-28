package ooj.sprint1.livedemoJAVA22_27sept.polymorfismPepparkaka;

class Godsak {
    int kaloriinehåll;
    public Godsak(int k){
        kaloriinehåll = k;
    }
    public Godsak(){}

    public void printMe(){
        System.out.println("jag är en godsak");
    }
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
}







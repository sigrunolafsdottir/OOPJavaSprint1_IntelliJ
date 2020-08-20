package ooj.sprint1.övningar.övning6;


public class Övningsuppgift6 {

    Övningsuppgift6(){
        
        Katt Bella = new Katt();
        Hund Ragnar = new Hund();
        Orm Sune = new Orm();
        
        Djur[] allaDjuren = {Bella, Ragnar, Sune};
        
        for(Djur djur : allaDjuren){
            djur.läte();
        }
        
    }
    
    public static void main(String[] args) {
        Övningsuppgift6 övn = new Övningsuppgift6();
    }
}

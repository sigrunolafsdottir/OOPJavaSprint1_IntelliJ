package ooj.sprint1.övningar.övning4;

import java.util.Date;

public class Övningsuppgift4 {
    
    Övningsuppgift4(){
        Student Anna = new Student("Anna", "8003021234");
        Student Kalle = new Student("Kalle", "8703031234");
        Student Pelle = new Student("Pelle", "9512159876");
        
        Lärare Sigrun = new Lärare ("Sigrun", "");
        
        Kurs OOPJava = new Kurs("Objektorientering och Java");
        
        //Datumet kommer att sättas till exakt när koden exekveras
        Kurstillfälle kurstillfälle = 
                new Kurstillfälle(OOPJava, new Date());
        
        kurstillfälle.läggTillStudent(Anna);
        kurstillfälle.läggTillStudent(Kalle);
        kurstillfälle.läggTillStudent(Pelle);
        kurstillfälle.läggTillLärare(Sigrun);
        
        kurstillfälle.printKurstillfälle();
    }
    
    
    
    public static void main(String[] args) {
        Övningsuppgift4 övn4 = new Övningsuppgift4();
    }

}

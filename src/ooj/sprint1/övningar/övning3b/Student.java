package ooj.sprint1.övningar.övning3b;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    
    protected List<Kurs> deltarI;
    
    public Student(String namn, String personnummer){
        super(namn, personnummer);
        deltarI = new ArrayList<>();
    };
    
    public void läggTillKurs(Kurs kurs){
        deltarI.add(kurs);
    }
    
    public void taBortKurs(Kurs kurs){
        deltarI.remove(kurs);
    }
    
    public List<Kurs> getAllaKurser(){
        return deltarI;
    }

}

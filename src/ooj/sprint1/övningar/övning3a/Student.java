package ooj.sprint1.övningar.övning3a;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    
    protected Kurs[] deltarI;
    private int kursCounter = 0;
    
    public Student(String namn, String personnummer){
        super(namn, personnummer);
        deltarI = new Kurs[10];
    };
    
    public void läggTillKurs(Kurs kurs){
        deltarI[kursCounter++] = kurs;
    }
    
    public Kurs[] getAllaKurser(){
        return deltarI;
    }

}

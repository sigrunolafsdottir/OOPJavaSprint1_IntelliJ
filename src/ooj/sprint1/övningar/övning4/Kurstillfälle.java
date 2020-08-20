package ooj.sprint1.övningar.övning4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Kurstillfälle {
    
    protected Date startDatum;
    protected Lärare lärare;
    protected Kurs kurs;
    protected  List<Student> studenter;
    
    public Kurstillfälle(Kurs kurs, Date startDatum){
        this.startDatum = startDatum;
        this.kurs = kurs;
        studenter = new ArrayList<>();
    }
    
    public Kurs getKurs(){
        return kurs;
    }
    
    public Date getDate(){
        return startDatum;
    }
    
    public List<Student> getStudenter(){
        return studenter;
    }
    
    public void läggTillLärare (Lärare lärare){
        this.lärare = lärare;
    }
    
    public void läggTillStudent (Student student){
        studenter.add(student);
    }
    
    public void printKurstillfälle(){
        
        System.out.println("Kurs: " + this.kurs.getNamn());
        System.out.println("Startdatum: " + this.startDatum.toString());
        System.out.println("Lärare: " + this.lärare.getNamn());
        
        for (Student s : this.studenter){
            System.out.println("Student: " + s.getNamn());
        }
    }
    
}

package ooj.sprint1.övningar.övning3b;

import java.util.ArrayList;
import java.util.List;

public class Kurs {
    
    protected String namn;
    protected Lärare lärare;
    protected List<Student> studenter;
    
    Kurs(String namn){
        this.namn = namn;
        studenter = new ArrayList<>();
    }
    
    public String getNamn(){
        return namn;
    }
    
    public Lärare getLärare(){
        return lärare;
    }
    
    public List<Student> getStudenter(){
        return studenter;
    }
    
    public void läggTillStudent(Student student){
        studenter.add(student);
    }
    
    public void taBortStudent(Student student){
        studenter.remove(student);
    }
    
    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }
    
    public void taBortLärare(){
        this.lärare = null;
    }
}

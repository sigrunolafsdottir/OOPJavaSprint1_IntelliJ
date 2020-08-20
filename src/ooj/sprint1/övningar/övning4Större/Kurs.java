package ooj.sprint1.övningar.övning4Större;

import java.util.ArrayList;
import java.util.List;


public class Kurs {
    
    private String name;
    private List<Lärare> lärare;
    private List<Kurstillfälle> kurstillfällen = new ArrayList<>();
    
    public Kurs(String namn){
        this.name = namn;
    }
    
    public Kurs(String namn, List<Lärare> lärare){
        this.name = namn;
        this.lärare = lärare;
    }
    
  
    public String getName(){
        return name;
    }

    public void setNamn(String namn) {
        this.name = namn;
    }

    public List<Lärare> getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare.add(lärare);
    }
    
    public void addKurstillfälle(Kurstillfälle kf) {
        this.kurstillfällen.add(kf);
    }
}

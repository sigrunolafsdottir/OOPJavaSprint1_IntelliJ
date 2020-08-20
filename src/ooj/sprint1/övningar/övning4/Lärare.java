package ooj.sprint1.övningar.övning4;

public class Lärare extends Person {
    
    public Lärare(String namn, String personnummer){
        super(namn, personnummer);
    };
    
    public String getNamn(){
        return namn;
    }
}

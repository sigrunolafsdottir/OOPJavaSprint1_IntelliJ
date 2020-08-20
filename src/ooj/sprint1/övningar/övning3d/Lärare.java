package ooj.sprint1.övningar.övning3d;

import java.util.List;

public class Lärare extends Person {

    protected List<Kurs> undervisar;

    public Lärare(String namn, String personnummer){
        super(namn, personnummer);
    };

    public String getNamn(){
        return namn;
    }

    public void läggTillUndervisadKurs(Kurs kurs){
        undervisar.add(kurs);
    }
    
    public void taBortUndervisadKurs(Kurs kurs){
        undervisar.remove(kurs);
    }

}

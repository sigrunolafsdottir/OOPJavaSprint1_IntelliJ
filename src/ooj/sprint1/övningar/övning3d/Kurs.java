package ooj.sprint1.övningar.övning3d;

public class Kurs {
    
    protected String namn;
    protected Lärare lärare;

    Kurs(String namn){
        this.namn = namn;
    }

    public String getNamn(){
        return namn;
    }

    public Lärare getLärare(){
        return lärare;
    }
    
    public void läggTillLärare(Lärare lärare){
        this.lärare = lärare;
    }
    
    public void taBortLärare(){
        this.lärare = null;
    }
}

package ooj.sprint1.övningar.övning7;


public abstract class Figur {
    
    protected Punkt startpunkt;
    
    public Figur(Punkt p){
        startpunkt=p;
    }
    
    public abstract double area();
}

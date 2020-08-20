package ooj.sprint1.övningar.övning7;

public class LikbentTriangel extends Figur{
    
    private int bas;
    private int höjd;
    
    //startpunkten antas vara översta hörnet 
    public LikbentTriangel (int startx, int starty, int bas, int höjd){
        super(new Punkt(startx,starty));
        this.bas = bas;
        this.höjd = höjd;
    }
    
    public double area(){
        return bas*höjd/2;
    }

}

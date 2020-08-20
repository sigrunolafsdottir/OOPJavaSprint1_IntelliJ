package ooj.sprint1.övningar.övning8;

import java.util.LinkedList;
import java.util.List;


public class Övningsuppgift8 {

    public Övningsuppgift8(){
        
        FigurFabrik fabrik = new FigurFabrik();
        
        List<Figur> figurlista = new LinkedList<>();
        figurlista.add(fabrik.getFigur("rund"));
        figurlista.add(fabrik.getFigur("trekantig"));
        figurlista.add(fabrik.getFigur("fyrkantig"));
        
        for (Figur f : figurlista){
            System.out.println("En " 
                    + f.getClass().getSimpleName()
                    + " med area " + f.area() );
        }
        
    }
    
    public static void main(String[] args){
        Övningsuppgift8 ö = new Övningsuppgift8();
    }
    
}

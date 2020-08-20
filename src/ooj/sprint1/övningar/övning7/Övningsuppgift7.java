package ooj.sprint1.övningar.övning7;

import java.util.LinkedList;
import java.util.List;


public class Övningsuppgift7 {
    
    //Uppgift 7a
    public Övningsuppgift7(){
        Cirkel förstaFigur = new Cirkel(5,3,2);
        LikbentTriangel andraFigur = new LikbentTriangel(10,10,5,4);
        Rektangel tredjeFigur = new Rektangel(7,5,3,2);
        
        List<Figur> figurlista = new LinkedList<>();
        figurlista.add(förstaFigur);
        figurlista.add(andraFigur);
        figurlista.add(tredjeFigur);
        
        for (Figur f : figurlista){
            System.out.println("En " + f.getClass().getSimpleName() + " med area " + f.area() );
        }
    }
    
    //Uppgift 7b
    public Övningsuppgift7(String uppgift_7b){
        Cirkel förstaFigur = new Cirkel(5,3,2);
        LikbentTriangel andraFigur = new LikbentTriangel(10,10,5,4);
        Rektangel tredjeFigur = new Rektangel(7,5,3,2);
        
        List figurlista = new LinkedList();
        figurlista.add(förstaFigur);
        figurlista.add(andraFigur);
        figurlista.add(tredjeFigur);
        
        for (Object f : figurlista){
            System.out.println("En " + f.getClass().getSimpleName() + " med area " + ((Figur)f).area() );
        }
    }
    
    
    public static void main(String[] args){
        Övningsuppgift7 ö = new Övningsuppgift7();
        
        System.out.println();
        
        Övningsuppgift7 övningsuppgift7b = new Övningsuppgift7("dummy");
    }

}

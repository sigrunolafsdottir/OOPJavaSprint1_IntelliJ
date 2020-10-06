package ooj.sprint1.demos;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {
    
    public static void main (String[] args){
        List<String> l = new LinkedList<>();
        List<String> lista = new LinkedList<>();
        
        System.out.println("Size of List "+l.size());
        
        System.out.println();
        
        l.add("Toker");
        l.add("Blyger");
        l.add("Prosit");
        l.add("Trötter");
        l.add("Blyger");

        
        lista = Arrays.asList("Toker", "Blyger", "Prosit", "Trötter", "Blyger");
//        
//
        for (String s : l){
            System.out.println(s);
        }
//        
        int index = lista.indexOf("Trötter");
        System.out.println("index: "+index);
//        
        lista.set(index, "Tomten");
        
        for (String dwarf : lista){
           System.out.println(dwarf);
        }
//        
//        
//
       System.out.println();
//        
        for (int i = 0; i < l.size() ; i++){
            System.out.println(l.get(i));
        }
///       
        System.out.println();
//        
        System.out.println(l);
//
          lista.forEach(dwarf -> System.out.println(dwarf) );
    }
}
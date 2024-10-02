package ooj.sprint1.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {
    
    public static void main (String[] args){
        List<String> l = new ArrayList<>();
        List<String> lista = new LinkedList<>();
        
        System.out.println("Size of List "+l.size());
        
        System.out.println();
        
        l.add("Toker");
        l.add("Blyger");
        l.add("Prosit");
        l.add("Trötter");
        l.add("Blyger");

        
        lista = Arrays.asList("TokerX", "BlygerX", "PrositX", "TrötterX", "BlygerX");



        for (String s : l){
            System.out.println(s);
        }

        int index = lista.indexOf("TrötterX");
        System.out.println("index: "+index);

        lista.set(index, "Tomten");

        for (String nisse : lista){
           System.out.println(nisse);
        }



       System.out.println();

        for (int i = 0; i < l.size() ; i++){
            System.out.println(l.get(i));
        }

        System.out.println();

        System.out.println(l);

        lista.forEach(nisse -> System.out.println(nisse) );
        System.out.println();


        List<String> listaImmutable = List.of("TokerY", "BlygerY", "PrositY", "TrötterY", "BlygerY");
        //listaImmutable.set(0, "sigrun");
        listaImmutable.forEach(nisse -> System.out.println(nisse) );

    }

}
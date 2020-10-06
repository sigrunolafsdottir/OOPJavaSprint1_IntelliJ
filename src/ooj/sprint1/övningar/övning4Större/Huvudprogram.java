package ooj.sprint1.övningar.övning4Större;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Huvudprogram {
    
    public Huvudprogram(){
        
        Student Anna = new Student("Anna", "1234543543");
        Student Bertil = new Student("Bertil", "555555553");
        Student Calle = new Student("Calle", "126546443");
        
        Lärare Sigrun = new Lärare("Sigrun", "12324232");
        
        Kurs OOP = new Kurs("OOP", Arrays.asList(Sigrun));
        Kurs DB = new Kurs("DB", Arrays.asList(Sigrun));
        
        //här bokför vi allt kursdeltagande
        List<Kursdeltagande> kursdeltagande = new ArrayList<>();
        kursdeltagande.add(new Kursdeltagande(Anna, OOP));
        kursdeltagande.add(new Kursdeltagande(Bertil, OOP));
        kursdeltagande.add(new Kursdeltagande(Calle, OOP));
        kursdeltagande.add(new Kursdeltagande(Anna, DB));
        
        SchoolUtil.printAllClassesForStudent(kursdeltagande, Anna);
        System.out.println("----");
        SchoolUtil.printAllStudentsForClass(kursdeltagande, OOP);
        System.out.println("----");
                 
       // ------------------------------
        
        Kurstillfälle OOPLektion1 = new Kurstillfälle(
                LocalDate.of(2015, Month.SEPTEMBER, 1) );
        Kurstillfälle OOPLektion2 = new Kurstillfälle(
                LocalDate.of(2015, Month.SEPTEMBER, 8) );
        
        Kurstillfälle DBLektion1 = new Kurstillfälle(
                LocalDate.of(2015, Month.OCTOBER, 1) );
        Kurstillfälle DBLektion2 = new Kurstillfälle(
                LocalDate.of(2015, Month.OCTOBER, 8) );
        Kurstillfälle DBLektion3 = new Kurstillfälle(
                LocalDate.of(2015, Month.OCTOBER, 15) );
        
        OOP.addKurstillfälle(OOPLektion1);
        OOP.addKurstillfälle(OOPLektion2);
        
        DB.addKurstillfälle(DBLektion1);
        DB.addKurstillfälle(DBLektion2);
        DB.addKurstillfälle(DBLektion3);
        
        List<Lektionsdeltagande> lektionsdeltagande = 
                new ArrayList<>();
        lektionsdeltagande.add(SchoolUtil
                .registreraElevsNärvaro(OOPLektion1, Anna));
        lektionsdeltagande.add(SchoolUtil
                .registreraElevsNärvaro(OOPLektion1, Bertil));
        lektionsdeltagande.add(SchoolUtil
                .registreraElevsNärvaro(OOPLektion1, Calle));
        
        //TODO, skicka med KUrsdeltagar-listan till registreraNärvaor för att kolla om en elev 
        //verligen går den kurs som jag försöker registrera hen på
       
        
        //SÅ länge vi använder samma objekt hänger datat ihop, även om klasserna inte "har" varandra
      //  Anna.setName("Iris");
        lektionsdeltagande.forEach(
                ld -> System.out.println(ld.getStudent().getName()));
        
        
    }
    
    public static void main(String[] args){
        Huvudprogram hp = new Huvudprogram();
    }

}

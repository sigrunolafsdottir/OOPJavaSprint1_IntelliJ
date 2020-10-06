package ooj.sprint1.övningar.övning3d;

import java.util.ArrayList;
import java.util.List;

public class Övningsuppgift3 {
    
    Övningsuppgift3(){
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");
        Student Mimmi = new Student("Mimmi", "8905031234");
        
        Lärare Sigrun = new Lärare("Sigrun", "");
        
        Kurs OOPJava = new Kurs("Objektorientering och Java");
        OOPJava.läggTillLärare(Sigrun);

        Kurs databasteknik = new Kurs("Databasteknik");
        databasteknik.läggTillLärare(Sigrun);
        
        Deltagande d1 = new Deltagande(OOPJava, Anna);
        Deltagande d2 = new Deltagande(OOPJava, Tolvan);
        Deltagande d3 = new Deltagande(OOPJava, Pelle);
        Deltagande d4 = new Deltagande(databasteknik, Pelle);
        Deltagande d5 = new Deltagande(databasteknik, Mimmi);

        List<Deltagande> allaDeltagare = new ArrayList();
        allaDeltagare.add(d1);
        allaDeltagare.add(d2);
        allaDeltagare.add(d3);
        allaDeltagare.add(d4);
        allaDeltagare.add(d5);
        
        //printKurs(OOPJava, allaDeltagare);
        System.out.println("");
        printStudent(Pelle, allaDeltagare);
    }
    
    public void printKurs(Kurs kurs, List<Deltagande> allaDeltagare){
        
        System.out.println("Kurs: " + kurs.getNamn());
        System.out.println("Lärare: " + kurs.getLärare().getNamn());
        
        for (Deltagande d : allaDeltagare){
            if (d.getKurs() == kurs)
                System.out.println("Student: " + d.getStudent().getNamn());
        }
    }

    public void printStudent(Student student, List<Deltagande> allaDeltagare){

        System.out.println("Student: " + student.getNamn());

        for (Deltagande d : allaDeltagare){
            if (d.getStudent() == student)
                System.out.println("Kurs: " + d.getKurs().getNamn());
        }
    }
    
    public static void main(String[] args) {
        Övningsuppgift3 övn3 = new Övningsuppgift3();
    }

}

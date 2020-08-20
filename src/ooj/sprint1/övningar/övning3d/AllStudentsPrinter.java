package ooj.sprint1.övningar.övning3d;

import java.util.ArrayList;
import java.util.List;


public class AllStudentsPrinter {

    AllStudentsPrinter(){
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");
        Student Mimmi = new Student("Mimmi", "8905031234");

        List<Student> allstudents = new ArrayList<> ();
        allstudents.add(Anna);
        allstudents.add(Tolvan);
        allstudents.add(Pelle);
        allstudents.add(Mimmi);

        Lärare Sigrun = new Lärare("Sigrun", "");

        Kurs OOPJava = new Kurs("Objektorientering och Java");
        Kurs databasteknik = new Kurs("Databasteknik");
        Kurs backend = new Kurs("Backend");

        Deltagande d1 = new Deltagande(OOPJava, Anna);
        Deltagande d2 = new Deltagande(OOPJava, Tolvan);
        Deltagande d3 = new Deltagande(OOPJava, Pelle);
        Deltagande d4 = new Deltagande(databasteknik, Pelle);
        Deltagande d5 = new Deltagande(databasteknik, Mimmi);
        Deltagande d6 = new Deltagande(backend, Anna);
        Deltagande d7 = new Deltagande(backend, Tolvan);
        Deltagande d8 = new Deltagande(backend, Pelle);

        List<Deltagande> allaDeltagare = new ArrayList();
        allaDeltagare.add(d1);
        allaDeltagare.add(d2);
        allaDeltagare.add(d3);
        allaDeltagare.add(d4);
        allaDeltagare.add(d5);
        allaDeltagare.add(d6);
        allaDeltagare.add(d7);
        allaDeltagare.add(d8);

        printStudents(allstudents, allaDeltagare);
    }

    public void printStudents(List<Student> allstudents, List<Deltagande> allaDeltagare){
        
        for (Student s : allstudents){
            System.out.println("Student: " + s.getNamn());
            for(Deltagande d : allaDeltagare){
                if (d.getStudent() == s)
                    System.out.println("Kurs: " + d.getKurs().getNamn());
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        AllStudentsPrinter sp = new AllStudentsPrinter();
    }

}

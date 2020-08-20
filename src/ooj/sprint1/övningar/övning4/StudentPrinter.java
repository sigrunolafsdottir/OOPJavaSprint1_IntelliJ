package ooj.sprint1.övningar.övning4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class StudentPrinter {
    
    StudentPrinter(){
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "9512159876");
        
        Lärare Sigrun = new Lärare ("Sigrun", "");
        
        Kurs OOPJava = new Kurs("Objektorientering och Java");
        Kurs Backend = new Kurs("Backend");
        
        //Datumet kommer att sättas till exakt när koden exekveras
        Kurstillfälle kurstillfälle = new Kurstillfälle(OOPJava, new Date());
        
        kurstillfälle.läggTillStudent(Anna);
        kurstillfälle.läggTillStudent(Tolvan);
        kurstillfälle.läggTillStudent(Pelle);
        kurstillfälle.läggTillLärare(Sigrun);
        
        Kurstillfälle kurstillfälle2 = new Kurstillfälle(Backend, new Date());
        
        kurstillfälle2.läggTillStudent(Anna);
        kurstillfälle2.läggTillStudent(Tolvan);
        kurstillfälle2.läggTillLärare(Sigrun);
        
        List <Kurstillfälle> allaKurstillfällen = new ArrayList<>();
        allaKurstillfällen.add(kurstillfälle);
        allaKurstillfällen.add(kurstillfälle2);
        
        printStudents(allaKurstillfällen);
    }
    
    public void printStudents(List<Kurstillfälle> allaKurstillfällen){
        
        //vi börjar med att bygga upp en lista där varje student som finns listad i ett kurstillfälle finns med en gång
        List<Student> allStudents = new ArrayList<>();
        for (Kurstillfälle k : allaKurstillfällen){
            for (Student s : k.getStudenter()){
                if (!allStudents.contains(s)){
                    allStudents.add(s);
                }
            }
        }
        
        for (Student s : allStudents){
            List<Kurs> tempKursLista = new ArrayList<>();
            for (Kurstillfälle k : allaKurstillfällen){
                //om studenten finns med i kurstillfället lägger vi in kursen i tempKursLista
                if (k.getStudenter().contains(s)){
                    tempKursLista.add(k.getKurs());
                }
            }
            //skriver ut
            System.out.println("Student: "+s.getNamn());
            for (Kurs k : tempKursLista){
                System.out.println("Kurs: "+k.getNamn());
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        StudentPrinter sp = new StudentPrinter();
    }

}

package ooj.sprint1.övningar.övning4Större;

import java.util.ArrayList;
import java.util.List;


public class SchoolUtil {
    
    public static void printAllClassesForStudent(
            List<Kursdeltagande> kdtList, Student student){
        List<String> classes = new ArrayList<>();
        for(Kursdeltagande kdf : kdtList){
            if (kdf.getStudent().equals(student)){
                classes.add(kdf.getKurs().getName());
            }
            
        }
        classes.forEach(name -> System.out.println(name));
    }
    
     public static void printAllStudentsForClass(
             List<Kursdeltagande> kdtList, Kurs kurs){
        List<String> students = new ArrayList<>();
        for(Kursdeltagande kdf : kdtList){
            if (kdf.getKurs().equals(kurs)){
                students.add(kdf.getStudent().getName());
            }
        }
        students.forEach(name -> System.out.println(name));
    }
     
     public static Lektionsdeltagande registreraElevsNärvaro(
             Kurstillfälle kf, Student student){
         return new Lektionsdeltagande(kf, student);
     }

}

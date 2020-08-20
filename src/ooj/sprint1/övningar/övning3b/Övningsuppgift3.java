package ooj.sprint1.övningar.övning3b;

public class Övningsuppgift3 {
    
    Övningsuppgift3(){
        Student Anna = new Student("Anna", "8003021234");
        Student Tolvan = new Student("Tolvan", "1212121212");
        Student Pelle = new Student("Pelle", "8512159876");
        
        Lärare Sigrun = new Lärare ("Sigrun", "");
        
        Kurs OOPJava = new Kurs("Objektorientering och Java");
        
        OOPJava.läggTillStudent(Anna);
        OOPJava.läggTillStudent(Tolvan);
        OOPJava.läggTillStudent(Pelle);
        OOPJava.läggTillLärare(Sigrun);
        
        Anna.läggTillKurs(OOPJava);
        Tolvan.läggTillKurs(OOPJava);
        Pelle.läggTillKurs(OOPJava);
        
        printKurs(OOPJava);
    }
    
    public void printKurs(Kurs kurs){
        
        System.out.println("Kurs: " + kurs.getNamn());
        System.out.println("Lärare: " + kurs.getLärare().getNamn());
        
        for (Student s : kurs.getStudenter()){
            System.out.println("Student: " + s.getNamn());
        }
    }
    
    public static void main(String[] args) {
        Övningsuppgift3 övn3 = new Övningsuppgift3();
    }

}

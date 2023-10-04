package ooj.sprint1.övningar.övning3a;


//Omskriven för att få lite bättre testbarhet

public class Övningsuppgift3Kladd {

    protected Student Anna = new Student("Anna", "8003021234");
    protected Student Tolvan = new Student("Tolvan", "1212121212");
    protected Student Pelle = new Student("Pelle", "8512159876");

    protected Lärare Sigrun = new Lärare("Sigrun", "");

    protected Kurs OOPJava = new Kurs("Objektorientering och Java");

    Övningsuppgift3Kladd(){
        
        OOPJava.läggTillStudent(Anna);
        OOPJava.läggTillStudent(Tolvan);
        OOPJava.läggTillStudent(Pelle);
        OOPJava.läggTillLärare(Sigrun);
        
        Anna.läggTillKurs(OOPJava);
        Tolvan.läggTillKurs(OOPJava);
        Pelle.läggTillKurs(OOPJava);
    }

    public String getCourseHeading(Kurs kurs){
        return "Kurs: " + kurs.getNamn();
    }

    public String getTeacherHeading(Kurs kurs){
        return "Lärare: " + kurs.getLärare().getNamn();
    }

    public String getStudentString(Student s){
        return "Student: " + s.getNamn();
    }
    
    public void printKurs(Kurs kurs){
        
        System.out.println(getCourseHeading(kurs));
        System.out.println(getTeacherHeading(kurs));
        
        for (Student s : kurs.getStudenter()){
            if (s != null) {
                System.out.println(getStudentString(s));
            }
        }
    }
    
    public static void main(String[] args) {
        Övningsuppgift3Kladd övn3 = new Övningsuppgift3Kladd();
        övn3.printKurs(övn3.OOPJava);
    }

}

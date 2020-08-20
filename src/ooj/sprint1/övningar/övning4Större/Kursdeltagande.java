package ooj.sprint1.övningar.övning4Större;


public class Kursdeltagande {
    
    private Student student;
    private Kurs kurs;
    
    public Kursdeltagande(Student student, Kurs kurs){
        this.student = student;
        this.kurs = kurs;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

}

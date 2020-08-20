package ooj.sprint1.övningar.övning3d;

public class Deltagande {
    protected Kurs kurs;
    protected Student student;

    Deltagande(Kurs kurs, Student student){
        this.kurs = kurs;
        this.student = student;
    }

    public Student getStudent(){
        return student;
    }

    public Kurs getKurs(){
        return kurs;
    }

    public void setStudent(Student s){
        student = s;
    }

    public void setKurs(Kurs k){
        kurs = k;
    }
}

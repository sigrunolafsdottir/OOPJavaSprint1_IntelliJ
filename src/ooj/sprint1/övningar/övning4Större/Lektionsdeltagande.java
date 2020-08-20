package ooj.sprint1.övningar.övning4Större;


public class Lektionsdeltagande {
    
    private Kurstillfälle ktf;
    private Student student;
    
    public Lektionsdeltagande(Kurstillfälle ktf, Student student){
        this.ktf = ktf;
        this.student = student;
    }

    public Kurstillfälle getKtf() {
        return ktf;
    }

    public void setKtf(Kurstillfälle ktf) {
        this.ktf = ktf;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}

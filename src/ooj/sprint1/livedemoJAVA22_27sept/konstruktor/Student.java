package ooj.sprint1.livedemoJAVA22_27sept.konstruktor;

public class Student {

    private String program;
    private String namn;

    public Student(){}

    public Student(String namn){
        this.namn = namn;
    }

    public Student(String namn, String program){
        this.namn = namn;
        this.program = program;

    }

    public void setNamn(String namn){
        this.namn = namn;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public String getNamn(){
        return namn;
    }

    public String getProgram(){
        return program;
    }


}

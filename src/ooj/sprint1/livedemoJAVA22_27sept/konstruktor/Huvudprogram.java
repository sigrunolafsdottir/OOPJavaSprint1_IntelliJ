package ooj.sprint1.livedemoJAVA22_27sept.konstruktor;

public class Huvudprogram {

    public static void main(String[] args){

        Student s1 = new Student();
        s1.setNamn("Kurre");
        s1.setProgram("JAVA22");

        Student s2 = new Student("kalle");
        Student s3 = new Student("mimmi", "JAVA22");

        System.out.println(s1.getNamn());
        System.out.println(s2.getNamn());
        System.out.println(s3.getNamn());
    }


}

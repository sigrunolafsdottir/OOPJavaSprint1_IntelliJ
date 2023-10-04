package ooj.sprint1.övningar.övning3a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Övningsuppgift3KladdTest {

    Övningsuppgift3Kladd ö3k = new Övningsuppgift3Kladd();

    Kurs OOPJava = ö3k.OOPJava;
    Student Anna = ö3k.Anna;

    @Test
    void getCourseHeading() {

        String expectedResult = "Kurs: Objektorientering och Java";
        String actualResult= ö3k.getCourseHeading(OOPJava);

        assert(actualResult.startsWith("Kurs: "));
        assert(actualResult.endsWith(OOPJava.getNamn()));
        assert(expectedResult.equals(actualResult));

    }

    @Test
    void getTeacherHeading() {

        String expectedResult = "Lärare: Sigrun";
        String actualResult= ö3k.getTeacherHeading(OOPJava);

        assert(actualResult.startsWith("Lärare: "));
        assert(actualResult.endsWith(OOPJava.getLärare().getNamn()));
        assert(expectedResult.equals(actualResult));

    }

    @Test
    void getStudentString() {

        String expectedResult = "Student: Anna";
        String actualResult= ö3k.getStudentString(Anna);

        assert(actualResult.startsWith("Student: "));
        assert(actualResult.endsWith(Anna.getNamn()));
        assert(expectedResult.equals(actualResult));

    }
}
package ooj.sprint1.demos;

public class PolymorfismAbstraktKlassDemo {
    
    class Person {
        public void HejSnygging(){ System.out.println("Ehhhh???");}
    }
    
    class IntresseradPerson extends Person {
        public void HejSnygging(){ System.out.println("Åh vad trevligt sagt");}
    }
    
    class OintresseradPerson extends Person {
        public void HejSnygging(){ System.out.println("Sluta förfölj mig");}
    }
    
    PolymorfismAbstraktKlassDemo  () {
        Person p1 = new IntresseradPerson();
        Person p2 = new OintresseradPerson();
        Person p3 = new Person();
        p1.HejSnygging();
        p2.HejSnygging();
        p3.HejSnygging();
    }

    public static void main (String[] args)
    {
        PolymorfismAbstraktKlassDemo demo = new PolymorfismAbstraktKlassDemo();
    }

}
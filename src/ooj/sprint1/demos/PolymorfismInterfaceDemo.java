package ooj.sprint1.demos;

public class PolymorfismInterfaceDemo {
    
    interface Person {
        default public void HejSnygging(){ System.out.println("Ehhhh???");}
    }
    
    class IntresseradPerson implements Person {
        public void HejSnygging(){ System.out.println("Åh vad trevligt sagt");}
    }
    
    class OintresseradPerson implements Person {
        public void HejSnygging(){ System.out.println("Sluta förfölj mig");}
    }
    
    PolymorfismInterfaceDemo  () {
        Person p1 = new IntresseradPerson();
        Person p2 = new OintresseradPerson();
        //Vi kan inte instantiera objekt av ett interface och inte ha en implementerande klass
        //Person p3 = new Person();
        p1.HejSnygging();
        p2.HejSnygging();
    }

    public static void main (String[] args)
    {
        PolymorfismInterfaceDemo demo = new PolymorfismInterfaceDemo();
    }

}
package ooj.sprint1.demos;

class Singleton
{
    private static Singleton singleton_instance = null;
    public String s;
 
    // konstruktor, koms bara åt av den egna klassen
    private Singleton()
    {
        s = "Bara för att visa att nåt händer";
    }
 
    // statisk metod som skapar en instans av en singleton om den inte redan finns
    public static Singleton getInstance()
    {
        if (singleton_instance == null)
            singleton_instance = new Singleton();
 
        return singleton_instance;
    }
}
 

class Main
{
    public static void main(String args[])
    {
        // Vi skaffar oss en instans av singleton
        Singleton x = Singleton.getInstance();
 
        // // Vi skaffar oss ytterligare en instans av singleton
        Singleton y = Singleton.getInstance();
 
        System.out.println("String from x is: " + x.s);
        System.out.println("String from y is: " + y.s);
        System.out.println("\n");
        
        // Vi låter x:s instans av s bli UpperCase
        x.s = (x.s).toUpperCase();
// 
        System.out.println("String from x is: " + x.s);
        System.out.println("String from y is: " + y.s);
//        System.out.println("\n");
 
//        // Vi låter y:s instans av s bli LowerCase
        y.s = (y.s).toLowerCase();
// 
        System.out.println("String from x is: " + x.s);
        System.out.println("String from y is: " + y.s);
    }
}
    



package ooj.sprint1.demos.interfaces;


public class InterfaceDemo {
    
    public static void main (String[] args){
        
        Student s = new Student ("Sanna", "JavaOO");
        System.out.println(s.getName()+" "+s.getFavoriteSnack()
                +" "+s.getFavouriteDrink());
//        
        Teacher t = new Teacher("Sigrun");
        System.out.println(t.getName()+" "+t.getFavoriteSnack()
                + " " + t.getFavouriteDrink());
        
        IPartyAnimal m = new Student ("Sixten", "JavaOO");
        System.out.println(m.getFavoriteSnack()+" "
                +m.getFavouriteDrink());
//        
        IPartyAnimal t2 = t;
        System.out.println(t2.getFavoriteSnack()+" "+t2.getFavouriteDrink());
//        

        //Varför funkar inte detta?
        //System.out.println(m.getName());
        

    }

}
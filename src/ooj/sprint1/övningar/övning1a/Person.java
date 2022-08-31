package ooj.sprint1.övningar.övning1a;

public class Person {
    
    String namn;
    String adress;
    int ålder;
    
    public Person (){}
    
    
    public Person (String namn, String adress, 
            int ålder){
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }
       
    public String getName() {
        return namn;
    }
    
}
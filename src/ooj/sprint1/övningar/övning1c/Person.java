package ooj.sprint1.övningar.övning1c;

public class Person {
    
    private String namn;
    private String adress;
    private int ålder;
    
    public Person(){}
    
    
    public Person(String namn, String adress,
                  int ålder){
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }
       
    public String getName() {
        return namn;
    }
    
}
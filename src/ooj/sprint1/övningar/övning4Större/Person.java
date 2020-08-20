package ooj.sprint1.övningar.övning4Större;


abstract class Person {
    
    protected String name;
    protected String personnummer;
    
    Person(){}
    
    Person(String name, String personnummer){
        this.name = name;
        this.personnummer = personnummer;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

}

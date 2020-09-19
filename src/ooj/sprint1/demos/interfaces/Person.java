package ooj.sprint1.demos.interfaces;

public abstract class Person {
    
    private String name;
    
    Person (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
}
package ooj.sprint1.demos.interfaces;

public abstract class Person implements IPartyAnimal {
    
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

    public String getFavoriteSnack() {
        return "Dillchips";
    }
}
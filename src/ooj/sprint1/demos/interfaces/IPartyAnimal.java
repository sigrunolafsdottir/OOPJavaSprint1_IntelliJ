package ooj.sprint1.demos.interfaces;

public abstract interface IPartyAnimal {

    public String i = "hej";
    
    String getFavoriteSnack();

    default String getFavouriteDrink(){
        return "Beer";
    }
}
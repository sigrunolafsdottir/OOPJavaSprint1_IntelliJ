package ooj.sprint1.demos.interfaces;

public interface IPartyAnimal {
    
    public String getFavoriteSnack();

    default String getFavouriteDrink(){
        return "Beer";
    }
}
package ooj.sprint1.demos.interfaces;

public class Student extends Person  {
    
    private String kurs;
    
    public Student(String namn, String kurs){
        super(namn);
        this.kurs = kurs;
    }

     public String getFavoriteSnack() {
        return "Popcorn";
    }

    @Override
    public String getFavouriteDrink() {
        return "Water";
    }


}
package ooj.sprint1.demos.enums;

public class Day{

    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, 
        FRIDAY, SATURDAY, SUNDAY
    }
    
    protected Weekday dayName;
    
    
    Day(Weekday dayName){
        this.dayName = dayName;
    }
    
    
    public static void main(String[] args){
        
        Day day1 = new Day(Weekday.MONDAY);
        Day day2 = new Day(Weekday.TUESDAY);
        
//        System.out.println(day1.dayName);
        
//        System.out.println(Weekday.THURSDAY);
        Weekday w = Weekday.FRIDAY;
//        System.out.println(w.name());
//        System.out.println(w.toString());
//        System.out.println(w.ordinal());
//        
//        Weekday w2 = 
//            Enum.valueOf(Weekday.class, "SATURDAY") ;
//        System.out.println(w2);

//skapar en array med alla veckodagarna
        Weekday[] weekdays = Weekday.values();
        Weekday test = Weekday.values()[2];
        System.out.println(test);
//        for (Weekday w3: weekdays){
//            System.out.println(w3);
//        }
        
    }
    
}

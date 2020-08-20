package ooj.sprint1.övningar.övning9;


public enum RomerskaSiffror {
    I(1, "ett"), V(5, "fem"), X(10, "tio"), L(50, "femtio"), 
    C(100, "hundra"), D(500, "femhundra"), M(1000, "tusen");
    
    private final Integer  digit;
    private final String  aString;
        
    RomerskaSiffror (Integer digit, String s)  {
        this.digit = digit;
        this.aString = s;
    }
    
    Integer getDigit(){
        return digit;
    }
    
    String getString(){
        return aString;
    }
}


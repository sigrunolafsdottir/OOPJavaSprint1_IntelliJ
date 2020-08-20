package ooj.sprint1.övningar.övning3b;

abstract class Person {
    
    protected String namn;
    protected String personnummer;
    
    Person(){}
    
    Person(String namn, String personnummer){
        this.namn = namn;
        this.personnummer = personnummer;
    }
    
    public String getNamn(){
        return namn;
    }

}

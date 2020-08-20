package ooj.sprint1.övningar.övning1;

public class Bil {
    protected String registreringsnummer;
    protected String bilmärke;
    protected Bilägare ägare;
    
    public Bil(String registreringsnummer, String bilmärke) {
        this.registreringsnummer = registreringsnummer;
        this.bilmärke = bilmärke;
    }
    
    public void ägsAv(Bilägare nyeÄgaren){
        ägare = nyeÄgaren;
    }
    
    public void såld(){
        ägare = null;
    }
    
    public Bilägare getBilägare(){
        return ägare;
    }
    
    public String getRegNummer(){
        return registreringsnummer;
    }
    
    public String getSort(){
        return bilmärke;
    }
}
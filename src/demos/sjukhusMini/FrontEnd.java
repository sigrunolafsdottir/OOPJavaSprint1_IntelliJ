package ooj.sprint1.demos.sjukhusMini;

import java.util.List;


public class FrontEnd {
    
    public void printAddress(IAddressee a){
        System.out.println(a.getName());
        System.out.println(a.getAddress());
        System.out.println();
    }
    
    public FrontEnd(){
    
        Backend backend = new Backend();
        List <IAddressee> allPersons = backend.getAllAdressees();
        
        for (IAddressee a : allPersons){
            printAddress(a);
        }
    }
    
    public static void main(String[] args){
        FrontEnd frontEnd = new FrontEnd();
    }

}

package ooj.sprint1.demos.sjukhus;

import java.util.List;


public class PatientLister {
    
    public void printPatients(IPatient p){
        if (p.isPatient()){
            System.out.println(p.getName());
        }
    }
    
    public PatientLister(){
        Backend backend = new Backend();
        List <IPatient> patients = backend.getAllPatients();
        
        for (IPatient a : patients){
            printPatients(a);
        }
    }
    
    public static void main(String[] args){
        PatientLister p = new PatientLister();
    }

}

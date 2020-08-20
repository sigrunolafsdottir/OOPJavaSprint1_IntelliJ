package ooj.sprint1.demos.sjukhus;

import java.util.List;


public class HospitalEmployeeLister {
    
    public void printPatients(IHospitalEmployee p){
        if (p.isHospitalEmployee()){
            System.out.println(p.getName());
        }
    }
    
    public HospitalEmployeeLister(){
        Backend backend = new Backend();
        List <IHospitalEmployee> patients = backend.getAllHospitalEmployees();
        
        for (IHospitalEmployee a : patients){
            printPatients(a);
        }
    }
    
    public static void main(String[] args){
        HospitalEmployeeLister p = new HospitalEmployeeLister();
    }

}

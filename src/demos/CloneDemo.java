package ooj.sprint1.demos;

import java.util.logging.Level;
import java.util.logging.Logger;


class CloneDemo extends Godsak implements Cloneable{
    
    boolean gräddad;
    String form;
    Pepparkaka p = new Pepparkaka(true, "gran", 23);
    
    public CloneDemo(boolean gräddad, String form){
        this.gräddad = gräddad;
        this.form = form;
    }
    
    public static void  main (String[] args){
        
        CloneDemo c1 = new CloneDemo(true, "gris");
        try {
            CloneDemo c2 = (CloneDemo) c1.clone();
            System.out.println("c1 gräddad: " + c1.gräddad +" c2 gräddad: " + c2.gräddad);
            System.out.println("c1 form: " + c1.form +" c2 form: " + c2.form);
            System.out.println("c1 pepparkaka: " + c1.p.gräddad +" c2 pepparkaka: " + c2.p.gräddad);
            System.out.println("c1 pepparkaka: " + c1.p.form +" c2 pepparkaka: " + c2.p.form);
        } catch (CloneNotSupportedException ex) {
            System.out.println("Error happened");
        }
        
    }
}







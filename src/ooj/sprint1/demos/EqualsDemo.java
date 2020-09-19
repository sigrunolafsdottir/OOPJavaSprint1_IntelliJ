package ooj.sprint1.demos;


public class EqualsDemo {
    
    public static void main (String[] args){
        Huvud h1 = new Huvud(3);
        Huvud h2 = new Huvud(4);
        Huvud h3 = new Huvud(3);
        
        Object o = h3;
        String s = "fdsfds";
        
//        System.out.println(h1.equals(h2));
//        System.out.println(h1.equals(h3));

        System.out.println(h1.equals(o));
    }

}

class Huvud{
    int antalÖgon;
    
    Huvud(int antalÖgon){
        this.antalÖgon = antalÖgon;
    }
    
    public boolean equals(Huvud h1){
        if (this.antalÖgon == h1.antalÖgon){
            return true;
        }
        return false;
    }
    
//    public boolean equals(Object o){
//        if (o == null || o.getClass() != getClass()){
//            return false;
//        }
//        else{
//            Huvud h = (Huvud) o;
//            if (this.antalÖgon == h.antalÖgon){
//                return true;
//            }
//        }
//        return false;
//    }
}

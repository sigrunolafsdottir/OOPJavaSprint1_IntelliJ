package ooj.sprint1.demos;

public class RecursionDemo {
   protected static int faculty(int i){
       System.out.println("in faculty "+i);
        if ( i <= 0){
            return 1;
        }
        else {
            return i * faculty(i-1);
       }
    }
    
    public static void main(String[] args){
        System.out.println(faculty(3));
        //System.out.println(faculty(10));
    }
}


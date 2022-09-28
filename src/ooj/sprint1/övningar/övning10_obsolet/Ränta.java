package ooj.sprint1.övningar.övning10_obsolet;

public class Ränta {
    
   protected static double moneyInBank(int years, 
           double interest, double amount){
        if (years == 0){
            return amount;
        }
        else {
            return moneyInBank(--years, interest, 
                    amount+ amount * interest);
       }
    }
    
    public static void main(String[] args){
    //    System.out.println(moneyInBank(1, 0.1, 100));
//        System.out.println(moneyInBank(2, 0.1, 100));
        System.out.println(moneyInBank(3, 0.1, 100));
//        System.out.println(moneyInBank(4, 0.1, 100));
//        System.out.println(moneyInBank(5, 0.1, 100));
    }
}


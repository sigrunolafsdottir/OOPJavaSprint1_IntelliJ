package ooj.sprint1.övningar.övning10;

//Vi skickar in ett index och får veta vilket tal som motsvarar det indexet
//indexeringen börjar på noll

//Fibonacci-sekvensen:
//0,1,1,2,3,5,8,13,21

public class Fibonacci {
    public static int fibonacci(int n) {
        //System.out.println("in fibocacci function " +n);
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args){
//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(2));
//        System.out.println(fibonacci(3));   //2
//        System.out.println(fibonacci(4));   //3
//        System.out.println(fibonacci(5));   //5
//        System.out.println(fibonacci(6));
//        System.out.println(fibonacci(7));
//        System.out.println(fibonacci(8));
    }
}

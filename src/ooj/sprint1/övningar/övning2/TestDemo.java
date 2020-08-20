package ooj.sprint1.övningar.övning2;


public class TestDemo {

    int i1 = 4;
    int i2=5;
    
    public void mainprogram(){
        //bla bla
        System.out.println("hej "+i1);
    }
    
    public TestDemo(){
        mainprogram();
    }
    
    public static void main(String args[]){
        TestDemo td = new TestDemo();
    }
}

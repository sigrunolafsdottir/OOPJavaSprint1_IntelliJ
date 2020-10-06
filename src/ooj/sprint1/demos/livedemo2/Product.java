package ooj.sprint1.demos.livedemo2;

public class Product {

    private int price;
    private String productCode;

    public Product(){

    }

    public Product(int price, String productCode){
        this.price = price;
        this.productCode = productCode;
    }

    public void printMe(){
        System.out.println("I'm a product, my price is "+price);
    }

    public int getPrice(){
        return price;
    }

}

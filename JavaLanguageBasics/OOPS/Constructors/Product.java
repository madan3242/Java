public class Product {
    int productId = 102;
    String productName = "Product 1";

    Product(){
        System.out.println("Product Name : "+productName);
        System.out.println("Product ID : "+productId);
    }
    Product(int productId, String productName){
        this.productId = productId;
        this.productName = productName;

        System.out.println("Product Name : "+productId);
        System.out.println("Product ID : "+productName);
    }
    
    Product(String productName, int productId){
        this.productName = productName;
        this.productId = productId;
    }
    public static void main(String[] args) {
        Product p = new Product(102, "Hello Techno");
        Product p2 = new Product();

        Product p3 = new Product("Cool", 103);
        System.out.println("Product Name : "+p3.productId);
        System.out.println("Product ID : "+p3.productName);
    }
}

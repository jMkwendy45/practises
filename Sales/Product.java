package Sales;

public class Product {
    private String productName;
    private ProductType ProductType;
    private  int quantity;
    private int price;
    private int [][] total = new int[5][4];

    public Product(String productName, Sales.ProductType productType, int quantity, int price, int[][] total) {
        this.productName = productName;
        ProductType = productType;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

}


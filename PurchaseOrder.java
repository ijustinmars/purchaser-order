import java.util.Date;

public class PurchaseOrder {
    private int id = 0;
    private String description;
    private Date date;
    private Customer customer;
    private Product[] products;
    private int indexProducts = 0;

    private static int finishId = 0;

    public PurchaseOrder(String description) {
        this.description = description;
        this.id = ++finishId;
        this.products = new Product[4];
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public PurchaseOrder addProduct(Product product){
        if (indexProducts < this.products.length) {
            this.products[indexProducts++] = product;
        }
        return this;
    }

    public int totalProducts(){
        int totalPrice = 0;
        for (Product product:products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

}

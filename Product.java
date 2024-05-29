public class Product {
    private String maker;
    private String name;
    private int price;

    public Product(String maker, String name, int price) {
        this.maker = maker;
        this.name = name;
        this.price = price;
    }

    public Product(){
        this.price = getPrice();
    }

    public String getMaker() {
        return maker;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

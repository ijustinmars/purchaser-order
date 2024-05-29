import java.util.Calendar;
import java.util.Date;

public class ExamplePurchaseOrder {
    public static void main(String[] args) {

        PurchaseOrder orderOne = new PurchaseOrder("Lacteos");
        orderOne.setCustomer(new Customer("Justin", "Hidalgo"));
        orderOne.setDate(new Date());
        orderOne.addProduct(new Product("Dos Pinos", "Leche Pinito", 30));
        orderOne.addProduct(new Product("Kraft", "Queso duro", 15));
        orderOne.addProduct(new Product("Galbani", "Queso Mozarella", 50));
        orderOne.addProduct(new Product("Trebolac", "Queso crema", 20));

        PurchaseOrder orderTwo = new PurchaseOrder("Productos de aseo personal");
        orderTwo.setCustomer(new Customer("Alicia", "Martinez"));
        orderTwo.setDate(new Date());
        orderTwo.addProduct(new Product("Dove", "Paquete de jabon Dove", 40));
        orderTwo.addProduct(new Product("Nivea", "Crema facial", 70));
        orderTwo.addProduct(new Product("Nivea Men", "Desodortante", 50));
        orderTwo.addProduct(new Product("Colgate", "Pasta de dientes", 50));


        PurchaseOrder orderThree = new PurchaseOrder("Snaks");
        orderThree.setCustomer(new Customer("Pepe", "Torres"));
        orderThree.setDate(new Date());
        orderThree.addProduct(new Product("Ferro", "Huevo Kinder", 25));
        orderThree.addProduct(new Product("Bon o Bon", "Caja de chocolates Bon o Bon", 60));
        orderThree.addProduct(new Product("Fillers", "Picarones", 20));
        orderThree.addProduct(new Product("Shakalaka", "Caja de jugos Shakalaka", 80));

        PurchaseOrder[] orders = {orderOne, orderTwo, orderThree};

        for(PurchaseOrder order: orders){
            System.out.println("\nCompra no. " + order.getId());
            System.out.println("Emision de la factura: " + order.getDate());
            System.out.println("Nombre: " + order.getCustomer().getName() + " " + order.getCustomer().getLastname());
            System.out.println("Descripcion: " + order.getDescription());
            System.out.println("Productos");

            int i = 1;
            for (Product product : order.getProducts()) {
                System.out.println("\tProducto " + i + " - " + product.getMaker() + " " + product.getName() + " con valor de Q." + product.getPrice());
                i++;
            }

            System.out.println("\tTotal: Q." + order.totalProducts());
        }


    }
}

package abstractfactory;

// Client
public class FactoryMethod {
    public static void main(String[] args) {
        System.out.println("=== Italian Pizzeria ===");
        Pizzeria italian = new ItalianPizzeria();
        italian.orderPizza();

        System.out.println("=== American Pizzeria ===");
        Pizzeria american = new AmericanPizzeria();
        american.orderPizza();
    }
}

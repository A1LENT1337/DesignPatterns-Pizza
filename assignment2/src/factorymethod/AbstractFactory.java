package factorymethod;

// Client
public class AbstractFactory {
    public static void main(String[] args) {
        // Select Italian pizza
        System.out.println("=== Italian Pizzeria ===");
        PizzeriaFactory italianFactory = new ItalianPizzeriaFactory();
        Pizza italianPizza = italianFactory.createPizza();
        Drink italianDrink = italianFactory.createDrink();
        italianPizza.prepare();
        italianDrink.serve();

        // Select American pizza
        System.out.println("=== American Pizzeria ===");
        PizzeriaFactory americanFactory = new AmericanPizzeriaFactory();
        Pizza americanPizza = americanFactory.createPizza();
        Drink americanDrink = americanFactory.createDrink();
        americanPizza.prepare();
        americanDrink.serve();
    }
}

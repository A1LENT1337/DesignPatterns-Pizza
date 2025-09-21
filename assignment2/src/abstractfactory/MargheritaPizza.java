package abstractfactory;

// Concrete Products
class MargheritaPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Margherita Pizza with tomatoes and mozzarella...");
    }
}

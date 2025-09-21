package factorymethod;

// Concrete Products - Italian style
class MargheritaPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Margherita Pizza with tomatoes and mozzarella...");
    }
}

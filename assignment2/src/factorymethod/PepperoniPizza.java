package factorymethod;

// Concrete Products - American style
class PepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza with spicy sausage...");
    }
}

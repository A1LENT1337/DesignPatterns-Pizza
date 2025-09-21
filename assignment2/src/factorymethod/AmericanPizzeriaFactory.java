package factorymethod;

class AmericanPizzeriaFactory implements PizzeriaFactory {
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
    public Drink createDrink() {
        return new Cola();
    }
}

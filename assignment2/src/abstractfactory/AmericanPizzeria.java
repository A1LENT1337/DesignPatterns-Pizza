package abstractfactory;

class AmericanPizzeria extends Pizzeria {
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

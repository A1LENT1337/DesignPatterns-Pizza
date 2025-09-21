package abstractfactory;

// Concrete Creators
class ItalianPizzeria extends Pizzeria {
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
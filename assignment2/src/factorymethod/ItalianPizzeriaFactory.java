package factorymethod;

// Concrete Factories
class ItalianPizzeriaFactory implements PizzeriaFactory {
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
    public Drink createDrink() {
        return new Wine();
    }
}

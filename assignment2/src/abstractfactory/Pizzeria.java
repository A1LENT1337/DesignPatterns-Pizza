package abstractfactory;

// Creator
abstract class Pizzeria {
    // фабричный метод
    public abstract Pizza createPizza();

    // общий метод
    public void orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
    }
}

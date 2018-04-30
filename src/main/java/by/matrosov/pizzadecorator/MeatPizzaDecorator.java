package by.matrosov.pizzadecorator;

public class MeatPizzaDecorator extends PizzaDecorator {

    Pizza pizza;

    public MeatPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", meat added";
    }

    public double getPrice() {
        return pizza.getPrice() + 10;
    }
}

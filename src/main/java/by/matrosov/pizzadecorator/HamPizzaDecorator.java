package by.matrosov.pizzadecorator;

public class HamPizzaDecorator extends PizzaDecorator{

    Pizza pizza;

    public HamPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", ham added";
    }

    public double getPrice() {
        return pizza.getPrice() + 5;
    }
}

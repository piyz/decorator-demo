package by.matrosov.pizzadecorator;

public class SimpleNonVegeterianPizza implements Pizza{
    public String getDescription() {
        return "Simple pizza";
    }

    public double getPrice() {
        return 1;
    }
}

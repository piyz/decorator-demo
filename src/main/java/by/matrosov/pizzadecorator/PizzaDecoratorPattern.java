package by.matrosov.pizzadecorator;

public class PizzaDecoratorPattern implements RunnableTask {

    public void init() {
        //ну можно создать пиццу
        SimpleNonVegeterianPizza simplePizza = new SimpleNonVegeterianPizza();
        //simplePizza.getDescription();
        //simplePizza.getPrice();

        //добавить в нее один ингредиент
        HamPizzaDecorator hamPizza = new HamPizzaDecorator(simplePizza);
        //hamPizza.getDescription();
        //hamPizza.getPrice();

        //добавить другой
        MeatPizzaDecorator meatPizza = new MeatPizzaDecorator(hamPizza);

        //получить конечную стоимость
        meatPizza.getDescription();
        meatPizza.getPrice();
    }

    public void runTask() {
        //???????????????
    }

    public void logTaskName() {
        //????????????
    }

    public void log(Object message) {
        //???????????
    }

    public void logLine(Object message) {
        //??????????????
    }

    public void run() {
        ///??????????
        init();
        runTask();
    }
}

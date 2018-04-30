package by.matrosov.pizzadecorator;

public interface RunnableTask {
    void init();
    void runTask();
    void logTaskName();
    void log(Object message);
    void logLine(Object message);
    void run();
}

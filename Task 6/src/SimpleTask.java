public class SimpleTask extends Task {
    @Override
    protected void initialize() {
        System.out.println("Инициализация простой задачи.");
    }
    @Override
    protected void execute() {
        System.out.println("Выполнение простой задачи.");
    }
    @Override
    protected void complete() {
        System.out.println("Завершение простой задачи.");
    }
}

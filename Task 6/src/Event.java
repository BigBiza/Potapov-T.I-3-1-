public class Event extends Task {
    @Override
    protected void initialize() {
        System.out.println("Инициализация события.");
    }
    @Override
    protected void execute() {
        System.out.println("Проведение события.");
    }
    @Override
    protected void complete() {
        System.out.println("Завершение события.");
    }
}

public class Project extends Task {
    @Override
    protected void initialize() {
        System.out.println("Инициализация проекта.");
    }
    @Override
    protected void execute() {
        System.out.println("Выполнение проекта.");
    }
    @Override
    protected void complete() {
        System.out.println("Завершение проекта.");
    }
}

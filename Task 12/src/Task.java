public class Task implements TaskCreator{
    private String name;
    public Task(String name) {
        this.name=name;
    }
    @Override
    public void addTask() {

    }

    @Override
    public void removeTask() {

    }

    @Override
    public void showInfo() {
        System.out.println("Задача: " + name);
    }
}

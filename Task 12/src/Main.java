public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Сделать хоть что-то");
        Task task2 = new Task("Сделать почти все");
        Task task3 = new Task("Загнаться что ничего не получается и ты никому не нужен и спиться");


        Stage stage = new Stage("Основа");
        stage.add(task1);
        stage.add(task2);
        stage.remove(task1);

        Project project = new Project("Жизнь");
        project.add(stage);
        project.add(task3);
        project.showInfo();
    }
}
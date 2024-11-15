public class Main {
    public static void main(String[] args) {
        Task simpleTask = new SimpleTask();
        simpleTask.manageTask();

        Task project = new Project();
        project.manageTask();

        Task event = new Event();
        event.manageTask();
    }
}

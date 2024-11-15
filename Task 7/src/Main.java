public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.setTeacher(new Homework());
        Task task = teacher.createTask();

        System.out.println(task);
    }
}

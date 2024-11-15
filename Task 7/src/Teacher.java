public class Teacher {
    TaskCreator teacher;
    public void setTeacher(TaskCreator teacher) {
        this.teacher = teacher;
    }

    Task createTask() {
        teacher.createTask();
        teacher.setDescription();
        teacher.setPriority();
        teacher.setDate();

        return teacher.getTask();
    }
}

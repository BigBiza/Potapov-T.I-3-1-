public abstract class TaskCreator {
    Task task;
    public void createTask (){
        task = new Task();
    }

    abstract void setDescription();
    abstract void setPriority();
    abstract void setDate();
    Task getTask() {
        return task;
    }
}

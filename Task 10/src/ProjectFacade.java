class ProjectFacade {
    private Task task;
    private Deadline deadline;
    private Resource resource;

    public ProjectFacade(String taskName, String taskDescription, String deadlineDate, String resourceName) {
        this.task = new Task(taskName, taskDescription);
        this.deadline = new Deadline(deadlineDate);
        this.resource = new Resource(resourceName);
    }

    public void displayProjectDetails() {
        System.out.println("Детали проекта:");
        task.displayTask();
        deadline.displayDeadline();
        resource.displayResource();
    }
}

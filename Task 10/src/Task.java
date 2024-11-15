class Task {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void displayTask() {
        System.out.println("Задача: " + name);
        System.out.println("Описание: " + description);
    }
}

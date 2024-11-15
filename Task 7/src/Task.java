public class Task {
    private String description;
    private String priority;
    private String date;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return "Задача:\n" +
                "Описание = " + description +
                ",\nПриоритет = " + priority +
                ",\nДата = " + date;
    }
}
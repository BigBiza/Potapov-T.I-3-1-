import java.util.ArrayList;
import java.util.List;

public class Project implements TaskCreator {
    private final List<TaskCreator> creatorList;
    private String projectName;

    public Project(String projectName) {
        this.projectName= projectName;
        this.creatorList = new ArrayList<>();
    }

    public void add(TaskCreator task) {
        creatorList.add(task);
    }

    public void remove(TaskCreator task) {
        creatorList.remove(task);
    }

    @Override
    public void addTask() {
        for (TaskCreator task : creatorList) {
            task.addTask();
        }
    }

    @Override
    public void removeTask() {
        for (TaskCreator task : creatorList) {
            task.removeTask();
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Проект: " + projectName);
        for (TaskCreator music : creatorList) {
            music.showInfo();
        }
    }
}
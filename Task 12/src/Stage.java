import java.util.ArrayList;
import java.util.List;

public class Stage implements TaskCreator {
    private final List<TaskCreator> creatorList;
    private String stageName;

    public Stage(String stageName) {
        this.stageName = stageName;
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
        System.out.println("Этап: " + stageName);
        for (TaskCreator music : creatorList) {
            music.showInfo();
        }
    }
}

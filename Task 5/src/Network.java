import java.util.ArrayList;
import java.util.List;

public class Network implements Observed{
    private List<String> observers = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();
    public void add(String observer) {
        this.observers.add(observer);
    }
    public void remove(String observer) {
        this.observers.remove(observer);
    }
    @Override
    public void addObserver(Observer observer) {
        this.users.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        this.users.remove(observer);
    }
    @Override
    public void notifyObserver() {
        for (Observer observer : users) {
            observer.activeDevice(this.observers);
        }
    }
}

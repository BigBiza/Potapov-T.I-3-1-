import java.util.concurrent.locks.ReentrantLock;

public class ResourceSynchronizer {
    private final ReentrantLock lock = new ReentrantLock();
    private int resourceValue;

    public ResourceSynchronizer(int initialValue) {
        this.resourceValue = initialValue;
    }

    public int getResourceValue() {
        lock.lock();
        try {
            return resourceValue;
        } finally {
            lock.unlock();
        }
    }

    public void setResourceValue(int newValue) {
        lock.lock();
        try {
            this.resourceValue = newValue;
        } finally {
            lock.unlock();
        }
    }

    public void incrementResourceValue() {
        lock.lock();
        try {
            this.resourceValue++;
        } finally {
            lock.unlock();
        }
    }
}
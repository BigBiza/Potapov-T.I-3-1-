import java.util.ArrayList;
import java.util.List;

class ConfigurationCaretaker {
    private List<ConfigurationSnapshot> snapshots = new ArrayList<>();

    public void addSnapshot(ConfigurationSnapshot snapshot) {
        snapshots.add(snapshot);
    }

    public ConfigurationSnapshot getSnapshot(int index) {
        return snapshots.get(index);
    }

    public int getSnapshotCount() {
        return snapshots.size();
    }
}

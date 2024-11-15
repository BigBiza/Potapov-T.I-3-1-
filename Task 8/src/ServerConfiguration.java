import java.util.ArrayList;
import java.util.List;

class ServerConfiguration {
    private List<String> settings;

    public ServerConfiguration() {
        this.settings = new ArrayList<>();
    }

    public void addSetting(String setting) {
        settings.add(setting);
    }

    public List<String> getSettings() {
        return new ArrayList<>(settings);
    }

    public void setSettings(List<String> settings) {
        this.settings = new ArrayList<>(settings);
    }

    @Override
    public String toString() {
        return "ServerConfiguration{" +
                "settings=" + settings +
                '}';
    }
}

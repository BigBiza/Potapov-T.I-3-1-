import java.util.ArrayList;
import java.util.List;

class ServerConfigurationSnapshot implements ConfigurationSnapshot {
    private final List<String> savedSettings;

    public ServerConfigurationSnapshot(ServerConfiguration configuration) {
        this.savedSettings = configuration.getSettings();
    }

    @Override
    public List<String> getSavedSettings() {
        return new ArrayList<>(savedSettings);
    }
}

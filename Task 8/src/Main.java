public class Main {
    public static void main(String[] args) {
        ServerConfiguration server = new ServerConfiguration();
        ConfigurationCaretaker caretaker = new ConfigurationCaretaker();

        server.addSetting("port:8080");
        server.addSetting("max_connections:100");
        System.out.println("Initial configuration: " + server);
        caretaker.addSnapshot(new ServerConfigurationSnapshot(server));

        server.addSetting("cache_enabled:true");
        System.out.println("Modified configuration: " + server);
        caretaker.addSnapshot(new ServerConfigurationSnapshot(server));

        ConfigurationSnapshot snapshot = caretaker.getSnapshot(0);
        server.setSettings(snapshot.getSavedSettings());

        System.out.println("Restored configuration: " + server);

        for (int i = 0; i < caretaker.getSnapshotCount(); i++) {
            ConfigurationSnapshot snap = caretaker.getSnapshot(i);
            System.out.println("Snapshot " + i + ": " + snap.getSavedSettings());
        }
    }
}

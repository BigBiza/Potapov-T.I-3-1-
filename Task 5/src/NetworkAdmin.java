import java.util.List;

class NetworkAdmin implements Observer {
    private String name;
    public NetworkAdmin(String name) {
        this.name = name;
    }
    @Override
    public void activeDevice(List<String> observer) {
        System.out.println(name + ", вот список активных устройств:\n" + observer);
    }
}

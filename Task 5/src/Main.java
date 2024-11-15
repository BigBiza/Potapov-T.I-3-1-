public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        network.add("1 компьютер сломан");
        network.add("На 2 компьютере сбой");

        Observer admin = new NetworkAdmin("BigBiza");
        Observer admin1 = new NetworkAdmin("Admin");

        network.addObserver(admin);
        network.notifyObserver();
        network.remove("1 компьютер сломан");
        network.remove("На 2 компьютере сбой");
        network.add("Все компьютеры исправны");
        network.notifyObserver();
    }
}


public class Main {
    public static void main(String[] args) {
        ResourceSynchronizer synchronizer = new ResourceSynchronizer(0);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronizer.incrementResourceValue();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronizer.incrementResourceValue();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Значение ресурса: " + synchronizer.getResourceValue());
    }
}


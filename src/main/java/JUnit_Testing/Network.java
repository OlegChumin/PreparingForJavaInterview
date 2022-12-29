package JUnit_Testing;

public class Network {
    public static void getConnection() {
        // ....
        return;
    }

    public static void getConnectionWithDelay() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}

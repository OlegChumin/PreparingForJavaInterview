import JUnit_Testing.Network;
import org.junit.Ignore;
import org.junit.Test;

public class NetworkTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThenOneSecond() {
        Network.getConnection();
    }

//    @Ignore
    @Test(timeout = 1499)
    public void getConnectionWithDelayShouldReturnFasterThenOneSecond() {
        Network.getConnectionWithDelay();
    }
}

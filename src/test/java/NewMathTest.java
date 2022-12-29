import JUnit_Testing.NewMath;
import org.junit.Test;

public class NewMathTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        NewMath.divide(1, 0);
    }
}

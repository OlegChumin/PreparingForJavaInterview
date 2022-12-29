import JUnit_Testing.Vector3D;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Vector3DTest {

    @Test
    public void newVector3DShouldHaveZeroLength() {
        Vector3D vector3D = new Vector3D();
        Assert.assertEquals(0, vector3D.vector3DLength(), 1e-9); // 1e-9 = 0.000 000 001
    }

    @Ignore
    @Test
    public void newVector3DShouldHaveZeroLengthNew() {
        Vector3D vector3D = new Vector3D();
        Assert.assertEquals(0, vector3D.vector3DLengthNew(), 1e-9); // 1e-9 = 0.000 000 001
    }

    @Test
    public void newVector3DShouldHaveZeroX() {
        Vector3D vector3D = new Vector3D();
        Assert.assertEquals(0, vector3D.getX(), 1e-9); // 1e-9 = 0.000 000 001
    }

    @Test
    public void newVector3DShouldHaveZeroY() {
        Vector3D vector3D = new Vector3D();
        Assert.assertEquals(0, vector3D.getY(), 1e-9); // 1e-9 = 0.000 000 001
    }

    @Test
    public void newVector3DShouldHaveZeroZ() {
        Vector3D vector3D = new Vector3D();
        Assert.assertEquals(0, vector3D.getZ(), 1e-9); // 1e-9 = 0.000 000 001
    }

}

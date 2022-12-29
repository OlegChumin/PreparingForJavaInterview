import JUnit_Testing.Vector3D;
import org.junit.*;

public class Vector3DNewTest {
    private final double DELTA = 1e-9;
    private static Vector3D  vector3D;

    @BeforeClass
    public static void createVector3D() {
        vector3D = new Vector3D();
    }

//    @Before
//    public void createVector3D() {
//        vector3D = new Vector3D();
//    }
//

    @Test
    public void newVector3DShouldHaveZeroLength() {
        Assert.assertEquals(0, vector3D.vector3DLength(), DELTA); // 1e-9 = 0.000 000 001
    }

    @Ignore
    @Test
    public void newVector3DShouldHaveZeroLengthNew() {
        Assert.assertEquals(0, vector3D.vector3DLengthNew(), DELTA); // 1e-9 = 0.000 000 001
    }

    @Test
    public void newVector3DShouldHaveZeroX() {
        Assert.assertEquals(0, vector3D.getX(), DELTA); // 1e-9 = 0.000 000 001
    }

    @Test
    public void newVector3DShouldHaveZeroY() {
        Assert.assertEquals(0, vector3D.getY(), DELTA); // 1e-9 = 0.000 000 001
    }

    @Test
    public void newVector3DShouldHaveZeroZ() {
        Assert.assertEquals(0, vector3D.getZ(), DELTA); // 1e-9 = 0.000 000 001
    }

}

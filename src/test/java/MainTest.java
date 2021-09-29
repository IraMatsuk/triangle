import org.testng.annotations.BeforeClass;

public class MainTest {
    protected Triangle triangle;

    @BeforeClass
    public void setUp() {
        triangle = new Triangle(0, 0, 0);
    }
}
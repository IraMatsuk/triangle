import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest extends MainTest {

    @DataProvider(name = "positiveData")
    public Object[][] positiveData() {
        return new Object[][]{
                {triangle.setSides(1, 2500, 3).isPositiveNumbers(), true},
                {triangle.setSides(10, 25040, 10).isPositiveNumbers(), true},
                {triangle.setSides(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE).isPositiveNumbers(), true},
                {triangle.setSides(-1, 1, 1).isPositiveNumbers(), false},
                {triangle.setSides(0, 20, 35).isPositiveNumbers(), false},
                {triangle.setSides(0, -1, Integer.MAX_VALUE).isPositiveNumbers(), false}
        };
    }

    @DataProvider(name = "triangleData")
    public Object[][] triangleData() {
        return new Object[][]{
                {triangle.setSides(3, 4, 5).isTriangle(), true},
                {triangle.setSides(10, 10, 15).isTriangle(), true},
                {triangle.setSides(1000000000, 1000000000, 1000000000).isTriangle(), true},
                {triangle.setSides(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE).isTriangle(), false},
                {triangle.setSides(32, 1540000, 7200).isTriangle(), false},
                {triangle.setSides(3, 1, 1).isTriangle(), false}
        };
    }

    @DataProvider(name = "equilateralTriangleData")
    public Object[][] equilateralTriangleData() {
        return new Object[][] {
                {triangle.setSides(1, 1, 1).isEquilateralTriangle(), true},
                {triangle.setSides(254, 254, 254).isEquilateralTriangle(), true},
                {triangle.setSides(1000000000, 1000000000, 1000000000).isEquilateralTriangle(), true},
                {triangle.setSides(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE).isEquilateralTriangle(), true},
                {triangle.setSides(125000, 125000, 124999).isEquilateralTriangle(), false},
                {triangle.setSides(10, 5, 3).isEquilateralTriangle(), false},
                {triangle.setSides(2, 2, 1).isEquilateralTriangle(), false}
        };
    }

    @DataProvider(name = "isoscelesTriangleData")
    public Object[][] isoscelesTriangleData() {
        return new Object[][] {
                {triangle.setSides(2, 2, 1).isIsoscelesTriangle(), true},
                {triangle.setSides(1000000000, 1000000000, 1000000001).isIsoscelesTriangle(), true},
                {triangle.setSides(820, 820, 821).isIsoscelesTriangle(), true},
                {triangle.setSides(10, 10, 5).isIsoscelesTriangle(), true},
                {triangle.setSides(2, 3, 4).isIsoscelesTriangle(), false}
        };
    }

    @Test(dataProvider = "positiveData")
    public void testIsPositiveNumbers(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                "The result is not an expected");
    }

    @Test(dataProvider = "triangleData")
    public void checkIsTriangleExist(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                String.format("The triangle does%s exist.", expectedResult ? " not": ""));
    }

    @Test(dataProvider = "equilateralTriangleData")
    public void checkIsEquilateralTriangle(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                String.format("The triangle is%s equilateral.", expectedResult ? " not" : ""));
    }

    @Test(dataProvider = "isoscelesTriangleData")
    public void testIsIsoscelesTriangle(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                String.format("The triangle is%s isosceles.", expectedResult ? " not" : ""));
    }
}
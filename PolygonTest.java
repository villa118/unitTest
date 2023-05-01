

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PolygonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PolygonTest
{
    /**
     * Default constructor for test class PolygonTest
     */
    public PolygonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testEquals()
    {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        assertEquals(true, polygon1.equals(polygon2));
    }

   

    @Test
    public void testSetLength()
    {
        Polygon polygon1 = new Polygon();
        polygon1.setLength(5.0);
        assertEquals(5.0, polygon1.getLength(), 0.1);
    }

    @Test
    public void testCount()
    {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon();
        Polygon polygon3 = new Polygon();
        Polygon polygon4 = new Polygon(11, 5);
        Polygon polygon5 = new Polygon(15.6, 8);
        assertEquals(5, Polygon.getCount());
    }

    @Test
    public void testZeroLength()
    {
        Polygon polygon1 = new Polygon(0, 5);
        assertEquals(0, polygon1.getLength(), 0.1);
        polygon1.setLength(12.5);
        assertEquals(12.5, polygon1.getLength(), 0.1);
    }
}






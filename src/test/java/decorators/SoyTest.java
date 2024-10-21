package decorators;

import junit.framework.TestCase;
import models.Beverage;
import models.DarkRoast;

public class SoyTest extends TestCase {
    private Beverage beverage;
    private Soy soy;

    public void setUp() throws Exception {
        super.setUp();
        beverage = new DarkRoast();
        soy = new Soy(beverage);
    }

    public void testGetDescription() {
        assertEquals("DarkRoast, Soy", soy.getDescription());
    }

    public void testCost() {
        assertEquals(beverage.cost() + .33, soy.cost());
    }
}
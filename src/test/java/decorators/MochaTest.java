package decorators;

import junit.framework.TestCase;
import models.Beverage;
import models.HouseBlend;

public class MochaTest extends TestCase {
    private Beverage beverage;
    private Mocha mocha;

    public void setUp() throws Exception {
        super.setUp();
        beverage = new HouseBlend();
        mocha = new Mocha(beverage);
    }

    public void testGetDescription() {
        assertEquals("HouseBlend, Mocha", mocha.getDescription());
    }

    public void testCost() {
        assertEquals(beverage.cost() +.20,mocha.cost());
    }
}
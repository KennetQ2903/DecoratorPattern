package decorators;

import junit.framework.TestCase;
import models.Beverage;
import models.Espresso;

public class MilkTest extends TestCase {
    private Beverage beverage;
    private Milk withMilk;

    public void setUp() throws Exception {
        super.setUp();
        beverage = new Espresso();
        withMilk = new Milk(beverage);
    }

    public void testGetDescription() {
        assertEquals("Espresso, Milk", withMilk.getDescription());
    }

    public void testCost() {
        assertEquals(beverage.cost() + .45, withMilk.cost());
    }
}
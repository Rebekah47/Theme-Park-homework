package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitor = new Visitor(11, 180, 54);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.50, dodgems.getPrice(), 0.01);
    }

    @Test
    public void hasAlteredPrice(){
        dodgems.priceFor(visitor);
        assertEquals(2.25, dodgems.getPrice(), 0.01);
    }
}

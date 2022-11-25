package ChiefsVisit.TurtleGraphics;

import ChiefsVisit.TurtleGraphics.enums.PenPosition;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
        Pen biro = new Pen();
        turtle.setBiro(biro);
    }

    void changePenPosition() {
        assertEquals(PenPosition.UP, turtle.getBiro());
    }

}
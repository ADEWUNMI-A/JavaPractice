package Chapter7.TurtleGraphics;

import org.junit.jupiter.api.Test;

import static Chapter7.TurtleGraphics.Direction.EAST;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    @Test
    public void thatTurtleExist() {
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    public void thatTurtleCanMovePenUp() {
        Turtle turtle = new Turtle();
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void thatTurtleCanMovePenDown() {
        Turtle turtle = new Turtle();
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEast() {
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEast() {
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }

//    @Test
//    public void move(int numberOfSteps) {
//        switch (currentDirection) {
//            case EAST -->
//        }
//    }
}

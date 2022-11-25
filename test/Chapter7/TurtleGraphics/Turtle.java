package Chapter7.TurtleGraphics;

import static Chapter7.TurtleGraphics.Direction.*;


public class Turtle {

    private TurtlePen pen = new TurtlePen();
   private Direction currentDirection;
   private Position currentPosition;
    public Turtle() {
        pen.penUp();
        currentDirection = EAST;
        currentPosition = new Position(0,0);
    }
    public void penUp(){
        pen.penUp();
    }

    public boolean isPenUp() {
        return pen.isPenUp;
    }

    public void penDown() {
        pen.penDown();
    }


    public Direction getCurrentDirection () {
        return currentDirection;
    }

    public void turnRight(){
        switch (currentDirection) {
            case SOUTH -> face(WEST);
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }

    public void turnLeft(){
        switch (currentDirection) {
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

//    public void move(int numberOfSteps) {
//        switch (currentDirection) {
//            case EAST
//        }
//    }


}
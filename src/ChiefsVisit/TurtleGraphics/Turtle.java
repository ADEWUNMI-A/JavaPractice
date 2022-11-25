package ChiefsVisit.TurtleGraphics;

import ChiefsVisit.TurtleGraphics.Pen;
import ChiefsVisit.TurtleGraphics.enums.Cardinal;

public class Turtle {
    private int xCoordinate;
    private int yCoordinate;
    private Cardinal direction = Cardinal.EAST;
    private Pen biro;


    public Turtle() {
    }

    public Turtle(int x, int y) {
        xCoordinate = x;
        yCoordinate = y;
    }

    public Turtle(int x, int y, Cardinal direction) {
        this(x, y);
        this.direction = direction;
    }


    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }

    public Pen getBiro() {
        return biro;
    }

    public void setBiro(Pen biro) {
        this.biro = biro;
    }



}






package Chapter7.TurtleGraphics;

public class TurtlePen {

    public boolean isPenUp;

    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

}

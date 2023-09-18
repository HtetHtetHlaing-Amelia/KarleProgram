import stanford.karel.Karel;

public class ExGoNorthOrSouth extends Karel {

    public void run() {
        move();
        move();
        if (beepersPresent()) {

            turnLeft();
            move();
            while (noBeepersPresent()) {
move();

            }
            pickBeeper();
        } else {
            turnRight();
            while (noBeepersPresent()) {
                move();
            }
            pickBeeper();
        }
    }

    void turnRight() {
        for (int i = 0; i < 3; i++) {
            turnLeft();
        }
    }
}

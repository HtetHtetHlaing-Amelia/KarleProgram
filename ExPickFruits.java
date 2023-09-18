import stanford.karel.Karel;

public class ExPickFruits extends Karel {
    public void run() {
        while (frontIsClear()) {
            move();
        }

        if (frontIsBlocked()) {
            turnLeft();
            while (noBeepersPresent()) {
                move();
            }

            while (beepersPresent()) {
                pickBeeper();
                if (frontIsClear()) {
                    move();
                    if (beepersPresent()) {
                        pickBeeper();
                    }
                }
            }

            turnRight();
            move();
            turnRight();

            while (noBeepersPresent()) {
                move();
            }
            while (beepersPresent()) {
                pickBeeper();
                move();
            }
        }

        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }
    void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

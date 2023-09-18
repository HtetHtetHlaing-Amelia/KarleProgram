import stanford.karel.Karel;

public class ExGoAroundTheWorld extends Karel {

    public void run() {
        for (int i = 1; i < 4; i++) {
            while (frontIsClear()) {
                move();
            }
            if (frontIsBlocked()) {
                turnLeft();
                while (frontIsClear()) {
                    move();
                }
            }
        }
        turnLeft();


    }

    void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}

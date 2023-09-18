import stanford.karel.Karel;

public class ExFaceNorth extends Karel {

    public void run() {
        if (facingNorth()) {
            move();
        }
        if(facingEast()){
                turnLeft();
                move();

        }
        if (facingWest()){
               turnRight();
                move();
        }
        if(facingSouth()) {
                turnLeft();
                turnLeft();
                move();
        }

    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

}

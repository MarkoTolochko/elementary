package lesson6.space;

public class SpaceShip {

    private int size;
    private int engine;
    private int x;
    private int y;

    public SpaceShip(int engine) {
        this.engine = engine;
        this.x = 0;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "x=" + x +
                '}';
    }

    public void moveForward(){
       x = SpaceShipControls.moveX(10 ,engine);

    }

    public void moveForwardFast(){
       x = SpaceShipControls.moveXFast(20 ,engine);

    }

}

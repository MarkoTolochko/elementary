package lesson6.space;

public class SpaceShipApp {
    public static void main(String[] args) {

        SpaceShip spaceShip1 = new SpaceShip(12);
        spaceShip1.moveForward();
        System.out.println(spaceShip1);
        spaceShip1.moveForwardFast();
        System.out.println(spaceShip1);
    }
}

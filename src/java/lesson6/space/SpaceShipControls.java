package lesson6.space;

public class SpaceShipControls {

    public static int moveX(int x, int engine){
        System.out.printf("Ship moved for %s km\n", engine);
        return x + engine;
    }

    public static int moveXFast(int x, int engine){
        System.out.printf("Ship moved for %s km fast\n", engine * 2);
        return x + engine;

    }


}

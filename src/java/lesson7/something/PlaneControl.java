package lesson7.something;

import java.util.Random;
public class PlaneControl {
    Random random = new Random();
    int randomDistance = random.nextInt(1_000_000);

    public void moveUp(){

        System.out.printf("moved up by %s\n", randomDistance);
    }
    public void moveDown(){
        System.out.printf("moved down by %s\n", randomDistance);

    }
    public void moveForward(){
        System.out.printf("moved forward by %s\n", randomDistance);

    }
    public void moveBack(){
        System.out.printf("moved back by %s\n", randomDistance);

    }

}

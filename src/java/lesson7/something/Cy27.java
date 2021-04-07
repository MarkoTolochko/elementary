package lesson7.something;

import java.util.Random;

public class Cy27 extends Plane {

    public Cy27() {
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public void startPlane() {
        System.out.println("We can fly!!!!");
    }

    @Override
    public void stopPlane() {
        System.out.println("Stop me here, please!");
    }

    @Override
    public void fastMode() {
        System.out.println("FastMode is on");
    }

    @Override
    public void stealsMode() {
        System.out.println("Steals is on");
    }

    @Override
    public void nuclearBomb() {
        System.out.println("Bomb is ready go to the putin residence");
    }

    public PlaneControl getPlaneControl() {
        return planeControl;
    }

    public void setPlaneControl(PlaneControl planeControl) {
        this.planeControl = planeControl;
    }
}

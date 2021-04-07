package lesson7.something;

public abstract class Plane implements PlaneSpecial {

    public abstract void startEngine();
    public abstract void startPlane();
    public abstract void stopPlane();

    protected PlaneControl planeControl;
    protected int width;
    protected int height;
    protected int weight;

    public Plane() {

    }
    public Plane( int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

}

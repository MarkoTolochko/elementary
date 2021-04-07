package lesson7.liskovSubstitution;

public class Square implements AreaCountable {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return width*width;
    }
}

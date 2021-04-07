package lesson7.badEx;

public class GeometryApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Square();
        rectangle.setHeight(10);
        rectangle.setWidth(15);
        System.out.println( rectangle.area());

    }
}

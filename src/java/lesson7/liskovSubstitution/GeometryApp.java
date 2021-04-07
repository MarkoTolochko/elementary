package lesson7.liskovSubstitution;

public class GeometryApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(15);
        Square square = new Square();
        square.setWidth(10);
        AreaCountable areaCountable = new Rectangle();
        areaCountable.area();

        printArea(rectangle);
        printArea(square);

    }
    public static void printArea(AreaCountable areaCountable){
        System.out.println(areaCountable.area());
    }
}

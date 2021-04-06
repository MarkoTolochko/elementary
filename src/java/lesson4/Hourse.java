package lesson4;

public class Hourse {
    private int age;
    protected int legsQuantity1;
    protected String color;
    protected double height;

    public Hourse() {
    }

    public void run(){
        System.out.println("Run, horse, run");
    }

    public void speak(){
        System.out.println("Igogo");
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Hourse{" +
                "age=" + age +
                ", legsQuantity1=" + legsQuantity1 +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}

package lesson7.badEx;

public class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void swim() {
        System.out.println("duck swim");
    }
}

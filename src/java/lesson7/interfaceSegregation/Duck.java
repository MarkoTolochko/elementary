package lesson7.interfaceSegregation;


public class Duck implements CanSwim, CanFly{
    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void swim() {
        System.out.println("duck swim");
    }
}

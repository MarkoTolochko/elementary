package lesson7.interfaceSegregation;


public class Eagle implements CanFly {
    @Override
    public void fly() {
        System.out.println("eagle flies");
    }

}

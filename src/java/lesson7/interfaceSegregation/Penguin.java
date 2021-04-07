package lesson7.interfaceSegregation;



public class Penguin implements CanSwim{


    @Override
    public void swim() {
        System.out.println("penguin swim");
    }
}

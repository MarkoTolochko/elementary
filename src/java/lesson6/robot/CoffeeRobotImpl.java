package lesson6.robot;

public class CoffeeRobotImpl implements Robot{

    @Override
    public void work() {
        System.out.println("Do you want coffee??");
    }

    @Override
    public void sing() {
        System.out.println("la-la-la putin x..lo");
    }
}

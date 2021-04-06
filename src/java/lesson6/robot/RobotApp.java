package lesson6.robot;

public class RobotApp {
    public static void main(String[] args) {

        Robot robot = new CoffeeRobotImpl();
        robot.work();
        robot.sing();
    }
}

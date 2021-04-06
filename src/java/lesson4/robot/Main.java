package lesson4.robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        coffeeRobot.work();
        DancerRobot dancerRobot = new DancerRobot();
        dancerRobot.work();
        CookerRobot cookerRobot = new CookerRobot();
        cookerRobot.work();
        System.out.println("-------------------------------------");
        Robot[] robots = {robot, coffeeRobot, dancerRobot, cookerRobot};
        for (Robot r: robots){
            r.work();
        }


    }
}

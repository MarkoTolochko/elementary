package lesson4;

import lesson3.Person;

public class Application {
    public static void main(String[] args) {

        Hourse h1 = new Hourse();
        h1.run();
        h1.speak();
        System.out.println(h1);

        Pegasus pg1 = new Pegasus(2,5);
        pg1.fly();
        pg1.run();
        pg1.speak();
        System.out.println(pg1);
    }
}

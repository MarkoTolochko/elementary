package lesson3;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", "Kokos", "grey", 8);
        System.out.println(animal1);
        Animal animal2 = new Animal("Cat", "Bim", "white", 2);
        System.out.println(animal2);
        System.out.println(animal1.getName());
        animal1.setName("kokosyamba");
        System.out.println(animal1);



    }
}

package lesson5.headsTails;

import java.util.Random;
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {


        System.out.println("Enter your choice");
        System.out.println("Heads - press 1");
        System.out.println("Tails - press 2");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        Random random = new Random();
        int winningSide = 1 + random.nextInt(2);

        String randomRes = winningSide == 1 ? "Heads" : "Tails";
        System.out.println("Random choice is " + randomRes );

        if (userChoice == winningSide){
            System.out.println("You win");
        }
        else if (userChoice != winningSide){
            System.out.println("you lose");
        }
        else if(userChoice != 1 || userChoice != 2) {
            System.out.println("something went wrong!!!");
        }
    }
}

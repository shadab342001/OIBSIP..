import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random NumberGenerated = new Random();
        int Correctguess = NumberGenerated.nextInt(15);
        int NumberTried = 0;
        int NumberGuessed;
        int Max_Attempts = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello ! Welcome to the guessing game."); //welcome message

        for (int i = 1; i <= Max_Attempts; i++) {
            System.out.println("Guess a number between 0 and 15:");
            NumberGuessed = scanner.nextInt();
            NumberTried++;


            if (NumberGuessed == Correctguess) {
                System.out.println(
                        "Congratulations ! You have successfully guessed the correct number in " + NumberTried + " attempt(s)");
                break;
            } else if ( NumberGuessed < Correctguess) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }

            if (i == Max_Attempts) {
                System.out.println("Sorry, you didn't guess the number in " + Max_Attempts
                        + " attempts. The correct number was " + Correctguess);
            }
        }

        System.out.println("Thank you for playing");

        scanner.close();
    }

};
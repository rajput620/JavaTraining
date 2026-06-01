import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(10) + 1; // 1 to 10
        int guess;

        System.out.println("Guess a number between 1 and 10");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High!");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct! You guessed the number.");
            }

        } while (guess != secretNumber);

        sc.close();
    }
}
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int guessedNumber = (int) Math.round(Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first guessed number");
        int guess = input.nextInt();

        if (guess == guessedNumber) {
            System.out.println("Congratulations! Your guess is correct!");
        }
            else if (guess > guessedNumber) {
                System.out.println("Your guess is greater.");}
            else if (guess < guessedNumber) {
                System.out.println("Your guess is smaller");}
        while (guess != guessedNumber){
            System.out.println("Enter your next guess!");
            int guess2 = input.nextInt();
            if (guess2 == guessedNumber) {
                System.out.println("Congratulations! Your guess is correct!");
            }
            else if (guess2 > guessedNumber) {
                System.out.println("Your guess is greater.");}
            else if (guess2 < guessedNumber) {
                System.out.println("Your guess is smaller");}


        }
        }

    }


















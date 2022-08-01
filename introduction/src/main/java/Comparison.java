import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        //int guessedNumber = (int) Math.round(Math.random() * 100);
        // System.out.printf("random number is: %d\n", guessedNumber);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int number1 = input.nextInt();
        System.out.print("Enter second integer:");
        int number2 = input.nextInt();
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2) {
            System.out.printf("%d != %d%n", number1, number2);

        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);}
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);}
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);}
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }
        }
    }


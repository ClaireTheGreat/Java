import java.util.Scanner;

public class Multiplication {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter first integer");
        int Number1 = scanner.nextInt();

        System.out.println("Enter second integer");
        int Number2 =  scanner.nextInt();

        int product = Number1 * Number2;
        System.out.printf("Product is %d%n", product);
    }
}

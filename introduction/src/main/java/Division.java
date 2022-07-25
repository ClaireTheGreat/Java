import java.util.Scanner;
public class Division {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int Number1 = scanner.nextInt();

        System.out.println("Enter second integer");
        int Number2 = scanner.nextInt();

        float product = (float)Number1 / Number2;

        int wholeNumResult = Math.round(product);
        System.out.printf("Your product is %.2f, %d", product, wholeNumResult);


    }
}

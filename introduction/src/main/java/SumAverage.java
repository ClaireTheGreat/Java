import java.util.Scanner;

public class SumAverage {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a range of numbers");
        int fromInt = input.nextInt();
        int toInt = input.nextInt();
        Question question = new Question();
        question.From = fromInt;
        question.To = toInt;
        Answer answer = question.GetAnswer();
        System.out.printf("Answer: average=%.2f, sum=%d\n", answer.Average, answer.Sum);
    }
}

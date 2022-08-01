public class Question {
    public int From;
    public int To;

    public Answer GetAnswer()
    {
        int sum = 0;
        for (int i = From; i <= To; i++)
        {
            sum += i;
            // sum = sum + 1;
        }
        double average = (double) sum / (To - From + 1);
        Answer answer = new Answer();
        answer.Average = average;
        answer.Sum = sum;
        return answer;
    }
}

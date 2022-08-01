public class Routine {
    public String activityTime;
    public String whatActivity;
    public Routine (String activityTime, String whatActivity){
    }
    public void Routine(String Relation){
        if (Relation == "Dad") {
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "10am-6pm", "work");
            System.out.printf("%s eats %s\n at ", activityTime, whatActivity, "6pm-8pm", "dinner");
            System.out.printf("%s takes %s\n at ", activityTime, whatActivity, "8pm-10pm", "nap");
            System.out.printf("%s watches %s\n at ", activityTime, whatActivity, "10pm-12pm", "tv");
        }
        else if (Relation == "Mom") {
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "9am-12am", "work");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "12-1pm", "exercise");
            System.out.printf("%s eats %s\n at ", activityTime, whatActivity, "1pm-2pm", "lunch");
            System.out.printf("%s does %s\n again at ", activityTime, whatActivity, "2pm-5pm", "work");
            System.out.printf("%s eats %s\n at ", activityTime, whatActivity, "5pm-7pm", "dinner");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "7pm-8pm", "exercise");
            System.out.printf("%s watches %s\n at ", activityTime, whatActivity, "8pm-12am", "tv");
        }
        else {
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "10am-11am", "chat with friends");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "12-1pm", "study");
            System.out.printf("%s eats %s\n at ", activityTime, whatActivity, "1-2pm", "lunch");
            System.out.printf("%s does %s\n again at ", activityTime, whatActivity, "2pm-4pm", "study");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "5pm-6pm", "exercise");
            System.out.printf("%s eats %s\n at ", activityTime, whatActivity, "6pm-7pm", "dinner");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "7pm-8pm", "exercise");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "8pm-10pm", "study");
            System.out.printf("%s does %s\n at ", activityTime, whatActivity, "10pm-12am", "chat with friends");







        }

        }
        }






public class Person {
    public String FirstName;
    public String LastName;
    public String Relation;

    public Person(String fName, String lName) {
        FirstName = fName;
        LastName = lName;
    }

    public Person(String fName, String lName, String relation) {
        this(fName, lName);
        Relation = relation;
    }

    public void doRoutineWork() {
        if (Relation=="Dad") {
            System.out.printf("%s does %s\n", FirstName, "Work");
        }
        else if (Relation=="Mom") {
            System.out.printf("%s does %s\n", FirstName, "Cook");
        }
        else {
            System.out.printf("%s does %s\n", FirstName, "Playing game");
        }
    }
}

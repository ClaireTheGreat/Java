import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> persons = new ArrayList<>();

    public Family() {
        AddPerson("Xiaodong", "Li", "Dad");
        AddPerson("ling", "Liu", "Mom");
        AddPerson("Claire", "Liu", "Daughter");
        AddPerson("Julia", "Li", "Daughter");
    }

    private void AddPerson(String fName, String lName, String relation) {
        persons.add(new Person(fName, lName, relation));
    }

    public void routine() {
        for(int i = 0; i < persons.size(); i++) {
            persons.get(i).doRoutineWork();
        }
    }

    public static void main(String[] args) {
        Family f = new Family();
        f.routine();
    }
}



import java.util.ArrayList;
import java.util.List;

public class ArrayListPersonDfinedObject {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Harry", 17));
        persons.add(new Person("Luna", 18));
        persons.add(new Person("Fred", 20));
        persons.add(new Person("Roxy", 16));

        persons.forEach(person -> System.out.println("Name : " + person.getName() + ", Age : " + person.getAge()));
    }

}

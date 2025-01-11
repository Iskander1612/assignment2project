import models.*;
import java.util.*;
import java.util.ArrayList;

public class MyApplication{
    public static void main(String[] args) {
        Employee employer1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employer2 = new Employee("George", "Harrison", "Engineer", 50000.00);
        Student student1 = new Student("Ringo", "Starr", 2.4);
        Student student2 = new Student("Paul", "McCartney", 3.8);

        ArrayList<Person> people = new ArrayList<>();
        people.add(employer1);
        people.add(employer2);
        people.add(student1);
        people.add(student2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.printf("%s earns %.2f tenge \n", p.toString(), p.getEarnings());
        }
    }
}
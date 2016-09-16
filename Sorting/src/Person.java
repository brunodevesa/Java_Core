import java.util.*;

/**
 * Created by brunodevesa on 16/09/16.
 */

/**
 * Sorting a ArrayList according to a chosen attribute without any lexicography natural order.
 * Made with Comparator usein custom and reusable comparators
 */

public class Person {

    public enum Gender {
        male,female, others
    }

    String name;
    int age;
    Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void printPersons(List<Person> personList) {

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).toString());
        }
    }

    public static void printSortedByAgePersons(List<Person> personList) {
        Collections.sort(personList, Person.COMPARE_BY_NAME);
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).toString());
        }
    }

    public static void printSortedByGender(List<Person> personList) {
        Collections.sort(personList, Person.COMPARE_BY_GENDER);
        printPersons(personList);
    }

    public static Comparator<Person> COMPARE_BY_NAME = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Person> COMPARE_BY_GENDER = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getGender().compareTo(o2.getGender());
        }
    };


    // lets test this :
    public static void main(String args[]) {

        Person p1 = new Person("Andre", 22, Gender.male);
        Person p2 = new Person("Minder", 19, Gender.others);
        Person p4 = new Person("Maria", 19, Gender.female);
        Person p3 = new Person("Pedro", 25, Gender.male);

        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        System.out.println("original list:");
        printPersons(personList);

        System.out.println("------------------------------------------");
        System.out.println("sorted list by name in alphabetical order");
        printSortedByAgePersons(personList);

        System.out.println("------------------------------------------");
        System.out.println("sorted list by custom order(gender)");
        printSortedByGender(personList);

    }

}

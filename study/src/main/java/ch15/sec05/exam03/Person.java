package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (this.age < other.age) {
            return -1;
        }
        else if (this.age == other.age) {
            return 0;
        }
        else {
            return 1;
        }
    }
}

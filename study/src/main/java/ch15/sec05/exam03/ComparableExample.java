package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        // TreeSet 에 Person 넣으려면 Person이 Comparable 구현해야함
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("홍길동", 35));
        people.add(new Person("김자바", 25));
        people.add(new Person("박지원", 31));

        for (Person person : people) {
            System.out.println(person.name + ": " + person.age);
        }
    }
}

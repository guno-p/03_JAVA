package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> maleList = new ArrayList<>();
        for (Student student : totalList) {
            if (student.getSex().equals("남")) {
                maleList.add(student);
            }
        }

        for (Student student : maleList) {
            System.out.println("남학생 : " + student);
        }

        List<Student> femaleList = totalList.stream()
                .filter(s -> s.getSex().equals("여"))
                .toList();

        for (Student student : femaleList) {
            System.out.println("여학생 : " + student);
        }


        List<Student> highGradeList = totalList.stream()
                .filter(s -> s.getScore() > 90)
                .toList();

        highGradeList.stream()
                .map( Student::getName )
                .forEach( System.out::println );

        List<Student> descendList = totalList.stream()
//                .sorted( Comparator.comparingInt(Student::getScore).reversed() )
                .sorted( (a, b) -> Integer.compare(b.getScore(), a.getScore()))
                .limit( 2 )
                .toList();

        descendList.stream()
                .forEach( System.out::println );

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s-> s.getName(),
                                s-> s.getScore()
                        )
                );
        System.out.println(map);
    }
}

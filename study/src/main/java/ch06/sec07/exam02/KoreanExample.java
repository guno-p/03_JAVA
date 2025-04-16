package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
//        Korean 객체 생성
        Korean korean1 = new Korean("박자바", "011225-1234567");
        Korean korean2 = new Korean("김자바", "930525-0654321");
        
//        출력
        System.out.println(korean1.nation);
        System.out.println(korean1.name);
        System.out.println(korean1.ssn);
        System.out.println();
        System.out.println(korean2.nation);
        System.out.println(korean2.name);
        System.out.println(korean2.ssn);
    }
}

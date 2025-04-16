package ch06.expert;

public class DatabaseExample {
    public static void main(String[] args) {
        Database obj1 = Database.getInstance();
        System.out.println("데이터베이스:" + obj1.connect());
        obj1.close();
    }
}

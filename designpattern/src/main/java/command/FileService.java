package command;

public class FileService {
    String filename;

    // Command 인터페이스에 준한다.
    // -> 메서드 참조 사용 가능하다.
    void open() {
        filename = "test.txt";
        System.out.println(filename + " open");
    }

    void print() {
        System.out.println(filename + " print");
    }
}

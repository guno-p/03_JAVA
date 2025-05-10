package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char[] arr = {'C', 'D', 'E'};

        try (Writer writer = new FileWriter("C:/Temp/test.txt")) {
            writer.write(a);
            writer.write(b);
            writer.write(arr);

            writer.write("FGH");

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;
            reader = new FileReader("C:/temp/test.txt");
            while(true) {
                int ch = reader.read();
                if (ch == -1) break;
                System.out.print((char)ch);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("C:/Temp/test.txt");
            char[] chars = new char[1024];
            while(true) {
                int ch = reader.read(chars);
                if (ch == -1) break;
                for(int i=0; i<ch; i++) {
                    System.out.print(chars[i]);
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

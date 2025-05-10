package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/temp/test2.db");

            byte[] data = new byte[100];

            while (true) {
                int tmp = is.read(data);
                if (tmp == -1) break;

                for (int i = 0; i < tmp; i++) {
                    System.out.print((char) data[i]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

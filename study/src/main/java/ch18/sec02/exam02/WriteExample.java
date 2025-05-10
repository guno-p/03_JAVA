package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = {66, 67, 68};
        try {
            OutputStream os = new FileOutputStream("C:/temp/test2.db");
            os.write(array);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

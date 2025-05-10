package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
        String str = "문자 변환 스트림을 사용합니다.";
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write(str);
            writer.flush();
            writer.close();

            InputStream is = new FileInputStream("C:/Temp/test.txt");
            Reader reader = new InputStreamReader(is, "UTF-8");
            char[] buf = new char[1024];
            int len = reader.read(buf);
            reader.close();

            String data = new String(buf, 0, len);
            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("src/main/java/ch18/sec07/exam02/ReadLineExample.java")
        );

        int lineNum = 1;
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(lineNum + "\t" + str);
            lineNum++;
        }
        br.close();
    }
}

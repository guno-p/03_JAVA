package ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) throws Exception {
//        File dir = new File("C:/Temp/images");
//        File file1 = new File("C:/Temp/images/1.jpg");
//        File file2 = new File("C:/Temp/images/2.jpg");
//        File file3 = new File("C:/Temp/images/3.jpg");
//
//        if(!dir.exists()) dir.mkdir();
//        if(!file1.exists()) file1.createNewFile();
//        if(!file2.exists()) file2.createNewFile();
//        if(!file3.exists()) file3.createNewFile();
//
//        File temp = new File("C:/Temp");
//        File[] contents = temp.listFiles();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
//        for(File file : contents) {
//            System.out.printf("%-25s", sdf.format(file.lastModified()));
//            if (file.isDirectory()) {
//                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
//            } else {
//                System.out.printf("%-10s%-20s", file.length(), file.getName());
//            }
//            System.out.println();
//        }
        File file1 = new File("C:/Temp/file1.txt");
        if(file1.exists()) {
            if (file1.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file1.getPath());
            } else {
                System.out.printf("%-10s%-20s", file1.length(), file1.getPath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }


    }
}

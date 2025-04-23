package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                // DEF
                .insert(0, "ABC")
                // ABCDEF
                .delete(3, 4)
                // delete 3 ~ (4-1)
                // A0 B1 C2 D3 E4 F5
                //          ^^
                // ABCEF
                .toString();
        System.out.println(data);
    }
}

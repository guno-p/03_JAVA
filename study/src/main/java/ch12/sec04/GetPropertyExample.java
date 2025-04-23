package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        System.out.println("OS : " + System.getProperty("os.name"));
        System.out.println("User : " + System.getProperty("user.name"));
        System.out.println("Home : " + System.getProperty("user.home"));


        Properties props = System.getProperties();
        Set keys = props.keySet();

        for (Object objkey : keys) {
            String key = (String) objkey;
            String value = props.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}

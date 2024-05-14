package project2semestr;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("one", "1");
        System.out.println(properties.getProperty("one"));
        FileOutputStream out = new FileOutputStream("addressFrom");
        properties.store(out, "my comment");

    }
}

package chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class main {
    public static void main(String[] args) throws IOException {

        // application.properties 파일 불러오기
        FileInputStream file = new FileInputStream("/Users/ichangjae/Desktop/Study/Java/java-study/src/main/resources/application.properties");

        Properties p = new Properties();

        p.load(file);
        System.out.println(p);
        System.out.println(p.stringPropertyNames());
        System.out.println(p.getProperty("spring.redis.host"));
        p.setProperty("이창재", "바보");
        p.list(System.out);
    }
}

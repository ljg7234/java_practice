package practice;

import java.nio.charset.Charset;

public class DefaultCharsetExample {
    public static void main(String[] args) throws Exception{
        Charset javaCharset = Charset.defaultCharset();
        System.out.println("Java 기본 문자셋: " + javaCharset.toString());

        byte[] bytes = "자바".getBytes();
        System.out.println("바이트 수: " + bytes.length + "bytes");

    }
}

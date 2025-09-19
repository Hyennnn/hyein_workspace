package example.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {
        // FileInputStream
        // file 이라는 외부 자원과 연결되어 1byte 단위로 입력 받는 스트림

        // 스트림은 사용이 종료되면 반드시 반납되어야 한다.
        // try-with-resource 구문은 try 블럭 종료시 자동을 자원 반납
        try(FileInputStream fis = new FileInputStream("testInputStream.txt")) {
          //   System.out.println(fis.read());
            // read() : 파일에 기록 된 값을 순차적으로 읽어옴
            // 더 이상 읽어올 값이 없는 경우 -1
            int value;
            while ((value = fis.read()) != -1) {
                System.out.println((char)value);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

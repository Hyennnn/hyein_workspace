package example.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        // FileReader
        // file이라는 외부 자원과 연결 되어 문자 단위로 입력 받는 메소드
        try(FileReader fr = new FileReader("testReader.txt")) {

//            int value;
//            while ((value = fr.read()) != -1 ) {
//                System.out.println((char)value);
//            }

            char[] carr = new char[100];
            fr.read(carr);
            for (char c : carr) {
                System.out.println(c);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package example.section3;

import java.io.*;

public class Application2 {
    public static void main(String args[]) throws IOException {
        // try-with-resource 구문 사용
        //jdk 1.7 버전에서 추가 된 문법 close 해야하는 인스턴스 를 try 소괄호에서 생성하면
        // 해당 블럭 종료 시 자동 close

        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

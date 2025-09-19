package example.section3;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {
        // 예외처리를 많이 사용하는 io 패키지에서 예외처리 구문을 이해
        // IO는 아직 학습하지 않았지만 IO문법보다 try-catch 블럭의 실제 사용과 흐름에 집중하기
        BufferedReader br = null;
        try {
            // FileReader 생성자에 throws FileNotFoundException이 있으므로
            // 호출붇에서 예외 처리가 강제화 >> try-catch 블럭 사용
            br = new BufferedReader(new FileReader("test.txt"));

            String s;
            while ((s = br.readLine()) != null ) {
                // br.readLine은 IOException 예외 처리 강제화 필요
                // catch 블럭 추가
                System.out.println(s);
            }
//        } catch (FileNotFoundException e) {
//            // FileNotFoundException은 IOException의 후손
//            throw new RuntimeException(e);
        } catch (IOException e) {
            // IOException은 입출력 관련함
            throw new RuntimeException(e);
        } finally {
            // finally : 오류가 발생하거나 발생하지 않거나 동작해야하는 구문
            try {
                // br.close() : IOException 예외 처리가 강제화 필요
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

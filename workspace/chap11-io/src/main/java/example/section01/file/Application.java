package example.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        // file 클래스 사용법

        // 대상 파일이 존재하지 않아도 인스턴스를 생성할 수 있음
        File file = new File("test.txt");

        try {
            // 파일 생성 후 성공 여부
            boolean createSuccess = file .createNewFile();
            System.out.println("createSuccess = " + createSuccess);

        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        // 파일의 정보 확인
        System.out.println("file.length() = " + file.length());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());

        // 파일 제거
        boolean deleteSuccess = file.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);
    }
}

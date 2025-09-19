package example.section03;

import java.io.*;

public class filterstream {
    public static void main(String[] args) {
        // 필터 스트림 (보조 스트림)
        // 기반 스트림 추가 되어 "성능향상", "기능 추가" , "기능추가"
        // BuffersReader/Writer : 버퍼 공간을 이용하여 데이터를 쌓아두다가 입출력하여
        // 입출력 횟수를 줄이고 성는을 향상 시킨다.
        BufferedWriter bw = null;
        try {
             bw = new BufferedWriter(new FileWriter("testBuffered.txt"));

            //내보내기
            bw.write("안녕하세요\n");
            bw.write("반갑하세요\n");

            // 버퍼를 이용하는 경우 버퍼가 가득 차면 자동으로 내보내기
            // 가득 차지 ㅏㄶ은 경우 flush()로 내보내기
            bw.flush();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally{
            if (bw != null){
                try {
                    // 자원을 닫기 전 flush 자동으로 호출한다.
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        //BufferedReader : readLine() 이라는 메소드를 추가로 제공
        // 버퍼의 한 줄을 읽어와서 문자열로 반환
        try(BufferedReader br = new BufferedReader(new FileReader("testBuffered.txt"))) {
           // br.readLine();

            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

package example.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        // StringBuilder 사용법 >> 로그 메세지 조합할 때 쓰면 좋음
        StringBuffer sb = new StringBuffer();
        // 용량(현재 버퍼 크기) 정수형으로 반환하여 문자열 길이 +16
        System.out.println("sb.capacity() = " + sb.capacity());
        
        for (int i = 0; i < 50; i++) {
            sb.append(i);
            System.out.println("sb : " + sb);
            // 용량이 부족해 지면 2n + 2 로 늘어남
            System.out.println("sb.capacity() = " + sb.capacity()); // 1...16 > 34 > 70 > 142
            System.out.println("sb.hashCode() = " + sb.hashCode()); // 해쉬코드는 안 바뀜
        }

        // 문자열 가공에 사용 될 수 있는 추가 메소드
        StringBuilder sb2 = new StringBuilder("javaoracle");
        System.out.println("sb2 = " + sb2);
        System.out.println("deleteCharAt:" + sb2.delete(2,5).charAt(0));
        System.out.println("sb2 = " + sb2);

        System.out.println("insert : " + sb2.insert(1, "vao"));
        System.out.println("insert : " + sb2.insert(0, "j"));

        System.out.println("reverse : " + sb.reverse());




    }
}

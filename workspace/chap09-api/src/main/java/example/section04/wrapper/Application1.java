package example.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        // Wrapper 클래스 사용법
        int num = 127;

        // Wrapper 클래스 생성자 (자바 1.9 버전부터 Deprecated)
//        Integer num1 = new Integer(num);


        // Boxing
        Integer num1 = Integer.valueOf(num);    // int > Integer
        Integer num2 = num;    // Auto Boxing

        // UnBoxing
        int num3 = num2.intValue(); //  Integer > int
        int num4 = num2;    // Auto Boxing

        // 주소값 비교

        // Integer, Integer 주소 값 비교( 10 기준 : true/ 150 기준 : false)
        // 128이 넘지 않은 숫자는 Integer.valueOf 메소드가 byte 범위 안에서 캐싱 하고있음
        // 범위가 넘울 경우 다르게 나옴
        System.out.println(num1 == num2);

        System.out.println(num2 == num3);   // Integer, int 값 비교 (true)
        System.out.println(num3 == num4);   // int, int (true)

        System.out.println(num1.equals(num2));  // 동일 비교 (true)

    }
}

package example.section01.string;

public class Application2 {
    public static void main(String[] args) {
        // 문자열 객체를 만드는 방법 (2가지)
        // 1. 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리
        // 2. new String("문자열") : 매번 새로운 인스턴스 생성

        String str1 = "java";   //
        String str2 = "java";
        String str3 = new String("java");   // String 객체 주소값 생성 (권장x)
        String str4 = new String("java");   // String 객체 주소값 생성 (권장x)

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str3 == str4 : " + (str3 == str4));

        System.out.println();


        // 해쉬코드
        // 값이 같은 문자열은 같은 해시코드 반환
        // 클래스에서 hashCode 매서드를 재정의 필요(동등 객체 판단)
        System.out.println("str1 = " + str1.hashCode());    // 3254818
        System.out.println("str2 = " + str2.hashCode());    // 3254818
        System.out.println("str3 = " + str3.hashCode());    // 3254818
        System.out.println("str4 = " + str4.hashCode());    // 3254818


        // 문자열 불변의 특성 (
        // String Pool 이라는 영역에 초기화된 객체로 할당됨,
        // 값을 변경이 되면 최기화된 객체로 재할당 됨
        str2 = "mariadb";
        System.out.println("str1 == str2 : " + (str1 == str2));

        System.out.println("str1.equals(str2) = " + str1.equals(str2)); // false (값이 다름)
        System.out.println("str2.equals(str3) = " + str2.equals(str3)); // false (값이 다름)
        System.out.println("str3.equals(str4) = " + str3.equals(str4)); // true (값이 값음 > 동일 객체)
    }
}

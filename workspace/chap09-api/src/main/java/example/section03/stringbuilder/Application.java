package example.section03.stringbuilder;

public class Application {
    public static void main(String[] args) {
        // String : 불변 객체 , StringBuilder : 가변 객체
        StringBuilder sb = new StringBuilder("java");
        // StringBuilder에도 toString이 오버라이드 되어있어 문자열로 반환 
        System.out.println("sb = " + sb);   // java
        
        // Object의 hashCode는 동등 객체 비료를 위해 사용됨
        // StringBuilder의 hashCode는 hashCode가 나옴
        System.out.println("sb.hashCode() = " + sb.hashCode()); // 980546781
        
        // 문자열 수정
        sb.append("mariadb");

        System.out.println("sb = " + sb);   // javamariadb
        // 기존 인스턴스 문자열과 주소값이 같음
        // 새로운 인스턴스가 생성된 것이 아닌, 수정된 다는 의미
        System.out.println("sb.hashCode() = " + sb.hashCode()); // 980546781

        // String hashCode
        String a = "java";
        System.out.println("a.hashCode() = " + a.hashCode()); // 3254818

        a = "mariadb";
        System.out.println("a.hashCode() = " + a.hashCode()); // 839186932
    }
}

package example.section01.object;

public class Application {
    public static void main(String[] args) {
        // Object 클래스 주요메서드 사용

        Book book1 = new Book(1, "홍길동전", "허균" , 50000);
        Book book2 = new Book(2, "옥만심서", "정양용" , 60000);
        Book book3 = new Book(3, "삼국시대", "김부식" , 70000);


        // Object의 toString 메소드 : 클래스명 + @ + 16진수 해쉬코드를 문자열로 반환
        System.out.println(book1.toString());   // example.section01.object.Book@372f7a8d
        System.out.println(book1);  // 래퍼런스 변수 출력 > toString() 으로 반환

        // book 클래스에서 toString을 오버라이드 사용한 후
        System.out.println(book2.toString());   // Book{number=2, title='옥만심서', author='정양용', price=60000}
        System.out.println(book2);  // Book{number=2, title='옥만심서', author='정양용', price=60000}

        Book book4 = new Book(4, "혼공자", "저자", 30000);
        Book book5 = new Book(4, "혼공자", "저자", 30000);

        // 동일 객체 : 주소가 동일한 인스턴스
        // Object의 hashCode, equals
        System.out.println(book4.hashCode());   // false
        System.out.println(book5.hashCode());   // false

        // 동등 객체 : 주소가 다르더라도 필드 값이 동일한 인스턴스
        // Book의 hashCode, equlas 메서드 오버라이드 사용한 후
        // 래퍼런스 주소 비교가 아닌 데이터 비교를 하기위해 오버라이드 재작성 함
        System.out.println(book4 == book5);     // false
        System.out.println(book4.equals(book5));// true

        // 해시 충돌 :


    }
}

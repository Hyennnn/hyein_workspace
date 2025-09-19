package exemple.section01.list;

import exemple.section01.list.comparator.AscendingPrice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        // 사용자 정의 자료형으로 ArrayList 생성, 적용

        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1,"홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2,"옥만심서", "정약용", 30000));
        bookList.add(new BookDTO(3,"동의보감", "허준", 40000));
        bookList.add(new BookDTO(4,"삼국사가", "김부석", 60000));
        bookList.add(new BookDTO(5,"삼국유사", "일명", 80000));

        // 정렬 전 데이터 확인
        System.out.println("======정렬 전======");
        for(BookDTO book:bookList){
            System.out.println(book);
        }

        // Collections로 sort 메소드 사용

        // implements Comparable 을 통해 compareTo 메소 사용
        Collections.sort(bookList); // 어떤 기준으로 정렬이 없음 > 컴파일 에러
        System.out.println("==== 정렬 후======");
        for(BookDTO book:bookList){
            System.out.println(book);
        }

        // Comparator 인터페이스를 구현한 정렬 기준 사용
        Collections.sort(bookList, new AscendingPrice());
        bookList.sort(new AscendingPrice()); // 같은 문장이지만 (권장)

        System.out.println("=== 가격 오름차순 ====");
        for(BookDTO book:bookList){
            System.out.println(book);
        }

        // 위에는 재사용성
        // 한 번만 사용할 경우 익명 클래스(Anonymous Calss)로 정렬
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                // 가격 내림차순 정렬
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println("=== 가격 내림차순 ====");
        for(BookDTO book:bookList){
            System.out.println(book);
        }
    }
}

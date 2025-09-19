package exemple.section01.list.comparator;

import exemple.section01.list.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        // 비교 대상 두 인스턴스의 price가 오름차순 정렬
        // o1 가격이 더 작은 가격이어야 한다.
        // 만약 o2 가격이 더 작을 경우 두 인스턴스의 순서 바꾸기
        return o1.getPrice() - o2.getPrice();
    }
}

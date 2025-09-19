package exemple.section01.list;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        // ArrayList : 기존 배열은 크기 변경이 불가하고 요소의 추가/삭제/정렬 복잡
        // 메소드로 구현해서 제공 ( 속도가 빨라지는 것은 아님)

        // 다양성을 이용한 ArrayList 참조
        // List 인터페이스로 하위 구현채들로 타입 변경 가능, 유연한 코드 작성
        // 원시 사용중!
        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        // 모든 타입을 저장할 수 있어 타입 안정성 떨어짐
        alist.add(10);
        list.add("alist");
        clist.add(new Date());
        
        
        // String 타입의 Element 저장하는 ArrayList 생성
        List<String> strlist = new ArrayList<>();
        strlist.add("apple");
        strlist.add("banana");
        strlist.add("orange");
//        strlist.add(10); // 타입 에러
        strlist.add("banana");
        
        // 지정된 순서대로 데이터 유지됨
        // 중복 지정이 가능
        System.out.println("strlist = " + strlist);
        
        // 요소의 개수 반환
        System.out.println("strlist.size() = " + strlist.size());

        // get(index) 메소드를 통해 저장 된 요소 반환
        for(int i = 0; i < strlist.size(); i++) {
            System.out.println("strlist.get(i) = " + strlist.get(i));
        }

        System.out.println();

        // 향상된 for문 사용
        for(String s : strlist) {
            System.out.println("strlist = " + s);
        }

        System.out.println();

        // add 메소드 사용
        strlist.add(1, "mango");
        System.out.println("strlist = " + strlist);

        System.out.println();

        // set 메소드로 요소 수정
        strlist.set(2, "grape");
        System.out.println("strlist = " + strlist);

        System.out.println();
        // remove 메소드 인덱스 요슈 삭제
        strlist.remove(2);
        System.out.println("strlist = " + strlist);

        System.out.println();

        // 요소 정렬
        Collections.sort(alist);
        System.out.println("alist = " + alist);


    }
}

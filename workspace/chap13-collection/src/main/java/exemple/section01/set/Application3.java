package exemple.section01.set;

import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        // TreeSet : 정렬
        TreeSet<String> test = new TreeSet<>();
        test.add("java");
        test.add("mysql");
        test.add("jdbc");
        test.add("html");
        test.add("css");
        test.add("java");

        // 자동 오름차순 정렬 , 트리의 형태로 요소 저장
        // String 클래스 implements  Comarble의 CompareTo 메소드 오러라이딩 기준 정리


    }
}

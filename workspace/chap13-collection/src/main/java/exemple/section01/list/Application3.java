package exemple.section01.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Application3 {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> stringLinkedList = new LinkedList<>();

        // List 계열, 내부구현 코드는 다르지만 호출 메소드 형태는 ArrayList와 동일
        stringLinkedList.add("banana");
        stringLinkedList.add("orange");
        stringLinkedList.add("apples");
        stringLinkedList.add("banana");

        // 저장 순서 유지, 중복 저장 가능
        for(int i=0;i<stringLinkedList.size();i++){
            System.out.println(stringLinkedList.get(i));
        }

        for(String s: stringLinkedList){
            System.out.println(s);
        }

        System.out.println(stringLinkedList.isEmpty());
        stringLinkedList.clear();
        System.out.println(stringLinkedList.isEmpty());

    }


}

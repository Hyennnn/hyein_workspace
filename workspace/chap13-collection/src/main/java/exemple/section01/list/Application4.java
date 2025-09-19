package exemple.section01.list;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        // Stack >> 브라우저 뒤로/앞으로 가는 기능
        Stack<Integer> integerStack = new Stack<>();

        // Vector를 상속했기 때문에 add 메소드를 사용할 수 있지만
        // Stack 사용법에 맞게 push 메소드로 데이터 추가 (권장)
//        integerStack.add(1);  >> 추가 후에 boolean
        integerStack.push(1);   //  추가 후 element를 반환
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack = " + integerStack);


        // stack에서 요소를 찾읓 때 : search
        // 위에서 부터의 순번 (index X)
        System.out.println(integerStack.search(1));
        System.out.println(integerStack.search(3));
        System.out.println(integerStack.search(5));

        // 스택에서 요소를 꺼내는 메소드
        // peek : 가장 상단에 있는 요소 반환
        // pop : 가장 상단에 있는 요수 제거 후 반환

        System.out.println("peek = " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);

        System.out.println();

        System.out.println("pop = " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);

        System.out.println("pop = " + integerStack.pop());
        System.out.println("pop = " + integerStack.pop());
        System.out.println("pop = " + integerStack.pop());
        System.out.println("pop = " + integerStack.pop());
        // stack에 담긴 요소가 없을때 꺼내게 되면 java.util.EmptyStackException 컴파일 에러
        System.out.println("pop = " + integerStack.pop());

    }
}

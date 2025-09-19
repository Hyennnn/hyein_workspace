package practice.level01.basic;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<>();


        while (true) {
            System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료)");
            String url = input.next();
            if (url.equals("exit")) {
                break;
            }

            stack.push(url);
            stack = reverseStack(stack);
            System.out.println(stack);
//            Stack<String> reverseStack = reverseStack(stack);
//            System.out.println("수정 스택" + reverseStack);

        }

    }

    public static Stack<String> reverseStack(Stack<String> stack) {
        Stack<String> tempStack = new Stack<>();

        for (int i = stack.size() - 1; i >= 0; i--) {
            tempStack.push(stack.get(i));
        }

        return tempStack;
    }
}

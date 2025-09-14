package practice.arrary.level02;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 하나 입력하세요");
        String text = sc.nextLine();
        System.out.println("검색할 문자를 입력하세요");
        char c =  sc.next().charAt(0);

        System.out.println(getNumber(text, c));
    }

    public static int getNumber(String word, char c) {
        char [] charArr = word.toCharArray();

        System.out.println("c = " + c);
        int result = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == c) {
                result++;
            }
        }

        return result;
    }
}

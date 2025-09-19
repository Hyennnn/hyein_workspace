package practice.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료)");
            String url = input.next();
            if (url.equals("exit")) {
                break;
            }

            list.add(url);


        }
    }

    public static List<String> reverseList(List<String> list) {
        List<String> result = new ArrayList<>();

      //  while ( 저장 되어아)

        return result;

    }

}
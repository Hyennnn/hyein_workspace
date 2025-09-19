package practice.arrary2;

import java.util.Random;
import java.util.Scanner;

public class level03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int width;
        int height;
        while (true) {
            System.out.println("가로 행의 수를 입력하세요");
            int in_width = input.nextInt();

            if ( 1 < in_width && in_width <= 10) {
                width = in_width;
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }

        while (true) {
            System.out.println("세로 행의 수를 입력하세요");
            int in_height = input.nextInt();

            if ( 1 < in_height && in_height <= 10) {
                height = in_height;
                break;
            } else {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
        }

        print(width, height);

    }

    public static void print(int width, int height) {
            Random rand = new Random();

            char[][] lengthArr =  new char[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                   char c =  (char) (rand.nextInt(26) + 'a');
                    lengthArr[i][j] = c;
                    System.out.print(lengthArr[i][j] + " ");
                }
                System.out.println();
            }
    }

}

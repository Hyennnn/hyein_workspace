package practice.arrary.level04;

import java.util.Arrays;
import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArr = new int[6];

      for (int i = 0; i < intArr.length; i++) {
          int num;
          boolean isDuplicate;

          do {
              num = (int) (Math.random() * 10) + 1;
              isDuplicate = false;

              // 중복 여부 체크
              for (int j = 0; j< i; j++) {
                  if (intArr[j] == num) {
                      isDuplicate = true;
                      break;
                  }
              }
          } while (isDuplicate);

          intArr[i] = num;
      }
        System.out.println(Arrays.toString(intArr));
    }
}

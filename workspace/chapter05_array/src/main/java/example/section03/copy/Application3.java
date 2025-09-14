package example.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        int[] originArr = new int[] {1,2,3,4,5};
        int[] copyArr1 = new int[10];

        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        System.out.println("===========origin========");
        print(originArr);
        System.out.println("===========copy1========");
        print(copyArr1);



    }

    public static void print(int[] arr) {
        System.out.println("arr.hashCode() = " + arr.hashCode());
        System.out.println("Arrays.toString(arr = " + Arrays.toString(arr));

    }
}

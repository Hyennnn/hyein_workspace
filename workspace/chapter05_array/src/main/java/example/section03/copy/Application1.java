package example.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        // 원본 배열
        int[] origin = {1,2,3,4,5};

        int[] copy = origin;    // orgin 과 주소값 복사
        int[] copy2 = Arrays.copyOf(origin,origin.length); // 새로운 배열에 값을 복사

        // hashCode
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
        System.out.println(copy2.hashCode());

        // toString
        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
    }

}

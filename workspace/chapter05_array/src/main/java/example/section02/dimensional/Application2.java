package example.section02.dimensional;

public class Application2 {
    public static void main(String[] args) {
        // 2차원 가변 배열을 선언, 할당


        // 가변 배열의 경우 인덱스 별 1차원을 별도로 할당
        int[][] arr = new int[3][];

        System.out.println(arr);        // 3행 레퍼런스 배열을 참조하는 주소값(stack)
        System.out.println(arr[0]);     // 래퍼런스 배열의 0번째 인덱스, 현재 null(heep)
  //      System.out.println(arr[0][0]);  // 존재하지 않음 NullPointerException

        arr[0] = new int[2];
        arr[1]  = new int[3];
        arr[2] = new int[4];

        // 가변 배열 공간에 값을 담고 출력하기 위한 반복문
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

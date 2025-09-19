package example.section01.array;

public class Application1 {
    public static void main(String[] args) {
        // 배열의 선언 및 할당
        int[] arr = new int[5];

        // 하나의 이름으로 관리되는 연속 된 메모리 공간
        // 해당 공간에 접근 시에는 인덱스를 사용

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 인덱스를 통해 반복문으로 취급
        // 변수는 1개가 아니라 여러개 선언할 수 있음
        for (int i = 0,  value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }


        // 배열 안에 담긴 값의 합계
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);

        // 향상된 for문
        // for ( 반목문에서 사용할 변수 : 반복을 수행할 대상 배열)
        // j는 데이터 변수 이기 때문에 가져오는 용도
        // 값을 변경을 하려면 인덱스 번호로 접근 해야되므로 일반 for문을 사용해야함
        int sum2 = 0;
        for (int j : arr) {
            System.out.println(j);
            sum2 += j;
        }

        System.out.println("sum2 = " + sum2);
    }

}

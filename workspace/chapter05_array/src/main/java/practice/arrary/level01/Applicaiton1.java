package practice.level01;

public class Applicaiton1 {
    public static void main(String[] args) {
        // 길이가 10인 정수형 배열을 선언 및 할당한 뒤
        //각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력

        int[] intArr = new int[10];

        int num = 1;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = num++;
            System.out.println(intArr[i]);
        }


    }
}

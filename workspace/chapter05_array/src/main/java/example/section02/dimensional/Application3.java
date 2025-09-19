package example.section02.dimensional;

public class Application3 {
    public static void main(String[] args) {
        // 2차원 배열의 선언, 할당
        int[][] arr = { {1,2,3,4,5}
                      , {6,7,8,9,10}
                      , {11,12,13,14,15}};

        int[] iarr = {1,2,3,4,5};
        int[] iarr2 = {6,7,8,9,10};
        int[][] arr3 = { iarr , iarr2};
    }
}

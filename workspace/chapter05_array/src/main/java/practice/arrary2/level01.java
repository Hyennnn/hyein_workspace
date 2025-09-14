package practice.arrary2;

public class level01 {
    public static void main(String[] args) {

        int[][] intArr = new int[3][4];

        int num = 1;
        for (int i = 0 ; i < intArr.length; i++) {
            for (int j = 0 ; j < intArr[i].length; j++) {
                intArr[i][j] = num++;

                if (num < 10) {
                    System.out.print(intArr[i][j] + "  ");
                } else {
                    System.out.print(intArr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

package practice.level02_normal;

import java.util.Scanner;

public class StrArr {


    public void StrArr(String str){

        int length = str.length();
        for (int i = 0; i < length; i++) {
            System.out.println( i + " : " + str.charAt(i));
        }

    }
}

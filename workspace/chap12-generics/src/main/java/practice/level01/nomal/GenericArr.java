package practice.level01.nomal;

import java.util.Arrays;

public class GenericArr<T> {
    private T[] array;
    private int num1;
    private int num2;
    private T temp;

    public void swap(T[] array, int num1, int num2) {
        T[] newArray = Arrays.copyOf(array, array.length);

        temp = newArray[num2]; // 보관

        newArray[num2] = newArray[num1];
        newArray[num1] = temp;
    }
}

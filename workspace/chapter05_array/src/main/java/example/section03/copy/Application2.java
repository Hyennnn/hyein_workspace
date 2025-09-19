package example.section03.copy;


import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        // 얕은 복사를 할용하여 매게변수와 리턴 값으로 활용
        String[] names = {"홍길동", "유관순", "신사임당"};

        System.out.println("names.hashCode() = " + names.hashCode());
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        String[] animals = getAnimal();
        print(animals);
    }

    public static void print(String[] sarr) {
        System.out.println("sarr.hashCode() = " + sarr.hashCode());

        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }
    public static String[] getAnimal() {
        String[] animals = {"낙타", "호랑이", "나무늘보"};
        System.out.println("animals.hashCode() = " + animals.hashCode());
        System.out.println("Arrays.toString(animals = " + Arrays.toString(animals));
        return animals;
    }
}

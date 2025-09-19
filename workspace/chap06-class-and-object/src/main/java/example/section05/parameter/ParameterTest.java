package example.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    // 1. 기본 자료형

    public void testPrimaryTypeParmeter(int num) {
        num += 10;
        System.out.println("testPrimaryTypeParmeter = " + num);
    }

    // 2. 기본 자료형 배열
    public void testPrimaryTypeArrayParmeter(int[] arr) {
        arr[0]  = 100;
        System.out.println("testPrimaryTypeArrayParmeter = " + arr[0]);
    }
    // 3. 클래스 자료형
    public void testClassTypeParmeter(Rectangle rectangle) {
        rectangle.setWidth(12.5);
        rectangle.setHeight(15.5);
        System.out.println("rectangle.getHeight() + rectangle.getWidth()  = "
                + rectangle.getHeight() + rectangle.getWidth() );
    }

    // 4. 가변 인자
    // 인자로 전달받는 값의 개수가 정해져 있지 않은 경우 활용

    public void testVariableEngthArrayParameter(String... bobby) {
        System.out.println("bobby.length = " + bobby.length);
        System.out.println("bobby : " + Arrays.toString(bobby));
    }




}

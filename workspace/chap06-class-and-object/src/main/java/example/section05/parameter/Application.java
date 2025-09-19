package example.section05.parameter;

public class Application {
    public static void main(String[] args) {
        ParameterTest parameterTest = new ParameterTest();

        // 1. 기본 자료형 메소드
        // testPrimaryTypeParmeter에 num 값을 전달했지만
        // 반환값을 받지 못헤 값이 변경이 안됨
        int num = 0;
        parameterTest.testPrimaryTypeParmeter(num);
        System.out.println("main num = " + num); // 0

        // 2. 기본 자료형 배열 메소드
        // 배열은 참조 값이므로 주소값에 들어가 값이 변경이 됨
        int[] arr = {1, 2, 3, 4, 5};
        parameterTest.testPrimaryTypeArrayParmeter(arr);
        System.out.println("mian arr[0] = " + arr[0]); // 100

        // 3. 클래스 자료형 메소드
        Rectangle rectangle = new Rectangle(5.5, 7.5);
        parameterTest.testClassTypeParmeter(rectangle);
        System.out.println("rectangle.getWidth() + rectangle.getHeight() = " + rectangle.getWidth() + rectangle.getHeight());

        // 4. 가변 인자 메소드
        parameterTest.testVariableEngthArrayParameter();
        parameterTest.testVariableEngthArrayParameter("코딩");
        parameterTest.testVariableEngthArrayParameter("코딩", "야구");
        parameterTest.testVariableEngthArrayParameter(new String[] {"코딩", "야구"});
        parameterTest.testVariableEngthArrayParameter("코딩", "야구", "테니스");
    }
}

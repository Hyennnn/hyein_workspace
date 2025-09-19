package example.section01.generic;

// 제네릭 선언은 다이아몬드 연산자를 이용해 작성
// 영문자 관래상 대문자로 작성 (T : 타입 변수
// 가상으로 존재하는 타입으로 T가 아닌 다른 영문자를 사용해도 무방
// 필요 할 경우 여러개의 타입 변수 작성 가능 ex) GenericTest<T , U>
public class GenericTest<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}

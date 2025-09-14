package example.section03.overriding;

public class SubClass extends SuperClass {
    // 1. 메소드명, 리턴 타입, 메게변수 타입&개수* 순서 일치해야 성립
    @Override
//    public void method2(int num) {}
//    public int method(int num) {}
//        public void method(Stromg str) {}
    public void method(int num) {}


    // 2. private 메소드 불가
//    @Override
//    private void privateMethod() {}

    // 3. final 메소드 불가
//    @Override
//    public final void finalMethod() {}

    // 4. prodected -> defualt 변경 : 보다 좁은 범위로 변경 불가
    // prodected -> public  변경 가능 (보다 넓은 범위)
    @Override
//    void protectedMethod() {}
    public void protectedMethod() {}

}

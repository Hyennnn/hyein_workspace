package example.section05.overloading;

import java.util.Arrays;

public class OverloadingTest {
    // 오버로딩
    // 같은 클래스 내에 같은 이름을 가진 메소드를 매개변수만 다르게 정의

    // 동일 기능의 메소드를 메개변수에 따라 다른 이름을 붙이면 관리가 어려워짐
    // ex) printLn() -> printInt(), printFloat(), ...


    // 오버로딩이 안 되는 경우
    // 1. 메소드 이름은 같고 접근제어자가 다를 경우, 반환 형이 달라도 컴파일 에러남
//    public void test() {}  // 컴파일 에러
//    public void test() {} // 컴파일 에러
//    private void test() {}    // 컴파일 에러
//    protected void test() {}  // 컴파일 에러
//    void test() {}    // 컴파일 에러

    // 2. 메소드 이름은 같고 매게변수명이 다를 경우 오버로딩 안됨
    public void test(int num) {}
//    public void test(int num2) {}

    // 오버로딩이 되는 경우
    // 매게변수 타입 순서, 갯수가 다르면 오버로딩이 가능!
    public void test(int num, String name) {}
    public void test(String name, int num) {}
    public void test(String name, int num, int num2) {}



}

package example.section04.override;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
    // throws 없이 오버라이딩 (가능)
//    @Override
//    public void method() {}
//
//    // 같은 예외 타입으로 오버라이딩(가능)
//    @Override
//    public void method() throws IOException {}
//
//    // 상위 예외 타입으로 오버라이딩 (불가능)
//    @Override
//    public void method() throws IOException {}

    // 하위 예외 타입으로 오버라이딩 (가능)
    @Override
    public void method() throws FileNotFoundException{}

}

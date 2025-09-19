package example.section02.extend.run;

import example.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {
        // 메소드 매개변수 제레릭 제약 사용
        MethodFarm methodFarm = new MethodFarm();

        // animalType : 제약 없음
        methodFarm.animalType(new Bunny(), new Bunny());
        methodFarm.animalType(new Snake(), new Snake());

        // mammalType : 제약 조건 있음
        methodFarm.mammalType(new Rabbit());
//        methodFarm.mammalType(new Snake()); // 컴파일 에러

        // reptileType : 제약 조건 있음
//        methodFarm.reptileType(new Rabbit()); // 컴파일 에러
        methodFarm.reptileType(new Snake());



    }
}

package example.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        // 필드에 직접 접근할 경우 개발자가 실수할 가능성이 높음~
        // 직접 접근이 아닌 간접 접근하기!
        // 문제점 (2)
        // 필드에 변경이 발생할 경우 사용했던 코드 모두 수정
        // > 유지보수 측면에서 악역향
        Monster monster = new Monster();
//        monster.name = "두치";
        monster.hp = 200;

//        System.out.println("monster.name = " + monster.name);
        System.out.println("monster.hp = " + monster.hp);

        System.out.println();

        Monster monster2 = new Monster();
//        monster2.name = "뿌꾸";
        monster2.hp = -200;
//        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        System.out.println();

        Monster monster3 = new Monster();
        // 매소드를 통해 간접 접근할 경우
        // neme > kindsㄹ로 변경되도 수정할 필요가 없음
        monster3.setInfo("드라큘라");
        System.out.println("monster3.info = " + monster3.getInfo());


        // 직접 접근이 막혀있는 상태가 아님
        System.out.println(monster3.kinds);
    }
}

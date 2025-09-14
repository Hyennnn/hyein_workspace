package example.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        // 필드에 직접 접근할 경우 개발자가 실수할 가능성이 높음~
        // 직접 접근이 아닌 간접 접근하기!

        Monster monster = new Monster();
        monster.name = "두치";
        monster.hp = 200;

        System.out.println("monster.name = " + monster.name);
        System.out.println("monster.hp = " + monster.hp);

        System.out.println();

        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;
        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);

        System.out.println();

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-100);
        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
    }
}

package example.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        // 캡슐화 : 필드를 직접 접근을 제한하고, 객체의 속성과 메서드를 하나로 묶는것
        // > 유지보수 용이, 데이터보호, 일관성 유지 (잘못된 값 방지), 객체 단위의 책임 분리

        // 필드에 private이라는 접근 제한자를 붙여 직접 접근은 금지
        // 간접 접근(메소드)로 필드 값을 다룸

        Monster monster = new Monster();
        monster.setName("뚜치");
        monster.setHp(200);

        System.out.println("monster.name = " + monster.getName());
        System.out.println("monster.hp = " + monster.getHp());

        System.out.println();

        Monster monster2 = new Monster();
        monster2.setName("뿌꾸");
        monster2.setHp(-200);
        System.out.println("monster2.name = " + monster2.getName());
        System.out.println("monster2.hp = " + monster2.getHp());

        System.out.println();

    }
}

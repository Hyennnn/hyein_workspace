package example.section02.encapsulation.problem3;

// 클래스 접근 제한자
// public, defualt만 사용가능하다.
public class Monster {
    // 접근 제한자
    // 클래스, 클래스의 멤버(필드,메소드)에 참조 연산자로 접근할 수 있는 범위
    // public, protected, default, private
    //    String name;    // (default) 접근제어자 : 같은 클래스, 같은 패키지에서만 사용할 수 있음

    private String name;
    private int hp;


    // 메소드
    public void setHp(int hp) {
      if (hp > 0) {
          // 여기서 this : 인스턴스 변수가 생성 되었을 때 자신의 주소를 저장하는 래퍼런스 변수
          this.hp = hp;
          System.out.println("양수 값이 입력 되어 몬스터의 체력을 입력 값으로 변경");
      } else {
          this.hp = 0;
          System.out.println("음수 값이 입력 되어 몬스터의 체력을 0으로 변경");
      }
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }




}

package example.section02.encapsulation.problem2;

public class Monster {
    // String name;
    String kinds;
    int hp;

    public void setInfo(String info) {
        // name 에서 kinds를 바꾸게 되더라도 main에서 코드를 수정할 필요가 없음!
        // this.name = info;
        this.kinds = info;
    }

    public String getInfo() {
//        return this.name;
        return this.kinds;
    }

}

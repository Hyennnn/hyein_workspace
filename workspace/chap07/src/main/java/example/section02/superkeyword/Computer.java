package section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;


    public Computer() {
        // super(); // 암묵적으로 적혀있음
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, int price, String name, Date manufacturingDate, String cpu, String operationSystem, int hdd, int ram) {
        // 부모 클래스의 필드는 직접 전근 불가.
        // 생성자를 호출해서 초기화 가능!
        // 생성자에서는 명시적 호출은 1개만 가능하다. (super()으로 가져왔으니 this()로 자신의 생성자는 못 가져옴)
        super(code, brand, price, name, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;


        // 메모리 할당할 때 부모 생성자 호출 > 자식 생성자 호출 되므로
        // 첫줄에는 super()가 먼저 와야함!
    }

    // 부모 필드에 직접 접근은 불가능 > getter/ setter으로 간접 접근 가능
    @Override
    public String getInformation() {
        // this.getCode(), super.getCode() 메소드를 통해 간접 접근
        // super.getInformation() >> Product 정의 된 메소드
        // this.getInformation() >> Computer 재정의 된 메소드
        return super.getInformation() + " "
                + cpu + "," + hdd + "," + ram + "," + operationSystem;
    }
}

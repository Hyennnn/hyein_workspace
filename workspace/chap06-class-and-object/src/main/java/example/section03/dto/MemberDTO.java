package example.section03.dto;

// DTO (Data Transfer Object)
// 계층간의 데이터 전달 용도로 사용되는 클래스
// 캡슐화의 원칙에 따라 작성하기는 했지만 필드명을 그대로 사용해서 유지보수성이 좋지 않음
public class MemberDTO {
    // 추상화 - 객체의 속성을 추출하는 과정

    // 필드 (속성)
    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    // 메소드 (행위)
    // 설정자(setter) , 접근자 (getter)

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // boolean은 다른 필드와 네임밍 규칭이 조금 다름!
    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}

package example.section04.constructor;

import java.util.Date;

public class User {
    // 필드 선언
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    // 생성자 선언


    // 기본 생성자
    // 클래스 내부에 기본 생성자에 존재
    // 생성자를 작성을 안할 경우 기본 생성자가 자동 생성
    public User() {
        System.out.println("기본 생성자 기본 동장 확인");
    }

    // 매게변수 생성자
    // 필드가 여러개일 경우 하고 싶은 필드의 조홥별로 생성자를 여러개 작성할 수 있음
    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
        System.out.println("user id, pwd 초기화 생정자 동작 확인");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
        this(id,pwd);   // 동일 클래스 내에서 다른 생성자 메소드를 호출하는 구문
                        // this(...)는 같은 클래스의 다른 생성자를 사용할 때 쓰는 구문
                        // 받드시 상위에 작성되어야 함!!
                        // 중복 코드 줄이고 유지보수성 뛰어남

        this.name= name;
        this.enrollDate = enrollDate;
        System.out.println("User id, pwd, name, enrollDate 초기화 생성자 동작 확인");
    }

    // 메소드 선언
    public String getInformation() {
        return id + " " +  pwd + " " + name + " " + enrollDate;
    }


}

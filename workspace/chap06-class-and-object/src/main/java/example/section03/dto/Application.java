package example.section03.dto;

public class Application {
    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();
        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(180.5);
        member.setWeight(80.6);
        member.setActivated(true);

        System.out.println("회원번호 : " + member.getNumber());
        System.out.println("회원명 : " + member.getName());
        System.out.println("나이 : " + member.getAge());
        System.out.println("성별 : " + member.getGender());
        System.out.println("키 : " + member.getHeight());
        System.out.println("몸무게 : " + member.getWeight());
        System.out.println("회원활성화상태 : " + member.isActivated());
    }
}


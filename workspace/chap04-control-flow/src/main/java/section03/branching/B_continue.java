package section03.branching;

public class B_continue {

    public void testSimpleContinueStatment() {
        // continue는 반복문 for, whle문 둘 다 사용 가능
        // 4의 배수이면서 5의 배수인 값 출력
        for(int i = 1; i <= 100; i++)  {
            // 반복하다가 일부 코드는 스킵하고 싶을 때 사용.
            // 4 배수면서 5 배수가 아니면 skip 하기
            if (i % 4 != 0 || i % 5 != 0) continue;

            System.out.println(i);
        }
    }

    // 중첩 반복문 내 continue 사용에 대한 흐름
    public void testSimpleBreakStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            if (dan > 5) {
                System.out.println("======== " + dan + " ========" );
                for (int su= 1; su <= 9; su++) {
                    // contine는 가장 인접한 반복문만 실행을 건너 뛴다.
                    if (su % 2 == 0) continue;
                    System.out.println(dan + "*" + su + "=" + (dan * su));
                }

                System.out.println();
            }
        }
    }

    public void testJumpContinue() {
        label:
        for (int dan = 2; dan <= 9; dan++) {
            if (dan > 5) {
                System.out.println("======== " + dan + " ========" );
                for (int su= 1; su <= 9; su++) {
                    // contine는 가장 인접한 반복문만 실행을 건너 뛴다.
                    if (su % 2 == 0) continue label;
                    System.out.println(dan + "*" + su + "=" + (dan * su));
                }

                System.out.println();
            }
        }
    }
}

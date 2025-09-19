package section03.branching;

public class A_break {
//    break 사용에 대한 흐름을 이해하고 적용할 수 있다.
    public void testSimpleBreakStatement() {

        int i = 1;
        int sum = 0;
//        조건식이 true인 경우 무한 루프
        while (true) {
            sum += i++;

//       조건이 밎을 때 break 걸어주기
        if (i > 100) break;

        }

        System.out.println("sum = " + sum);

    }

    public void testSimpleBreakStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            if (dan > 5) {
                System.out.println("======== " + dan + " ========" );
                 for (int su= 1; su <= 9; su++) {
                     System.out.println(dan + "*" + "su = " + su + "=" + (dan * su));
                 }

                System.out.println();
            }
        }
    }

    // 중첩 반복문 내에서 break 사용 시jump에 대한 흐름
    public void testUnmpBreak() {
        label:  // 라벨을 붙여주면 beak 명시된 반복문을 탈출함
        for(;;) { // 조건식 없음 > 무한루프
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) break label;

            }
        }
    }
}

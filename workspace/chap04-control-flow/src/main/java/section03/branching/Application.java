package section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break a_break = new A_break();
     //   a_break.testSimpleBreakStatement();

       // a_break.testUnmpBreak();

        B_continue b_continue = new B_continue();
   //     b_continue.testSimpleContinueStatment();
//        b_continue.testSimpleBreakStatement2();
        b_continue.testJumpContinue();
    }
}

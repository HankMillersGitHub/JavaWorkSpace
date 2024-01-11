import java.io.PrintStream;

/**
 * ClassName : InterviewQuestion
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/8 23:54
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        InterviewQuestion iq = new InterviewQuestion();
        int a = 10;
        int b = 20;
        iq.method(a,b); // 需要在method方法被调用后仅输出a = 100;b = 200;
        method2(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // 方法一：不改变原本题目的情况下，直接停止运行
    public void method(int a,int b){
        System.out.println("a = " + a * 10);
        System.out.println("b = " + b * 10);
        System.exit(0);
    }

    // 方法二：重写println方法
    public static void method2(int a,int b){
        PrintStream ps = new PrintStream(System.out){
            public void println(String x){
                if("a = 10".equals(x)){
                    x = "a = 100";
                }else if("b = 20".equals(x)){
                    x = "b = 200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}

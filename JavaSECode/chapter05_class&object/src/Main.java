import java.util.Scanner;

/**
 * ClassName : ${Name}
 * Package :
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Factorial a = new Factorial();
        int sum = 0;
        sum += a.factorial(10);
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
    }
}

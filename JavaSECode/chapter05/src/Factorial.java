/**
 * ClassName : Factorial
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/6 17:53
 */
public class Factorial {

    public int factorial(int n){
        if(n==2){
            return 2;
        }else if(n == 1){
            return 1;
        }else if(n == 3){
            return factorial(2) + factorial(1);
        }else{
            return factorial(n - 1) + factorial(n-2);
        }
    }
}
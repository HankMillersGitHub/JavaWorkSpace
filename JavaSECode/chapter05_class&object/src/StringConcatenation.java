/**
 * ClassName : StringConcatenation
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/8 23:20
 */
public class StringConcatenation {
    public String stringConcatenation(String ... str){
        StringBuilder sum = new StringBuilder();
        for (String s : str) {
            // append方法可以将参数链接到调用者后面
            sum.append(s);
        }
        return sum.toString();
    }
    public static void main(String[] args) {
        StringConcatenation sc = new StringConcatenation();
        String result1 = sc.stringConcatenation("abcd","efg","hijk");
        String result2 = sc.stringConcatenation();
        System.out.println(result1);
        System.out.println(result2);
    }
}

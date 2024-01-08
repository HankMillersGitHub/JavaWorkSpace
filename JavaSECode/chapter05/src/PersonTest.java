/**
 * ClassName : PersonTest
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/5 16:05
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建对象 / 类的实例化
        Person p = new Person();
        p.name = "马仲豪";
        p.age = 25;
        p.gender = '男';
        p.eat();
        p.sleep(8);
        p.hobby();

        Person p1 = new Person();
        p1.name = "马仲豪";
        p1.age = 25;
        p1.gender = '男';
        p1.eat();
        p1.sleep(6);
        p1.hobby();
    }
}

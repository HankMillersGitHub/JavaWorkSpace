/**
 * ClassName : EmployeeTest
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/5 17:37
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee Hank = new Employee();
        Hank.name = "HankMiller";
        Hank.age = 39;
        Hank.salary = 50000;
        Hank.birthday = new MyDate();
        Hank.birthday.year = 1998;
        Hank.birthday.month = 5;
        Hank.birthday.day = 15;

        Employee Write = new Employee();
        Write.name = "Write";
        Write.age = 35;
        Write.salary = 500000;
        Write.birthday = new MyDate();
        Write.birthday.year = 1998;
        Write.birthday.month = 6;
        Write.birthday.day = 21;


        Hank.sayHello();
        Write.sayHello();
    }
}

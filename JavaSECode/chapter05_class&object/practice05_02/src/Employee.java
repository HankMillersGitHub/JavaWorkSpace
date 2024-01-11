/**
 * ClassName : Employee
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/5 17:35
 */
public class Employee {
    String id;
    String name;
    int age;
    double salary;
    MyDate birthday;
    public void sayHello(){
//        System.out.println(date);
        System.out.println("i am " + name + ",i'm " + age + " years old ,i can make " + salary +" a year.and my birthday is " + birthday.output());
    }
}

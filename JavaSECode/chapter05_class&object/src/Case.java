/**
 * ClassName : Case
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/11 19:49
 */
public class Case {
/*
 *  创建程序，在其中定义两个类：Person类和PersonTest类，定义如下
 * 用setAge()设置合法的年龄(0-130岁)，用getAge()返回人的年龄
 * 在PersonTest类中实例化Person类的对象B，调用setAge和getAge，体会java的封装性
 *
 * */

}
class Person1{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 130){
            this.age = age;
        }
    }
}
class Person1Test{
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setAge(10);
        System.out.println(person.getAge());
    }
}

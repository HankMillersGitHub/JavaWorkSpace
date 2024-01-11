/**
 * ClassName : StudentTest
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/11 19:24
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Hank";
        student.ageSetter(27);
        student.selfIntroduction();

    }
}
class Student{
    String name;
    private int age;
    /**
     *
     * age setter
     * 修改age的方法
     */
    public void ageSetter(int number){
        if(number > 0 && number <= 100){
            age = number;
        }else{
            System.out.println("您输入的年龄不合法，请重新输入");
        }
    }
    /**
     *
     * age getter
     * 获取age的方法
     */
    public int ageGetter(){
        return age;
    }
    public void selfIntroduction(){
        System.out.println("my name is " + name + ",and i am " + age + " years old!");
    }
}

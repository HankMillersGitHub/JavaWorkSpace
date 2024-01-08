/**
 * ClassName : StudentTest
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/8 0:46
 */
public class StudentTest {
    public static void main(String[] args) {
        Utility utility = new Utility();
        // 学生数组
       Student[] students = utility.newStudents(20);
        // 打印指定年级的学生信息
        utility.displayStudents(students,6);
        // 使用冒泡排序排列学生成绩
        // 接收排序后的数组
        students = utility.sortByScore(students);
        // 显示学生信息
        utility.displayStudentsInformation(students);
    }
}

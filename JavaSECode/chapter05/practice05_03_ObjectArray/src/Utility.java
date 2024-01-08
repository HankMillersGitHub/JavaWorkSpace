/**
 * ClassName : Utility
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/8 1:07
 */
public class Utility {
    // 此工具类为了将对学生的操作进行封装

    // 创建学生
    public Student[] newStudents(int num){
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {
            students[i] = new Student();
            students[i].score = (int) (Math.random() * 100 + 1);
            students[i].grade = (int) (Math.random() * 6 + 1);
            students[i].studentId = i;
        }
        return students;
    }
    // 打印指定年级的学生信息
    public void displayStudents(Student[] stu, int grade) {
        for (int i = 0; i < 20; i++) {
            if (stu[i].grade == grade) {
                stu[i].displayStudentInformation();
            }
        }
    }

    // 根据学生成绩排序
    public Student[] sortByScore(Student[] stu) {
        Student stuMid = new Student();
        for (int j = 0; j < stu.length; j++) {
            for (int i = 1; i < stu.length; i++) {
                if (stu[i].score > stu[i - 1].score) {
                    stuMid = stu[i];
                    stu[i] = stu[i - 1];
                    stu[i - 1] = stuMid;
                }
            }
        }
        return stu;
    }

    // 遍历学生信息
    public void displayStudentsInformation(Student[] stu){
        for (Student student : stu) {
            student.displayStudentInformation();
        }
    }
}
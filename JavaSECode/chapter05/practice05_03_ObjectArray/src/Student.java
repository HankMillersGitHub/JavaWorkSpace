/**
 * ClassName : Student
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/8 0:32
 */

public class Student {
/*
* 1. 定义类Student，包含三个属性，学号姓名班级
1. 创建二十个学生对象，学号从0到19，年纪和成绩都随机决定

问题一：打印出三年级的学生信息

问题二：使用冒泡排序学生成绩，并遍历所有信息
* */
    int studentId;
    int score;
    int grade;
    // 声明方法显示学生信息
    public void displayStudentInformation(){
        System.out.println("成绩：" + score + ",年级：" + grade + ",学号：" + studentId);
    }
}

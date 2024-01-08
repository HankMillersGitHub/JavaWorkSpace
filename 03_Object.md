# 第六章 面向对象基础

## 6.1 Java的基本元素：类和对象

### 6.1.1 类的声明和使用

#### 6.1.1.1 面向对象完成功能的三个步骤

1. 类的定义(创建类、并设计类的内部成员和方法)

   ```java
   public class Phone {
       // 属性
       String brand;
       int price;
       // 方法
       public void call(){
           System.out.println("手机可以打电话");
       }
       public void sendMessage(){
           System.out.println("手机可以发短信");
       }
   }
   ```

   

1. 对象的创建

   ```java
   Phone newPhone = new Phone();
   ```

   

1. 对象调用属性或方法

   ```java
   newPhone.brand = "iphone";
   newPhone.price = 8999;
   newPhone.call();
   ```




### 6.1.2 类的内存解析

#### 6.1.2.1 JVM内存结构划分

1. 栈：方法内定义的变量，都存储在栈中
1. 堆：new出来的结构，比如数组的实体，对象的实体(包括对象中的属性)
1. 方法区：存放类的模板

### 6.1.3 类的成员

#### 6.1.3.1 属性

1. 变量的分类
   1. 按照数据类型来分，八种基本数据类型和引用数据类型
   1. 按照变量在类中的位置不同，分为成员变量和局部变量
1. 属性的几个称谓：
   1. 成员变量
   1. 属性
   1. field(字段、域)
1. 区分成员变量和局部变量
   1. 相同点：
      1. 都有自己的作用域
      1. 声明的格式相同
      1. 都必须先声明后使用
   1. 不同点：
      1. 类中声明的未知不通
         1. 属性：声明在类中，方法外的变量
         1. 局部变量：声明方法，构造器内部的变量
      1. 在内存中分配的位置不同
         1. 属性：随着对象的创建，存储在堆空间中
         1. 局部变量：存储在栈空间中
      1. 生命周期
         1. 属性：随着对象的创建而创建，随着对象的消亡而消亡
         1. 局部变量：随着方法对应的栈帧入栈，局部变量会在栈中分配，随着方法对应的栈帧出栈，局部变量消亡
      1. 作用域
         1. 属性：在整个类的内部都是有效的
         1. 局部变量：仅限于声明此局部变量的方法内
      1. 是否有权限修饰符进行修饰
         1. 都有哪些权限修饰符：public private protected
         1. 属性是可以使用权限修饰符进行修饰的，局部变量不可以使用
      1. 是否有默认值
         1. 属性都有默认初始化值，意味着如果没有给属性进行显示初始化赋值，则会有初始化值
         1. 局部变量都没有默认初始化值，意味着如果不给变量进行初始化赋值，局部变量不可用
         1. 注意：对于方法的形参，在调用该方法时，对形参进行赋值即可

#### 6.1.3.2 方法

* 方法是类或对象行为的抽象，用来完成某个功能操作，在某些语言中也成为函数或过程
* 将功能封装为方法的目的是，可以实现代码重用，减少冗余，简化代码
* java中方法不能独立存在，所有方法必须定义在类中
* 方法内可以调用本类中所有的方法
* 方法内不能定义方法

1. 方法声明的格式

   ```java
   权限修饰符 [其他修饰符] 返回值类型 方法名(形参列表){
       // 方法体
   }
   ```

   1. 权限修饰符：

      1. public 
      1. private
      1. protected
      1. 缺省

   1. 返回值类型：当调用完此方法时，是否需要返回一个结果

      1. 无返回值(void)
      1. 有返回值(根据返回值类型定义，可以是基本数据类型，也可以是引用数据类型)

   1. 方法名 和变量命名标准一致

   1. 形参列表：形参属于局部变量，且可以声明多个

      格式：(形参类型1 形参1，形参类型2 形参2，。。。)

      分类：

      	1. 无形参 但是不能省略小括号
      	1. 有形参，根据需要，声明形参个数

   1. return的作用

      1. 结束一个方法
      1. 结束一个方法并返回一个值给方法的使用者

### 6.1.4 对象数组

数组的元素可以是基本数据类型，也可以是引用数据类型

1. 案例一

   1. 定义类Student，包含三个属性，学号姓名班级
   1. 创建二十个学生对象，学号从0到19，年纪和成绩都随机决定

   问题一：打印出三年级的学生信息

   问题二：使用冒泡排序学生成绩，并遍历所有信息
   
   ```java
   // 详见(JavaSECode\chapter05\practice05_03_ObjectArray) 
   ```
   
   

### 6.1.5 练习

1. 声明员工类Employee,包含属性：编号id 姓名name 年龄age 薪资salary，声明EmployeeTest类，并在main方法中创建两个员工对象，并未属性赋值，并打印两个员工的信息

   ```java
   // Employee
   public class Employee {
       String id;
       String name;
       int age;
       double salary;
       public void sayHello(){
           System.out.println("i am " + name + ",i'm " + age + " years old ,i can make " + salary +" a year.");
       }
   }
   // EmployeeTest
   public class EmployeeTest {
       public static void main(String[] args) {
   
           Employee Hank = new Employee();
           Hank.name = "HankMiller";
           Hank.age = 39;
           Hank.salary = 50000;
           Employee Write = new Employee();
           Write.name = "Write";
           Write.age = 35;
           Write.salary = 500000;
   
           Hank.sayHello();
           Write.sayHello();
       }
   }
   ```

1. 声明一个MyDate类型，有属性，年月日，声明一个Employee类型有属性：编号姓名年龄生日薪资，在EmployeeTest测试类的main方法中，对生日和个人信息进行赋值并输出

   ```java
   // Employee
   public class Employee {
       String id;
       String name;
       int age;
       double salary;
   
       MyDate birthday;
       public void sayHello(String date){
   //        System.out.println(date);
           System.out.println("i am " + name + ",i'm " + age + " years old ,i can make " + salary +" a year.and my birthday is " + date);
       }
   }
   // MyDate
   public class MyDate {
       int year;
       int month;
       int day;
       public String output(){
           return year + "年" + month + "月" + day + "日";
       }
   }
   // EmployeeTest
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
   
           Hank.sayHello(HankDate.output());
           Write.sayHello(WriteDate.output());
       }
   }
   
   
   ```
   



### 6.1.6 方法的重载(overload)

1. 定义：
   * 在方法的类中，允许存在一个以上的同名方法，只要他们的参数列表不同即可，参数列表不同，意味着参数个数或参数类型的不同
   * 重载的特点：与修饰符、返回值类型无关，只看参数列表，且参数列表必须不同
   * 重载方法调用：JVM通过方法的参数列表，调用匹配的方法
     * 先找参数个数、类型最匹配的
     * 再找个数和类型可以兼容的，如果同时多个方法可以兼容将会报错

### 6.1.7 可变个数形参的方法

1. 使用场景：再调用方法时，可能会出现方法形参的类型是确定的，但是参数的个数不确定，此时就可以使用这种方法
1. 格式 ： (参数类型 ... 参数名)
1. 说明：
   1. 可变个数形参的方法在调用时，针对于可变的形参的实参个数可以为0个1个或多个
   1. 可变个数形参的方法与同一个类中，同名的多个方法可以构成重载
   1. 可变个数形参的方法与同一个类中方法名相同，且与可变个数形参的类型相同的数组参数不构成重载
   1. 如果可变个数形参的方法有确定的参数，可变类型的参数必须写在形参列表的最后
   1. 可变个数形参最多在一个方法的形参列表中出现一次

```java
// 案例：n个字符串进行拼接，每一个字符串之间使用某种字符进行分割，如果没有传入字符串，那么返回空字符串
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
        String result = sc.stringConcatenation("abcd","efg","hijk");
        System.out.println(result);
    }
}
```



### 6.1.8 方法的值传递机制

1. 对于方法内声明的局部变量，值传递的机制：
   1. 如果是基本数据类型的变量，则将此变量保存的数据值传递出去
   1. 如果是引用数据类型的变量，则将此变量保存的地址值传递出去
1. 方法的参数的传递机制，值传递机制
   1. 概念：
      1. 形参，在定义方法时，方法名后面括号中声明的变量称为形式参数，简称形参
      1. 实参，再调用方法时，方法名后面括号中的使用的值、变量、表达式称为实际参数，简称实参
   1. 规则
      1. 如果是基本数据类型的变量，则将此变量保存的数据值传递出去
      1. 如果是引用数据类型的变量，则将此变量保存的地址值传递出去

```java
// 面试题
public class InterviewQuestion {
    public static void main(String[] args) {
        InterviewQuestion iq = new InterviewQuestion();
        int a = 10;
        int b = 20;
        iq.method(a,b); // 需要在method方法被调用后仅输出a = 100;b = 200;
        method2(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    // 方法一：不改变原本题目的情况下，直接停止运行
    public void method(int a,int b){
        System.out.println("a = " + a * 10);
        System.out.println("b = " + b * 10);
        System.exit(0);
    }

    // 方法二：重写println方法
    public static void method2(int a,int b){
        PrintStream ps = new PrintStream(System.out){
            public void println(String x){
                if("a = 10".equals(x)){
                    x = "a = 100";
                }else if("b = 20".equals(x)){
                    x = "b = 200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}

```



### 6.1.9 递归

1. 自己调用自己的方法就是递归
1. 分类
   1. 直接递归
   1. 简介递归
1. 使用说明：
   1. 递归方法包含一种隐式循环
   1. 递归方法会重复执行某段代码，但这种重复执行无需循环控制
   1. 递归一定要向已知方向递归，否则会出现无穷递归，类似死循环，最终出现堆栈溢出

```java
// 青蛙跳楼梯
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
```


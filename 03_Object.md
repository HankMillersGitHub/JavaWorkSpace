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

   
# 问题和解决方案

### 1、中文乱码

* 打印出的中文出现乱码

  ![](E:\workspace\Question\01问题\1.1.png)

* dos命令也出现乱码

  ![](E:\workspace\Question\01问题\1.2.png)

* 怀疑是电脑编码格式出现问题

  ![](E:\workspace\Question\01问题\1.3.png)

  证实猜想

* 解决方案

  * 查看cmd编码格式

    ![](E:\workspace\Question\01问题\1.4.png)

    编码格式为936 ，是GBK编码

    输入 `chcp 65001`更改为UTF-8格式
    
  * 永久修改电脑编码格式
  
    * 控制面板 -> 时钟和区域 -> 区域 -> 管理 -> 更改系统区域设置 -> 勾选 `Beta版：使用Unicode UTF-8提供全球语言支持`
    * 问题解决


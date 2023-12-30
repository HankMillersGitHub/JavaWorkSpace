# 第一章 工程与模块化管理

## 1.1 Project和Module的概念

在idea中，提出了Project和Module这两个概念

在idea中，Project是最顶级的结构单元，然后就是Module。目前，主流的大型项目都是多Module结构，这类项目一般按功能划分，比如：user-core-module、user-facade-module和user-hessian-module等等，模块之间彼此可以相互依赖，有着不可分割的业务关系，因此对于一个project而言：

* 当为单module项目的时候，这个单独的module就是project
* 当为多module项目的时候，多个模块处于同一个project中，此时彼此之间具有相互依赖的关联关系
* 当多个模块没有建立依赖关系的话，可以作为一个小项目运行

## 1.2 Module和Package

在一个module下，可以声明多个包，一般命名规范如下：

* 不要有中文

* 不要以数字开头

* 给包取名时一般都是公司域名倒着写，而且都是小写

  比如：www.HankMiller.vip

  包名应该是`vip.HankMiller`
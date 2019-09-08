# 软件工程第一次作业：计算机存储计算 #
## 1、开发工具及语言 ##
    本demo使用java语言为开发语言，开发工具为eclipse
## 2、运行环境 ##
    使用的运行环境为java EE，jdk版本为9.0
## 3、功能描述 ##
    本demo中，主要功能为根据年份求得计算机在某年的存储容量需求，根据机器字长和年份来获得存储器内存的价格。在此基础上获某年需求存储器的价格。  
    再由某年程序员每天开发指令数，及程序员平均工资来求得使某年需求存储器装满程序员新开发的指令的成本。
## 4、源代码文件说明 ##
    本共有4个源文件，分别为Calmain.java，CalFrame.java， Calculate.java，CheckData.java。
    （1）Calmain.java为主函数，创建一个CalFrame实例。  
    （2）CalFrame.java主用来搭建界面，并调用CheckData、Calculate对象。该类继承了JFrame，实现了  ActionListener接口，拥有CalFrame()、Init()、 
    main(String[] atgs)、actionPerformed(ActionEvent e)方法。CalFrame()方法是构造方法，负责调用Init()；Init()方法主要是在Frame上加载各种组件，  
    设置Frame大小等功能；actionPerformed(ActionEvent e)方法实现命令按钮单击事件完成的动作；main(String[] atgs)方法来运行CalFrame类。  
    （3）Calculate.java对业务逻辑的抽象，其中包含一个cal方法，主要作用为内部算法的实现，根据用户界面输入来计算得到需要的结果。  
    （4）CheckData.java对数据进行验证，其中包含一个check方法，检查输入数据的合法性。
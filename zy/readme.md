# 软件工程作业
## 1、开发工具及语言
开发工具：eclipse
开发语言：java
## 2、运行环境
在Windows 10 64位计算机上能正常运行
## 3、功能描述
该程序是能实现软件工程导论书本上P22页题5所要求的计算机存储容量计算、存储器价格计算以及编写一定代码量的程序成本计算等功能。
## 4、程序演示
![作业](./作业演示.gif "作业")
## 5、源代码文件说明
package zy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class demo implements ActionListener{

    JFrame f;
    JButton bM,bP,bW,bclear;
    Container cp;
    JLabel j1,j2,j3,j4,j5;


    JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
    demo(){
        f = new JFrame("小程序");
        f.setSize(550,200);//设置大小

        cp = f.getContentPane();//加载面板
        cp.setLayout(new FlowLayout());//改成流式布局

        j1=new JLabel("年份");
        j2=new JLabel("字长");
        j3=new JLabel("指令");
        j4=new JLabel("工资");
        j5=new JLabel("结果");
  
        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jtf3 = new JTextField(10);
        jtf4 = new JTextField(10);
        jtf5 = new JTextField(10);

        bM = new JButton("M");
        bP = new JButton("P");
        bW= new JButton("W");
        bclear = new JButton("清除");
        
        cp.add(j1);//添加标签
        cp.add(jtf1);//添加文本框
        cp.add(j2);
        cp.add(jtf2);
        cp.add(j3);
        cp.add(jtf3);
        cp.add(j4);
        cp.add(jtf4);
        cp.add(j5);
        cp.add(jtf5);

        cp.add(bM);
        bM.addActionListener(this);//给M添加监听机制
        cp.add(bP);
        bP.addActionListener(this);
        cp.add(bW);
        bW.addActionListener(this);
        cp.add(bclear);
        bclear.addActionListener(this);


        f.setVisible(true);//显示窗体
        f.setLocationRelativeTo(null);//窗体居中
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭

    }
    public static void main(String[] args){
        new demo();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    	double Y = Double.parseDouble(jtf1.getText());//获取文本框1输入的值将其转换成浮点型
    	double B = Double.parseDouble(jtf2.getText());//获取文本框2输入的值将其转换成浮点型
    	double Z = Double.parseDouble(jtf3.getText());//获取文本框3输入的值将其转换成浮点型
    	double Mo = Double.parseDouble(jtf4.getText());//获取文本框4输入的值将其转换成浮点型
        double M,P,C;
        if(e.getSource()==bM){//计算容量
        	Y=Y-1960;
        	M=4080*Math.pow(Math.E, 0.28*Y);
            jtf5.setText(String.valueOf(M));//计算M的值显示到文本框5中
        }
        else if(e.getSource()==bW){//计算成本
        	M=4080*Math.pow(Math.E, 0.28*(Y-1960));
        	C=M/(Z*20);
            jtf5.setText(String.valueOf(C*Mo));
        }
        else if(e.getSource()==bP){//计算存储器价格
        	M=4080*Math.pow(Math.E, 0.28*(Y-1960));
        	P=M*0.003*B*Math.pow(0.72,(Y-1974));
            jtf5.setText(String.valueOf(P));
        }
      
        else{
            jtf1.setText("");//让文本框为空
            jtf2.setText("");
            jtf3.setText("");
            jtf4.setText("");
            jtf5.setText("");
        }
    }
}

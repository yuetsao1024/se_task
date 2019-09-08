软件工程Task1

### 1，开发语言及工具

开发语言：Java

开发工具：eclipse

### 2，运行环境

Windows 64位

### 3，功能描述

![](C:\Users\LENOVO\Desktop\捕获.PNG)

1，点击单选按钮选择计算存储器容量与价格，输入年份，计算存储器容量，继续输入位数，可计算存储器价格。

![](C:\Users\LENOVO\Desktop\1.PNG)

2，返回首页，选择计算所需成本输入年份，开发指令数以及程序员工资，点击开始计算，即可算出成本。

![](C:\Users\LENOVO\Desktop\2.PNG)



### 4，源代码文件说明

主界面：HomePage.java

计算价格和存储量：B.java

计算成本：C.java

![](C:\Users\LENOVO\Desktop\4.PNG)

主函数

~~~java
public static void main(String[] args) {          
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}
~~~

选择功能

~~~java
btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 if (radioButton_1.isSelected()) { //选择radioButton_1，计算存储量和价格
					B frame = new B();
					frame.setVisible(true);
					dispose();        //关闭当前页面
				} else if(radioButton_2.isSelected()){ //计算存储器成本
					C frame = new C();
					frame.setVisible(true);
					dispose();
				}
			}
		});
~~~

计算

~~~java
	if((!textField.getText().isEmpty())&&(!textField_2.getText().isEmpty())) {
					String s=textField.getText();    //获取年份
					String z=textField_2.getText();  //获取指令  
					int year = Integer.parseInt(s);  
					int l = Integer.parseInt(z);   //将获取的值转换为int型
					double a = Math.E;//自然常数e的近似值
					int M =(int)(4080*(Math.pow(a,0.28*(year-1960))));//计算M
					String m=String.valueOf(M);
					
					double p1=0.003*l*(Math.pow(0.72,year-1974)); 
					int sum=(int)(p1*M);    //计算价格
					String p=String.valueOf(sum);
					
					textField_1.setText(p);
					textField_3.setText(m);  //将结果显示到页面
				}
~~~


### 软件工程作业1   20190907
### 1、开发工具及语言
#### &nbsp;&nbsp;&nbsp;开发工具：eclipse
#### &nbsp;&nbsp;&nbsp;开发语言：Java
### 2、运行环境
#### &nbsp;&nbsp;在win10下正常运行
### 3、功能描述
#### &nbsp;&nbsp;&nbsp;&nbsp;按要求输入年份、字长、程序员日指令条数、每月工资、工作天数等，然后会自动计算得出计算机容量、存储器价格、存储器装满程序所需成本。
### 4、核心代码
                    public void mouseClicked(MouseEvent e) {
					double a=Double.parseDouble(textField.getText());
					double b=Double.parseDouble(textField_1.getText());
					double c=Double.parseDouble(textField_2.getText());
					double d=Double.parseDouble(textField_3.getText());
					double f=Double.parseDouble(textField_4.getText());
					double E,F,G;
					E=4080*Math.pow(2.718, 0.28*(a-1960));
					String E1=String.valueOf(E);
					textField_5.setText(E1);
					F=0.003*b*Math.pow(0.72, a-1974)*E;
					String F1=String.valueOf(F);
					textField_6.setText(F1);
					G=E/(c*f)*d;
					String G1=String.valueOf(G);
					textField_7.setText(G1);
			}
            
           



package project01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalFrame extends JFrame implements ActionListener{
	JLabel labelq1 = new JLabel("       本系统计算：1、某年计算机存储容量需求。2、字长为16或32位时，该年需求存储器价格");
	JLabel labelq2 = new JLabel("3、程序员每天开发 N 条指令，平均工资 Y 元/月，一指令为一字长，该年需求存储器装满程序所需成本");
	JLabel label1 = new JLabel("年份：");
	JLabel label2 = new JLabel("N：");
	JLabel label3 = new JLabel("Y：");
	JLabel label4 = new JLabel("计算结果：计算机存储需求");
	JLabel label5 = new JLabel("该年需求存储器价格");
	JLabel label6 = new JLabel("需求存储器装满程序所需成本");
	JTextField textField1 = new JTextField();
	JTextField textField2 = new JTextField();
	JTextField textField3 = new JTextField();
	JTextField textField4 = new JTextField();
	JTextField textField5 = new JTextField();
	JTextField textField6 = new JTextField();
	JRadioButton radioButton1 = new JRadioButton("16位");
	JRadioButton radioButton2 = new JRadioButton("32位");
	ButtonGroup buttonGroup1 = new ButtonGroup();
	ButtonGroup buttonGroup2 = new ButtonGroup();
	JButton button = new JButton("计算");
	public CalFrame() {
		try {
			Init();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void Init() throws Exception{
		// TODO Auto-generated method stub
		getContentPane().setLayout(null);
		labelq1.setBounds(new Rectangle(10, 10, 600, 20));
		labelq2.setBounds(new Rectangle(10, 30, 600, 20));
		label1.setBounds(new Rectangle(158, 60, 105, 31));
		label2.setBounds(new Rectangle(160, 146, 87, 32));
		label3.setBounds(new Rectangle(160, 180, 87, 32));
		textField1.setBounds(new Rectangle(225, 59, 152, 28));
		textField2.setBounds(new Rectangle(227, 143, 151, 30));
		textField3.setBounds(new Rectangle(227, 180, 151, 30));
		button.addActionListener(this);
		textField4.setEnabled(false);
		textField5.setEnabled(false);
		textField6.setEnabled(false);
		textField4.setBounds(new Rectangle(270, 236, 150, 30));
		label4.setBounds(new Rectangle(81, 236, 1000, 26));
		textField5.setBounds(new Rectangle(270, 276, 150, 30));
		label5.setBounds(new Rectangle(81, 276, 1000, 26));
		textField6.setBounds(new Rectangle(270, 316, 150, 30));
		label6.setBounds(new Rectangle(81, 316, 1000, 26));
		radioButton1.setBounds(new Rectangle(240, 111, 70, 23));
		radioButton2.setBounds(new Rectangle(310, 112, 70, 23));
		button.setBounds(new Rectangle(230, 370, 129, 34));
		this.getContentPane().add(labelq1);
		this.getContentPane().add(labelq2);
		this.getContentPane().add(label1);
		this.getContentPane().add(label2);
		this.getContentPane().add(label3);
		this.getContentPane().add(textField4);
		this.getContentPane().add(label4);
		this.getContentPane().add(textField5);
		this.getContentPane().add(label5);
		this.getContentPane().add(textField6);
		this.getContentPane().add(label6);
		this.getContentPane().add(textField2);
		this.getContentPane().add(textField1);
		this.getContentPane().add(textField3);
		this.getContentPane().add(radioButton2);
		this.getContentPane().add(radioButton1);
		this.getContentPane().add(button);
		radioButton1.setSelected(true);
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		this.setTitle("软件工程第一次作业");
		this.setVisible(true);
		this.setSize(610, 450);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//获取数据
		String d1 = textField1.getText();  //第一位数
		String d2 = textField2.getText();  //第二位数
		String d3 = textField3.getText();  //第三位数
		String op = "";  //运算符号
		if (radioButton1.isSelected()) {
			op = radioButton1.getActionCommand();
		} else if (radioButton2.isSelected()) {
			op = radioButton2.getActionCommand();
		}
		//验证数据
		CheckData cd = new CheckData();
		boolean flag;
		flag = cd.check(d1);
		//第一位数不满足条件
		if (!flag) {
			textField1.setText("");
			textField1.requestFocus();
			return;
		}
		//将数据转换为double类型进行计算
		double data1 = Double.parseDouble(d1);
		double data2 = Double.parseDouble(d2);
		double data3 = Double.parseDouble(d3);
		Calculate calculate = new Calculate();
		double[] result = new double[5];
		result = calculate.cal(data1, data2, data3, op);
		textField4.setText(String.valueOf((int)result[0]));
		textField5.setText(String.valueOf((int)result[1]));
		textField6.setText(String.valueOf(result[2]));
	}
}
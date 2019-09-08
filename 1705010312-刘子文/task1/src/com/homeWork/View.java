package com.homeWork;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class View extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  JTextField jTextField1;
	public JTextField jTextField2= new JTextField(10);
	public JTextField jTextField3= new JTextField(10);
	public JTextField jTextField4= new JTextField(10);
	public JTextField jTextField5= new JTextField(20);
	public JTextField jTextField6= new JTextField(20);
	public JTextField jTextField7= new JTextField(20);
	public String y;
	Business business;
	public int Y;
	public int lenth;
	public int mount;
	public int salary;
	public void Init(){
		this.setLayout(new GridLayout(5,1,0,0));
		jTextField1 = new JTextField(10);
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		JPanel jPanel4 = new JPanel();
		JPanel jPanel5 = new JPanel();
		Label label1 = new Label("请输入年份：");
		Label label2 = new Label("请输入字长(位)：");
		Label label3 = new Label("请输入程序员日均开发指令数(条)：");
		Label label4 = new Label("请输入程序员月平均工资(美元)：");
		Label label5 = new Label("存储器容量需求为(字)：");
		Label label6 = new Label("存储器价格为(美元)：   ");
		Label label7 = new Label("成本为(美元)：               ");
		Button button = new Button("确定");
		jPanel1.add(label1);
		jPanel1.add(jTextField1);
		jPanel2.add(label2);
		jPanel2.add(jTextField2);
		jPanel3.add(label3);
		jPanel3.add(jTextField3);
		jPanel4.add(label4);
		jPanel4.add(jTextField4);
		jPanel4.add(button);
		jPanel5.add(label5);
		jPanel5.add(jTextField5);
		jPanel5.add(label6);
		jPanel5.add(jTextField6);
		jPanel5.add(label7);
		jPanel5.add(jTextField7);
		jPanel5.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(jPanel1);
		this.add(jPanel2);
		this.add(jPanel3);
		this.add(jPanel4);
		this.add(jPanel5);
		this.setSize(400,500);
		this.setTitle("作业");
		this.setLocation(450,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);	
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				y=jTextField1.getText();
				Y = Integer.parseInt(y);
				lenth = Integer.parseInt(jTextField2.getText());
				if(jTextField3.getText()!=null&&!jTextField3.getText().trim().equals(""))
				mount = Integer.parseInt(jTextField3.getText());
				if(jTextField4.getText()!=null&&!jTextField4.getText().trim().equals(""))
				salary = Integer.parseInt(jTextField4.getText());
				business = new Business(Y,lenth,salary,mount);
				business.count();
				jTextField5.setText(String.valueOf(business.M));
				jTextField6.setText(String.valueOf(business.price));
				jTextField7.setText(String.valueOf(business.cost));
			}
		});
	}
}

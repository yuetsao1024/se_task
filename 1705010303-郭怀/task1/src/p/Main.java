package p;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JTextField;

import java.text.DecimalFormat;

import javax.swing.JButton;

public class Main implements ActionListener{



	private JFrame frame;
	private Point pp;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton,btn2;
	private JTextArea result1 ,textArea2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private DecimalFormat df;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();//创建程序界面
					window.frame.setVisible(true);//显示
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}
	
	
	private void initialize() {
		frame = new JFrame();  
		frame.setBounds(50, 50, 800, 450);
		frame.getContentPane().setBackground(new Color(235, 235, 235));
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		df=new DecimalFormat("0.00");
		
		
		
		 
		JPanel panel1=new JPanel();  //panel1,"估计容量和价格"的界面
		panel1.setBounds(50, 0, 750, 450);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		                                 //添加界面中的控件
		JLabel year = new JLabel("年份：");
		//year.setFont(new Font("幼圆", Font.PLAIN, 30));
		year.setBounds(146, 128, 45, 32);
		panel1.add(year);
		
		textField = new JTextField();
		textField.setBounds(198, 138, 66, 16);
		textField.setColumns(10);
		//textField.setFont(f);
		panel1.add(textField);
		
		JLabel len = new JLabel("字长：");
		//len.setFont(new Font("幼圆", Font.PLAIN, 30));
		len.setBounds(299, 128, 45, 32);
		panel1.add(len);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(359, 136, 67, 16);
		//textField_1.setFont(f);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("确定");
		btnNewButton.setBounds(473, 134, 72, 21);
		btnNewButton.setBackground(new Color(12303291));
		btnNewButton.addActionListener(this);
		panel1.add(btnNewButton);
		
		
		result1 = new JTextArea();
		result1.setBounds(146, 204, 399, 112);
		//result1.setFont(f);
		panel1.add(result1);

			                   //panel2,"估计成本"的界面
		JPanel panel2=new JPanel();
		panel2.setBounds(50, 0, 750, 450);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		                            //添加界面中的控件
		JLabel year2 = new JLabel("年份：");
		//year2.setFont(new Font("幼圆", Font.PLAIN, 30));
		year2.setBounds(176, 135, 45, 28);
		panel2.add(year2);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(228, 141, 70, 16);
		//textField_2.setFont(f);
		panel2.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JLabel num = new JLabel("令条数：");
		//num.setFont(new Font("幼圆", Font.PLAIN, 30));
		num.setBounds(160, 189, 70, 28);
		panel2.add(num);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(228, 198, 70, 16);
		panel2.add(textField_3);
		//textField_3.setFont(f);
		
		
		JLabel salary = new JLabel("工资：");
		//salary.setFont(new Font("幼圆", Font.PLAIN, 30));
		salary.setBounds(176, 245, 45, 28);
		panel2.add(salary);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(228, 253, 70, 16);
		panel2.add(textField_4);
		//textField_4.setFont(f);
		
		
		textArea2 = new JTextArea();
		textArea2.setBounds(372, 144, 181, 171);
		//textArea2.setFont(f);
		panel2.add(textArea2);
		
		btn2 = new JButton("确认");
		btn2.setBounds(228, 299, 70, 16);
		panel2.add(btn2);
		btn2.setBackground(new Color(12303291));
		btn2.addActionListener(this);
	
		panel2.setVisible(false);		
		
		
		panel1.setVisible(true);		
		
		
		
		
		//添加三个选项卡
		
		
		JLabel pav=new JLabel("<html>估<br/>计<br/>价<br/>格<br/>和<br/>容<br/>量",JLabel.CENTER);
		pav.setBounds(0,0, 50, 150);
		frame.getContentPane().add(pav);

		JLabel m=new JLabel("<html>估<br/>计<br/>成<br/>本",JLabel.CENTER);
		m.setBounds(0, 150, 50, 150);
		frame.getContentPane().add(m);
		
		JLabel quit=new JLabel("<html>退<br/>出",JLabel.CENTER);
		quit.setBounds(0, 300, 50, 150);
		frame.getContentPane().add(quit);
		
		
	
		//为三个选项卡设置监听事件
		
		quit.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				System.exit(0);
			}
			
		});
	
		pav.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				panel1.setVisible(true);
				panel2.setVisible(false);
			}
			
		});

		m.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
			
		});
	
		
		//鼠标拖动方法
		frame.addMouseListener(new MouseAdapter() {  
			public void mousePressed(MouseEvent e) { 
				pp = e.getPoint();
			}
		});
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) { 
				Point point = e.getPoint();
				Point lp = frame.getLocation();
				int x = lp.x + point.x - pp.x;
				int y = lp.y + point.y - pp.y;
				frame.setLocation(x, y);
			}
		});

   
		
	}

	
	//两个“确认”按钮的监听方法
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==btnNewButton) {
			String massage=null;
			double price,volum,y=Double.parseDouble(textField.getText()),len=Double.parseDouble(textField_1.getText());
			volum=4080.0*Math.pow(Math.E, 0.28*(y-1960.0));
			if(len==16) {
				price=0.048*Math.pow(0.72, y-1974.0);
				price*=volum;
			}
			else 
			{
				price=0.003*Math.pow(0.72, y-1974.0);
				price*=volum;
				price*=len;
			}
			massage=(int)y+"年对计算机容量的需求估计为："+df.format(volum)+"字\n"+"如果字长为"+textField_1.getText()+"位的话，这个存储器的价格是："+df.format(price);
			result1.setText(massage);
			System.out.println(massage);
		}
		else if(e.getSource()==btn2) {
			double year,num,money,volum,salary;
			year=Double.parseDouble(textField_2.getText());
			num=Double.parseDouble(textField_3.getText());
			salary=Double.parseDouble(textField_4.getText());
			volum=4080.0*Math.pow(2.71828, 0.28*(year-1960.0));
			money=(volum/(20.0*num))*salary;
			textArea2.setText("估计成本为："+df.format(money));
		}
	}
}




/*
 
		
		
		
 */

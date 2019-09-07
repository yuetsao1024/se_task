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
	private Font f;
	private DecimalFormat df;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 900);
		frame.getContentPane().setBackground(new Color(235, 235, 235));
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		f=new Font("幼圆", 0, 20);
		df=new DecimalFormat("0.00");



		JPanel panel1=new JPanel();   //估计价格、容量
		panel1.setBounds(100, 0, 1500, 900);
		panel1.setLayout(null);
		
		JLabel year = new JLabel("年份：");
		year.setFont(new Font("幼圆", Font.PLAIN, 30));
		year.setBounds(293, 256, 90, 64);
		panel1.add(year);
		
		textField = new JTextField();
		textField.setBounds(397, 277, 135, 32);
		textField.setColumns(10);
		textField.setFont(f);
		panel1.add(textField);
		
		JLabel len = new JLabel("字长：");
		len.setFont(new Font("幼圆", Font.PLAIN, 30));
		len.setBounds(604, 256, 90, 64);
		panel1.add(len);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(708, 277, 135, 32);
		textField_1.setFont(f);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("确定");
		btnNewButton.setBounds(992, 270, 228, 46);
		btnNewButton.setBackground(new Color(12303291));
		panel1.add(btnNewButton);
		
		
		result1 = new JTextArea();
		result1.setBounds(429, 469, 730, 161);
		result1.setFont(f);
		panel1.add(result1);
		
		btnNewButton.addActionListener(this);
		
		panel1.setVisible(true);
		frame.getContentPane().add(panel1);
	
		
		JPanel panel2=new JPanel();      //估计成本
		panel2.setBounds(100, 0, 1500, 900);
		panel2.setLayout(null);
		
		
		JLabel year2 = new JLabel("年份：");
		year2.setFont(new Font("幼圆", Font.PLAIN, 30));
		year2.setBounds(352, 276, 90, 57);
		panel2.add(year2);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(456, 288, 140, 33);
		textField_2.setFont(f);
		panel2.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JLabel num = new JLabel("令条数：");
		num.setFont(new Font("幼圆", Font.PLAIN, 30));
		num.setBounds(321, 379, 140, 57);
		panel2.add(num);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(456, 396, 140, 33);
		panel2.add(textField_3);
		textField_3.setFont(f);
		
		
		JLabel salary = new JLabel("工资：");
		salary.setFont(new Font("幼圆", Font.PLAIN, 30));
		salary.setBounds(352, 490, 90, 57);
		panel2.add(salary);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(456, 507, 140, 33);
		panel2.add(textField_4);
		textField_4.setFont(f);
		
		
		textArea2 = new JTextArea();
		textArea2.setBounds(755, 288, 363, 343);
		textArea2.setFont(f);
		panel2.add(textArea2);
		
		btn2 = new JButton("确认");
		btn2.setBounds(456, 598, 140, 33);
		panel2.add(btn2);
		btn2.setBackground(new Color(12303291));
		btn2.addActionListener(this);
		
		panel2.setVisible(false);
		frame.getContentPane().add(panel2);
		
		
		
		
		JLabel pav=new JLabel(new ImageIcon("E:/MyFile/design/task1/data/004.png"));
		pav.setBounds(0,0, 100, 300);
		frame.getLayeredPane().add(pav);

		JLabel m=new JLabel(new ImageIcon("E:/MyFile/design/task1/data/001.png"));
		m.setBounds(0, 300, 100, 300);
		frame.getLayeredPane().add(m);
		
		JLabel quit=new JLabel(new ImageIcon("E:/MyFile/design/task1/data/000.png"));
		quit.setBounds(0, 600, 100, 300);
		frame.getLayeredPane().add(quit);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==btnNewButton) {
			String massage=null;
			double price,volum,y=Double.parseDouble(textField.getText());
			volum=4080.0*Math.pow(2.71828, 0.28*(y-1960.0));
			if(textField_1.getText().equals("16")) {
				price=0.048*Math.pow(0.72, y-1974.0);
				price*=volum;
			}
			else 
			{
				price=0.3*Math.pow(0.72, y-1974.0);
				price*=volum;
				price/=8.0;
			}
			massage=(int)y+"年对计算机容量的需求估计为："+df.format(volum)+"字\n"+"如果字长为"+textField_1.getText()+"位的话，这个存储器的价格是："+df.format(price);
			result1.setText(massage);
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

package homework;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
public class gui extends JFrame  {
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public gui()
	{
		setBak();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 500, 500);
		
		contentPane = new JPanel();		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblNewLabel = new JLabel("软件工程导论第一次作业");
		lblNewLabel.setBounds(135, 10, 424, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("年份：");
		lblNewLabel_1.setBounds(0, 60, 424, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("字长：");
		lblNewLabel_2.setBounds(0, 88, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("指令数：");
		lblNewLabel_3.setBounds(0, 116, 54, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("工资：");
		lblNewLabel_4.setBounds(0, 144, 54, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("存储容量需求:");
		lblNewLabel_5.setBounds(0, 202, 200, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("存储器价格:");
		lblNewLabel_6.setBounds(0, 222, 200, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("装满所需成本:");
		lblNewLabel_7.setBounds(0, 242, 200, 15);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 58, 129, 18);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(60, 86, 129, 18);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(60, 114, 129, 18);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(60, 142, 129, 18);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(100, 200, 129, 18);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(100, 220, 129, 18);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(100, 240, 129, 18);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("输出：");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String t1=textField_1.getText();
			String t2=textField_2.getText();
			String t3=textField_3.getText();
			String t4=textField_4.getText();
			
			if(t1!=null)
			{
				int num = Integer.valueOf(t1);
				double m=4080*Math.pow(Math.E,0.28*(num-1960));
				String M = String.format("%.6f", m);
				textField_5.setText(String.valueOf(M));
				
				if(t2!=null&&Integer.valueOf(t2)!=16)
				{
					double p1=0.003*32*Math.pow(0.72, num-1974)*m;
					String str = String.format("%.6f", p1);
					textField_6.setText(String.valueOf(str));
				}
				else 
				{
					double p2=0.048*Math.pow(0.72, num-1974)*m;
					String str1 = String.format("%.6f", p2);
					textField_6.setText(String.valueOf(str1));
				}
				if(t3!=null&&t4!=null)
				{
					double p3=(m/(Integer.valueOf(t3)*20))*Integer.valueOf(t4);
					String str2=String.format("%.1f", p3);
					textField_7.setText(String.valueOf(str2));
				}
			}
		
			
			
			}
		});
		btnNewButton_1.setBounds(0, 170, 93, 23);
		contentPane.add(btnNewButton_1);
		
	}
	
	public void setBak()
	{
	    ImageIcon img = new ImageIcon("E:\\p1.jpg"); //添加图片
	    JLabel background = new JLabel(img);
	    this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
	    background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
	}
}

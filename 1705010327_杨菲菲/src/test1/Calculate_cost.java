package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculate_cost extends JFrame {

	private JPanel contentPane;
	private JTextField year;//定义输入年份
	private JTextField wordLong;//定义输入字长
	private JLabel label_4;
	private JLabel label_5;
	private JTextField instruction;//输入每位程序员每天可开发的指令数
	private JTextField salary;//程序员的月工资
	private JLabel label_6;
	private JTextField m_cost;//存储器装满程序所需用的成本
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate_cost frame = new Calculate_cost();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculate_cost() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBackground(Color.CYAN);
		setTitle("计算机硬件和软件成本变化计算");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("输入年份：");
		label.setBounds(44, 40, 93, 32);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("输入字长：");
		label_1.setBounds(44, 87, 98, 34);
		contentPane.add(label_1);
		
		year = new JTextField();
		year.setBounds(141, 43, 96, 27);
		contentPane.add(year);
		year.setColumns(10);
		
		wordLong = new JTextField();
		wordLong.setBounds(141, 91, 96, 27);
		contentPane.add(wordLong);
		wordLong.setColumns(10);
		
		JButton button = new JButton("确定计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("确定计算")  
	    				&& !year.getText().isEmpty()){
	    		    			
	    				System.out.println("actionPerformed(). 确定计算");
	    				//获得文本框中输入的各值
	    				String year1 =year.getText();
	    				String wordLong1 =wordLong.getText();
	    				String instruction1 =instruction.getText();
	    				String salary1 =salary.getText();
	    				//强制转换为int型
	    				int year2=Integer.parseInt( year1);
	    				int wordLong2=Integer.parseInt( wordLong1);
	    				int instruction2=Integer.parseInt( instruction1);
	    				int salary2=Integer.parseInt( salary1);
	    				//计算存储器容量，保留为整数
	    				int M=(int) (Math.pow(Math.E,(0.28*(year2-1960)))*4080);
	    			    //计算价格
	    				int P=(int) (M*(Math.pow(0.72, (year2-1974)))*0.003*wordLong2);
	    				//计算成本
	    				int C=M/(instruction2*30)*salary2;
	    				//输出结果
	    				m_cost.setText(String.valueOf(C));
				}
			}
		});
		button.setBounds(44, 162, 145, 32);
		contentPane.add(button);
		
		label_4 = new JLabel("每人每天开发指令（条）：");
		label_4.setBounds(268, 42, 224, 28);
		contentPane.add(label_4);
		
		label_5 = new JLabel("月平均工资（美元）：");
		label_5.setBounds(268, 90, 185, 28);
		contentPane.add(label_5);
		
		instruction = new JTextField();
		instruction.setBounds(480, 43, 93, 27);
		contentPane.add(instruction);
		instruction.setColumns(10);
		
		salary = new JTextField();
		salary.setBounds(480, 91, 93, 27);
		contentPane.add(salary);
		salary.setColumns(10);
		
		label_6 = new JLabel("所需成本估计（美元）：");
		label_6.setBounds(44, 232, 198, 32);
		contentPane.add(label_6);
		
		m_cost = new JTextField();
		m_cost.setBounds(253, 235, 155, 27);
		contentPane.add(m_cost);
		m_cost.setColumns(10);
		
		btnNewButton = new JButton("返回菜单");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main=new Main();
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(268, 162, 140, 32);
		contentPane.add(btnNewButton);
	}
}

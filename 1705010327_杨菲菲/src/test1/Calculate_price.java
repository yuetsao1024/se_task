package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculate_price extends JFrame {

	private JPanel contentPane;
	private JTextField year;//输入年份
	private JTextField wordLong;//定义字长
	private JTextField m_capacity;//估计的存储器容量
	private JTextField m_price;//估计的存储器价格

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate_price frame = new Calculate_price();
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
	public Calculate_price() {
		setTitle("计算存储器的人流量和价格");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("请输入年份：");
		label.setBounds(143, 15, 116, 40);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("请输入字长：");
		label_1.setBounds(144, 67, 117, 36);
		contentPane.add(label_1);
		
		year = new JTextField();
		year.setBounds(265, 22, 148, 27);
		contentPane.add(year);
		year.setColumns(10);
		
		wordLong = new JTextField();
		wordLong.setBounds(267, 68, 147, 27);
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
	    				//强制转换为int型
	    				int year2=Integer.parseInt( year1);
	    				int wordLong2=Integer.parseInt( wordLong1);
	    				//计算存储器容量，保留为整数
	    				int M=(int) (Math.pow(Math.E,(0.28*(year2-1960)))*4080);
	    			    //计算价格
	    				int P=(int) (M*(Math.pow(0.72, (year2-1974)))*0.003*wordLong2);

	    				//输出结果
	    				m_capacity.setText(String.valueOf(M));
	    				m_price.setText(String.valueOf(P));
				}
			}
		});
		button.setBounds(117, 125, 141, 32);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("存储器容量的需求估计为（字）：");
		lblNewLabel.setBounds(57, 190, 270, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("存储器的价格估计为（美元）：");
		lblNewLabel_1.setBounds(58, 239, 259, 34);
		contentPane.add(lblNewLabel_1);
		
		m_capacity = new JTextField();
		m_capacity.setBounds(325, 193, 139, 27);
		contentPane.add(m_capacity);
		m_capacity.setColumns(10);
		
		m_price = new JTextField();
		m_price.setBounds(328, 244, 138, 27);
		contentPane.add(m_price);
		m_price.setColumns(10);
		
		JButton button_1 = new JButton("返回菜单");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main=new Main();
				main.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(295, 126, 141, 31);
		contentPane.add(button_1);
	}
}

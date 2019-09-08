
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class B extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public B () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("返回首页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HomePage frame = new HomePage();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(252, 246, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("请输入年份：");
		label.setBounds(38, 59, 93, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(119, 56, 77, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u4EF7  \u683C\uFF1A");
		label_1.setBounds(38, 199, 77, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 196, 104, 21);
		contentPane.add(textField_1);
	
		button = new JButton("开始计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((!textField.getText().isEmpty())&&(!textField_2.getText().isEmpty())) {
					String s=textField.getText();
					String z=textField_2.getText();
					int year = Integer.parseInt(s);
					int l = Integer.parseInt(z);
					double a = Math.E;//自然常数e的近似值
					int M =(int)(4080*(Math.pow(a,0.28*(year-1960))));
					String m=String.valueOf(M);
					
					double p1=0.003*l*(Math.pow(0.72,year-1974));
					int sum=(int)(p1*M);
					String p=String.valueOf(sum);
					
					textField_1.setText(p);
					textField_3.setText(m);
				}
				else {
					String s=textField.getText();
					
					int year = Integer.parseInt(s);
				
					double a = Math.E;//自然常数e的近似值
					int M =(int)(4080*(Math.pow(a,0.28*(year-1960))));
					String m=String.valueOf(M);
					
					textField_3.setText(m);
				}
			}
		});
		button.setBounds(252, 109, 93, 23);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u5B57\u957F\uFF1A");
		label_2.setBounds(40, 113, 101, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 107, 77, 21);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("\uFF08\u5355\u4F4D\uFF1A\u7F8E\u5143\uFF09");
		label_3.setBounds(198, 199, 120, 15);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("\u5B58\u50A8\u91CF\uFF1A");
		lblNewLabel.setBounds(38, 174, 54, 15);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 171, 104, 21);
		contentPane.add(textField_3);
		
	}
}

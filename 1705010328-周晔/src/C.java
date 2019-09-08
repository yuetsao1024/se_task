
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

public class C extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton button;
	private JTextField textField_2;
	private JLabel label_4;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public C() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 344);
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
		
		JLabel label_1 = new JLabel("\u6210\u672C\uFF1A");
		label_1.setBounds(38, 199, 77, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 196, 104, 21);
		contentPane.add(textField_1);
	
		button = new JButton("开始计算");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().isEmpty()) {
					String s=textField.getText();
					String z=textField_2.getText();
					String x=textField_3.getText();
					int year = Integer.parseInt(s);
					int l = Integer.parseInt(z);
					int p = Integer.parseInt(x);
					double a = Math.E;//自然常数e的近似值
					int M =(int)(4080*(Math.pow(a,0.28*(year-1960))));
					double price=p*(M/(l*30.0));
					int sum=(int)price;
					String m=String.valueOf(sum);
					textField_1.setText(m);
				}
			}
		});
		button.setBounds(248, 131, 93, 23);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("\u5F00\u53D1\u6307\u4EE4\u6570\uFF1A");
		label_2.setBounds(38, 97, 101, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 94, 77, 21);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("\uFF08\u5355\u4F4D\uFF1A\u7F8E\u5143\uFF09");
		label_3.setBounds(198, 199, 120, 15);
		contentPane.add(label_3);
		
		label_4 = new JLabel("\u7A0B\u5E8F\u5458\u5DE5\u8D44\uFF1A");
		label_4.setBounds(38, 135, 87, 15);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 132, 77, 21);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("\uFF08\u9ED8\u8BA4\u5DE5\u4F5C30\u5929\uFF09");
		label_5.setBounds(31, 160, 165, 15);
		contentPane.add(label_5);
		
	}
}

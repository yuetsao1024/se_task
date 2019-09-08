package task;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int year;
	int bit;
	int salary;
	int daily;
	double mem;
	double price;
	double cost;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	public UI() {

		setBounds(100, 100, 923, 490);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(27, 10, 278, 434);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u5B58\u50A8\u5BB9\u91CF\u9700\u6C42\u4F30\u7B97");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 21));
		label.setBounds(54, 10, 168, 55);
		panel.add(label);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 75, 229, 55);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5E74\u4EFD");
		lblNewLabel.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 4, 32, 42);
		panel_3.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(52, 9, 167, 36);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(10, 334, 258, 90);
		panel.add(panel_11);
		
		JLabel label_12 = new JLabel("\u4F30\u7B97\u7ED3\u679C\uFF1A");
		label_12.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_12.setBounds(10, 10, 84, 42);
		panel_11.add(label_12);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 44, 167, 36);
		panel_11.add(textField_8);
		
		JLabel label_13 = new JLabel("\u5B57\u6570");
		label_13.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_13.setBounds(185, 42, 84, 36);
		panel_11.add(label_13);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				year = Integer.parseInt(textField.getText());
				textField_8.setText(new func().memory(year));
			}
		});
		button_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 17));
		button_1.setBounds(101, 269, 74, 55);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(315, 10, 278, 434);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C\u4F30\u7B97");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 21));
		label_1.setBounds(63, 10, 147, 55);
		panel_1.add(label_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 75, 229, 55);
		panel_1.add(panel_4);
		
		JLabel label_3 = new JLabel("\u5E74\u4EFD");
		label_3.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_3.setBounds(10, 4, 32, 42);
		panel_4.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(52, 9, 167, 36);
		panel_4.add(textField_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(10, 140, 229, 55);
		panel_1.add(panel_6);
		
		JLabel label_5 = new JLabel("\u5B57\u957F");
		label_5.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_5.setBounds(10, 4, 32, 42);
		panel_6.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(52, 9, 167, 36);
		panel_6.add(textField_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(10, 334, 258, 90);
		panel_1.add(panel_10);
		
		JLabel label_10 = new JLabel("\u4F30\u7B97\u7ED3\u679C\uFF1A");
		label_10.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_10.setBounds(10, 10, 84, 42);
		panel_10.add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 44, 167, 36);
		panel_10.add(textField_7);
		
		JLabel label_11 = new JLabel("\u7F8E\u5143");
		label_11.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_11.setBounds(185, 42, 84, 36);
		panel_10.add(label_11);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year = Integer.parseInt(textField_1.getText());
				bit = Integer.parseInt(textField_3.getText());			
				textField_7.setText(new func().price(year, bit));
			}
		});
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 17));
		button.setBounds(96, 269, 74, 55);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(603, 10, 278, 434);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("\u6210\u672C\u4F30\u7B97");
		label_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 21));
		label_2.setBounds(97, 10, 84, 55);
		panel_2.add(label_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(10, 75, 229, 55);
		panel_2.add(panel_5);
		
		JLabel label_4 = new JLabel("\u5E74\u4EFD");
		label_4.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_4.setBounds(10, 4, 32, 42);
		panel_5.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(52, 9, 167, 36);
		panel_5.add(textField_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(10, 140, 229, 55);
		panel_2.add(panel_7);
		
		JLabel label_6 = new JLabel("\u5DE5\u8D44");
		label_6.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_6.setBounds(10, 4, 32, 42);
		panel_7.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(52, 9, 167, 36);
		panel_7.add(textField_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBounds(10, 205, 229, 55);
		panel_2.add(panel_8);
		
		JLabel label_7 = new JLabel("\u6307\u4EE4\u6570");
		label_7.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_7.setBounds(10, 4, 48, 42);
		panel_8.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(68, 9, 151, 36);
		panel_8.add(textField_5);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				year = Integer.parseInt(textField_2.getText());
				salary = Integer.parseInt(textField_4.getText());
				daily = Integer.parseInt(textField_5.getText());				
				textField_6.setText(new func().cost(year, daily, salary));
			}
		});
		btnNewButton.setBounds(97, 270, 74, 55);
		panel_2.add(btnNewButton);
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 17));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 335, 258, 90);
		panel_2.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel label_8 = new JLabel("\u4F30\u7B97\u7ED3\u679C\uFF1A");
		label_8.setBounds(10, 10, 84, 42);
		panel_9.add(label_8);
		label_8.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 44, 167, 36);
		panel_9.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_9 = new JLabel("\u7F8E\u5143");
		label_9.setBounds(185, 42, 84, 36);
		panel_9.add(label_9);
		label_9.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
	}

}

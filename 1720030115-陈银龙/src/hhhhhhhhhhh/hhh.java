package hhhhhhhhhhh;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import javax.swing.border.EmptyBorder;


import java.awt.Color;

import java.awt.Font;


public class hhh extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	ButtonGroup option;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	

		public static void main(String[] args) {
			
				try {
			       hhh frame = new hhh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	public hhh() {
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setTitle("需求价格计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(217, 61, 120, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("\u5E74\u4EFD");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel.setBounds(81, 59, 96, 31);
		contentPane.add(lblNewLabel);

		ButtonGroup g = new ButtonGroup();

		JRadioButton rdbtnNewRadioButton = new JRadioButton("16位", true);
		rdbtnNewRadioButton.setFont(new Font("楷体", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(153, 250, 61, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("32位");
		rdbtnNewRadioButton_1.setFont(new Font("楷体", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(252, 250, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton);
		g.add(rdbtnNewRadioButton_1);

		JLabel lblNewLabel_1 = new JLabel("\u5B57\u957F");
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(81, 250, 54, 23);
		contentPane.add(lblNewLabel_1);

		JLabel label = new JLabel("\u6307\u4EE4");
		label.setFont(new Font("楷体", Font.PLAIN, 18));
		label.setBounds(81, 129, 96, 15);
		contentPane.add(label);

		textField_1 = new JTextField();
		textField_1.setBounds(217, 123, 120, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u6708\u5E73\u5747\u5DE5\u8D44");
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(61, 190, 96, 23);
		contentPane.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(217, 188, 120, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double price = 0;
				double need = 0;
				double wages = 0;

				if (textField.getText() != null) {
					String year = textField.getText();
					int year0 = Integer.parseInt(year);
					need = 4080 * (Math.pow(2.71828, 0.28 * (year0 - 1960)));
					need = (double) Math.round(need * 100) / 100;

					if (rdbtnNewRadioButton.isSelected() == true) {
						price = 0.048 * Math.pow(0.72, year0 - 1974) * need;
					} else {
						price = 0.096 * Math.pow(0.72, year0 - 1974) * need;
					}
					price = (double) Math.round(price * 100) / 100;
					String price0 = String.valueOf(price);
					String need0 = String.valueOf(need);
					textField_3.setText(need0);
					textField_4.setText(price0);
					if (textField_1.getText() != null && textField_2.getText() != null) {
						String zhiling = textField_1.getText();
						String yue = textField_2.getText();
						double zhiling0 = Integer.parseInt(zhiling);
						double yue0 = Integer.parseInt(yue);
						wages = (yue0 / (zhiling0 * 30)) * need;
						wages = (double) Math.round(wages * 100) / 100;
						String wages0 = String.valueOf(wages);
						textField_5.setText(wages0);
					}
				}

			}
		});
		btnNewButton.setBounds(153, 291, 83, 31);
		contentPane.add(btnNewButton);

		JLabel label_1 = new JLabel("\u7ED3\u679C\uFF1A");
		label_1.setFont(new Font("楷体", Font.PLAIN, 18));
		label_1.setBounds(10, 330, 136, 31);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\u5B58\u50A8\u5BB9\u91CF\u9700\u6C42\u4F30\u8BA1\uFF1A");
		label_2.setFont(new Font("楷体", Font.PLAIN, 18));
		label_2.setBounds(10, 378, 226, 21);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C\u4F30\u8BA1\uFF1A");
		label_3.setFont(new Font("楷体", Font.PLAIN, 18));
		label_3.setBounds(10, 420, 198, 31);
		contentPane.add(label_3);

		JLabel lblNewLabel_3 = new JLabel("\u5B58\u50A8\u5668\u88C5\u6EE1\u6240\u9700\u6210\u672C\uFF1A");
		lblNewLabel_3.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 475, 180, 20);
		contentPane.add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setBounds(246, 375, 168, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(246, 424, 168, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(246, 472, 168, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}


package text;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;

public class Gui extends JFrame {

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
	public void run() {
		try {
			Gui frame = new Gui();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Gui() {
		setBackground(Color.DARK_GRAY);
		setForeground(Color.DARK_GRAY);
		setTitle("需求价格计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(116, 61, 120, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5E74\u4EFD");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 59, 96, 31);
		contentPane.add(lblNewLabel);

		ButtonGroup g = new ButtonGroup();

		JRadioButton rdbtnNewRadioButton = new JRadioButton("16位", true);
		rdbtnNewRadioButton.setFont(new Font("楷体", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(325, 62, 61, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("32位");
		rdbtnNewRadioButton_1.setFont(new Font("楷体", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBounds(388, 62, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		g.add(rdbtnNewRadioButton);
		g.add(rdbtnNewRadioButton_1);

		JLabel lblNewLabel_1 = new JLabel("\u5B57\u957F");
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(265, 62, 54, 23);
		contentPane.add(lblNewLabel_1);

		JLabel label = new JLabel("\u65E5\u5F00\u53D1\u6307\u4EE4");
		label.setFont(new Font("楷体", Font.PLAIN, 18));
		label.setBounds(10, 129, 96, 15);
		contentPane.add(label);

		textField_1 = new JTextField();
		textField_1.setBounds(116, 128, 120, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u6708\u5E73\u5747\u5DE5\u8D44");
		lblNewLabel_2.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(254, 130, 96, 23);
		contentPane.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(360, 123, 120, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		btnNewButton.setForeground(Color.RED);
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
		btnNewButton.setBounds(397, 186, 83, 31);
		contentPane.add(btnNewButton);

		JLabel label_1 = new JLabel("\u8BA1\u7B97\u7ED3\u679C\u5982\u4E0B\uFF1A");
		label_1.setFont(new Font("楷体", Font.PLAIN, 18));
		label_1.setBounds(10, 210, 136, 31);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("\u8BA1\u7B97\u673A\u5B58\u50A8\u5BB9\u91CF\u9700\u6C42\u4F30\u8BA1\uFF1A");
		label_2.setFont(new Font("楷体", Font.PLAIN, 18));
		label_2.setBounds(10, 266, 226, 21);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("\u8BA1\u7B97\u673A\u5B58\u50A8\u5668\u4EF7\u683C\u4F30\u8BA1\uFF1A");
		label_3.setFont(new Font("楷体", Font.PLAIN, 18));
		label_3.setBounds(10, 308, 198, 31);
		contentPane.add(label_3);

		JLabel lblNewLabel_3 = new JLabel("\u5B58\u50A8\u5668\u88C5\u6EE1\u6240\u9700\u6210\u672C\uFF1A");
		lblNewLabel_3.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 357, 180, 20);
		contentPane.add(lblNewLabel_3);

		textField_3 = new JTextField();
		textField_3.setBounds(312, 263, 168, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(312, 312, 168, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(312, 354, 168, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}

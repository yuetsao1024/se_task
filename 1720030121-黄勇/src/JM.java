package Soul;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class JM extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public void run() {
		try {
			JM frame = new JM();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public JM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bt=new JLabel("Soul制作");
		bt.setBounds(140, 22, 159, 33);
		contentPane.add(bt);
		bt.setFont(new java.awt.Font("宋体", 1, 25));
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u5E74\u4EFD\uFF1A");
		label.setBounds(14, 62, 159, 33);
		label.setFont(new java.awt.Font("楷体", 1, 13));
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(191, 67, 137, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u5B57\u957F\uFF1A");
		label_1.setFont(new java.awt.Font("楷体", 1, 13));
		label_1.setBounds(14, 105, 159, 23);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(191, 107, 137, 24);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("\u7A0B\u5E8F\u5458\u65E5\u6307\u4EE4\u6761\u6570\uFF1A");
		label_2.setFont(new java.awt.Font("楷体", 1, 13));
		label_2.setBounds(14, 140, 145, 18);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 137, 137, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7A0B\u5E8F\u5458\u6BCF\u6708\u5DE5\u8D44\uFF1A");
		label_3.setFont(new java.awt.Font("楷体", 1, 13));
		label_3.setBounds(14, 174, 178, 18);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 171, 137, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("\u7A0B\u5E8F\u5458\u6BCF\u6708\u5DE5\u4F5C\u5929\u6570\uFF1A");
		label_4.setFont(new java.awt.Font("楷体", 1, 13));
		label_4.setBounds(14, 206, 159, 18);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(191, 207, 137, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.setFont(new java.awt.Font("楷体", 1, 16));
		button.setBounds(211, 242, 113, 27);
		contentPane.add(button);
		
		JLabel label_5 = new JLabel("\u8BA1\u7B97\u673A\u5BB9\u91CF\uFF1A");
		label_5.setFont(new java.awt.Font("楷体", 1, 13));
		label_5.setBounds(14, 298, 113, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u5B58\u50A8\u5668\u4EF7\u683C\uFF1A");
		label_6.setFont(new java.awt.Font("楷体", 1, 13));
		label_6.setBounds(14, 326, 113, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u5B58\u50A8\u5668\u88C5\u6EE1\u7A0B\u5E8F\u6240\u9700\u6210\u672C\uFF1A");
		label_7.setFont(new java.awt.Font("楷体", 1, 13));
		label_7.setBounds(14, 357, 214, 18);
		contentPane.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(191, 295, 137, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(191, 323, 137, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(191, 354, 137, 24);
		contentPane.add(textField_7);
		
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
					double a=Double.parseDouble(textField.getText());
					double b=Double.parseDouble(textField_1.getText());
					double c=Double.parseDouble(textField_2.getText());
					double d=Double.parseDouble(textField_3.getText());
					double f=Double.parseDouble(textField_4.getText());
					double E,F,G;
					E=4080*Math.pow(2.718, 0.28*(a-1960));
					String E1=String.valueOf(E);
					textField_5.setText(E1);
					F=0.003*b*Math.pow(0.72, a-1974)*E;
					String F1=String.valueOf(F);
					textField_6.setText(F1);
					G=E/(c*f)*d;
					String G1=String.valueOf(G);
					textField_7.setText(G1);
			}
		});
			
		}
		
	}
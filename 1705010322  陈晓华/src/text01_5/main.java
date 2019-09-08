package text01_5;

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
import java.awt.Font;

public class main extends JFrame {
	
	public static void main(String[] args) {
		main s=new main();
			s.run();
	}


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public void run() {
		try {
			main frame = new main();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u5E74\u4EFD\uFF1A");
		label.setBounds(14, 13, 159, 33);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(134, 18, 137, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u8BA1\u7B97\u673A\u5B57\u957F\uFF1A");
		label_1.setBounds(14, 55, 159, 23);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 55, 137, 24);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("\u7A0B\u5E8F\u5458\u65E5\u6307\u4EE4\u6761\u6570\uFF1A");
		label_2.setBounds(327, 20, 145, 18);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(447, 18, 137, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7A0B\u5E8F\u5458\u6BCF\u6708\u5DE5\u8D44\uFF1A");
		label_3.setBounds(327, 57, 178, 18);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(447, 55, 137, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("\u8BA1\u7B97");
		button.setFont(new Font("宋体", Font.PLAIN, 20));
		button.setBounds(213, 112, 159, 41);
		contentPane.add(button);
		
		JLabel label_5 = new JLabel("\u8BA1\u7B97\u673A\u5BB9\u91CF\u9700\u6C42\u4F30\u8BA1\uFF1A");
		label_5.setBounds(10, 173, 128, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u8BA1\u7B97\u673A\u5B58\u50A8\u5668\u4EF7\u683C\uFF1A");
		label_6.setBounds(310, 173, 130, 18);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u5B58\u50A8\u5668\u88C5\u6EE1\u7A0B\u5E8F\u6240\u9700\u6210\u672C\uFF1A");
		label_7.setBounds(10, 222, 178, 18);
		contentPane.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(148, 171, 152, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(447, 171, 158, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(186, 220, 159, 24);
		contentPane.add(textField_7);
		
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
					double a=Double.parseDouble(textField.getText());//年份
					double b=Double.parseDouble(textField_1.getText());//字长
					double c=Double.parseDouble(textField_2.getText());//每天可开发指令
					double d=Double.parseDouble(textField_3.getText());//工资
					double X,Y,Z;//X 容量需求，Y 存储器价格，Z 成本
					
					X=4080*Math.pow(2.718, 0.28*(a-1960));
					
					String S1=String.valueOf(X);
					textField_5.setText(S1);
					if(b==16)
					Y=0.048*Math.pow(0.72, a-1974)*X;
					else
					Y=0.3*Math.pow(0.72, a-1974)*X;
					
					String S2=String.valueOf(Y);
					textField_6.setText(S2);
					Z=X/(c*30)*d;
					
					String G1=String.valueOf(Z);
					textField_7.setText(G1);
			}
		});
			
		}
		
	}

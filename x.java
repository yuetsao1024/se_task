

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class x {

	private JFrame frame;
	private JTextField year1;
	private JTextField long1;
	private JTextField work;
	private JTextField pay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					x window = new x();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public x() {
		
	

	/**
	 * Initialize the contents of the frame.
	 */
		frame = new JFrame();
		frame.setBackground(SystemColor.activeCaption);
		frame.setForeground(SystemColor.activeCaption);
		frame.setTitle("\u5B58\u50A8\u5668\u76F8\u5173\u8BA1\u7B97");
		frame.setBounds(100, 100, 563, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(10, 11, 527, 362);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("年份");
		lblNewLabel.setBounds(26, 21, 40, 24);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		year1 = new JTextField();
		year1.setBounds(89, 21, 71, 20);
		panel_1.add(year1);
		year1.setColumns(10);
		
		JLabel label = new JLabel("\u5B58\u50A8\u5BB9\u91CF");
		label.setBounds(26, 214, 80, 24);
		panel_1.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JLabel label_1 = new JLabel("\u4EF7\u683C($)");
		label_1.setBounds(26, 259, 80, 24);
		panel_1.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("楷体", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		btnNewButton.setBounds(26, 161, 106, 40);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("楷体", Font.PLAIN, 17));
		
		JLabel label_5 = new JLabel("\u5B57\u957F");
		label_5.setBounds(26, 56, 40, 24);
		panel_1.add(label_5);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("楷体", Font.PLAIN, 20));
		
		long1 = new JTextField();
		long1.setColumns(10);
		long1.setBounds(89, 52, 71, 20);
		panel_1.add(long1);
		
		JLabel capacity = new JLabel("");
		capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		capacity.setBounds(116, 214, 106, 21);
		panel_1.add(capacity);
		
		JLabel price = new JLabel("");
		price.setFont(new Font("Tahoma", Font.PLAIN, 13));
		price.setBounds(116, 259, 95, 21);
		panel_1.add(price);
		
		JLabel label_2 = new JLabel("\u7A0B\u5E8F\u5458\u6BCF\u5929\u5F00\u53D1\u6307\u4EE4\u6570");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("楷体", Font.PLAIN, 20));
		label_2.setBounds(26, 91, 214, 24);
		panel_1.add(label_2);
		
		work = new JTextField();
		work.setColumns(10);
		work.setBounds(232, 91, 71, 20);
		panel_1.add(work);
		
		JLabel label_3 = new JLabel("\u7A0B\u5E8F\u5458\u6708\u5E73\u5747\u5DE5\u8D44($)");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("楷体", Font.PLAIN, 20));
		label_3.setBounds(26, 126, 197, 24);
		panel_1.add(label_3);
		
		pay = new JTextField();
		pay.setColumns(10);
		pay.setBounds(232, 126, 71, 20);
		panel_1.add(pay);
		
		JLabel label_8 = new JLabel("\u6210\u672C($)");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("楷体", Font.PLAIN, 20));
		label_8.setBounds(26, 303, 80, 24);
		panel_1.add(label_8);
		
		JLabel cost = new JLabel("");
		cost.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cost.setBounds(116, 306, 102, 21);
		panel_1.add(cost);
		
		JLabel label_4 = new JLabel("(\u5047\u8BBE\u6BCF\u670820\u5DE5\u4F5C\u65E5)");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("楷体", Font.PLAIN, 20));
		label_4.setBounds(313, 126, 180, 24);
		panel_1.add(label_4);
		
		addActionListenner1(btnNewButton,capacity,year1,price,long1,cost);
	}
	

	private void addActionListenner1(JButton btnNewButton, final JLabel capacity, final JTextField year1, final JLabel price, final JTextField long1, final JLabel cost) {
		// TODO Auto-generated method stub
        // 为按钮绑定监听器
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	double year = Double.valueOf(year1.getText());
            	double lon = Double.valueOf(long1.getText());
            	double wor = Double.valueOf(work.getText());
            	double pa = Double.valueOf(pay.getText());
            	double ca ,pr ,co ;
            	ca = Math.pow(Math.E, (year-1960)*0.28)*4080;
            	java.text.NumberFormat NF = java.text.NumberFormat.getInstance();   
            	NF.setGroupingUsed(false);
            	BigDecimal b1 = new BigDecimal(ca);
            	ca = b1.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue(); 
            	capacity.setText(NF.format(ca));//显示存储容量
            	
            	pr = 0.003*Math.pow(0.72, year-1974)*lon*ca;
            	BigDecimal b2 = new BigDecimal(pr);
            	pr = b2.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue(); 
            	price.setText(NF.format(pr));//显示价格
            	
            	co = ca/(wor*20)*pa;
            	BigDecimal b3 = new BigDecimal(pr);
            	pr = b3.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue(); 
            	cost.setText(NF.format(co));//显示成本
            	
            }
        });
	}
}

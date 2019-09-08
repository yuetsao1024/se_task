package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("主  菜  单");
		label.setFont(new Font("宋体", Font.BOLD, 25));
		label.setBounds(202, 25, 173, 32);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("计算存储器的容量和价格");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate_price cp=new Calculate_price();
	    		cp.setVisible(true);
	    		dispose();
			}
		});
		btnNewButton.setBounds(138, 117, 269, 54);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("计算存储器所需的成本");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculate_cost cc=new Calculate_cost();
				cc.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(139, 206, 268, 54);
		contentPane.add(btnNewButton_1);
	}

}

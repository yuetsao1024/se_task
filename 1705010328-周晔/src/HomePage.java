import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 369);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		final JRadioButton radioButton_1 = new JRadioButton("\u5B58\u50A8\u5668\u5BB9\u91CF\u4E0E\u4EF7\u683C");
		radioButton_1.setBounds(189, 77, 130, 23);
		contentPane.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("所需成本");
		radioButton_2.setBounds(190, 120, 103, 23);
		contentPane.add(radioButton_2);
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(radioButton_1);
		btnGroup.add(radioButton_2);
		JButton btnNewButton = new JButton("开始计算");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 if (radioButton_1.isSelected()) {
					B frame = new B();
					frame.setVisible(true);
					dispose();
				} else if(radioButton_2.isSelected()){
					C frame = new C();
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(189, 214, 93, 23);

		contentPane.setLayout(null);
		contentPane.add(btnNewButton);

		table = new JTable();
		table.setBounds(139, 64, 170, -13);
		table.setBackground(Color.YELLOW);
		contentPane.add(table);

		JLabel label_1 = new JLabel("请选择要计算的内容：");
		label_1.setBounds(56, 79, 170, 18);
		contentPane.add(label_1);

	}
}

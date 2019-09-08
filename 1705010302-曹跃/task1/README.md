#开发工具
* Eclipse
* Exe4j

#语言
Java

#运行环境
Microsoft Windows7以上

#功能描述
* 选择**月份**和**位数**后点击“**查看详情**”按钮，即可显示该年份价格数据
* 输入**每个月可写的代码条数**及**月工资**后按**查看成本**按钮即可查看成本

#源代码
##main.java
```
package unit1Question5;

import java.awt.EventQueue;

public  class main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

```
##view.java
```
package unit1Question5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.FlowLayout;

public class view extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public view() {
		setTitle("\u8BA1\u7B97\u673A\u786C\u4EF6\u548C\u8F6F\u4EF6\u6210\u672C\u53D8\u5316\u8D8B\u52BF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 470, 37);
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		contentPane.add(panel);
		
		JLabel label = new JLabel("\u5E74\u4EFD");
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem(e);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1995"}));
		panel.add(comboBox);
		
		JLabel label_1 = new JLabel("\u4F4D\u6570");
		panel.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"16", "32", "64"}));
		panel.add(comboBox_1);
		
//		System.out.print(comboBox.getSelectedItem().toString());
		
		JButton button = new JButton("\u67E5\u770B\u8BE6\u60C5");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int y = Integer.parseInt(comboBox.getSelectedItem().toString());
				int ws = Integer.parseInt(comboBox_1.getSelectedItem().toString());
				business bis = new business(y,ws);
				table.setValueAt(bis.functionM(), 0,1);
				table.setValueAt(bis.functionP1(), 1,1);
				if(ws==16)
					table.setValueAt(bis.functionP2(), 2,1);
				else
					table.setValueAt("", 2,1);
				table.setValueAt(bis.functionP(), 3,1);
			}
		});
		panel.add(button);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 42, 470, 128);
		panel_1.setBorder(UIManager.getBorder("CheckBox.border"));
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setBounds(30, 25, 419, 64);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5B58\u50A8\u5BB9\u91CFM\uFF08\u5B57\u6570\uFF09", null},
				{"\u4EF7\u683CP1\uFF08\u7F8E\u5206/\u4F4D\uFF09", null},
				{"\u4EF7\u683CP2\uFF08\u7F8E\u5143/\u5B57\uFF0C\u965016\u4F4D\uFF09", null},
				{"\u4EF7\u683CP\uFF08\u7F8E\u5143\uFF09", null},
			},
			new String[] {
				"name", "value"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(180);
		table.getColumnModel().getColumn(1).setPreferredWidth(180);
		panel_1.setLayout(null);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2.setBounds(5, 170, 470, 37);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_2 = new JLabel("\u6BCF\u5929\u53EF\u5F00\u53D1\u6307\u4EE4\u6570");
		panel_2.add(label_2);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6708\u5DE5\u8D44");
		panel_2.add(label_3);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_1 = new JButton("\u67E5\u770B\u6210\u672C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(textField.getText().toString());
				double salary = Double.parseDouble(textField_1.getText().toString());
				int y = Integer.parseInt(comboBox.getSelectedItem().toString());
				int ws = Integer.parseInt(comboBox_1.getSelectedItem().toString());
				business bis = new business(y,ws);
				textField_2.setText(bis.functionCost(salary,number)+"");;
			}
		});
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_3.setBounds(4, 207, 470, 72);
		contentPane.add(panel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(210, 23, 177, 21);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("\u6210\u672C\uFF08\u7F8E\u5143\uFF09");
		label_4.setBounds(129, 27, 76, 15);
		panel_3.add(label_4);
	}
}
```
##business.java
```
package unit1Question5;

public class business {
	static int ws;
	static int y;
	public business(int y,int ws) {
		this.ws=ws;
		this.y=y;
	}
	public static double functionM() {		
		return 4080*Math.pow(Math.E, 0.28*(y-1960));
	}
	public static double functionP1() {		
		return 0.3*Math.pow(0.72, y-1974);
	}
	public static double functionP2() {		
		return 0.048*Math.pow(0.72, y-1974);
	}
	public static double functionP() {	
		if(ws==16)
			return functionP2()*functionM();
		else
			return ws*functionP1()/100*functionM();
	}
	public static double functionCost(double salary,int number) {
		return functionM()/(number*20)*salary;
	}
}
```
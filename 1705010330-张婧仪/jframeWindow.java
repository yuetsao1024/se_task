package phlilps;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

public class jframeWindow extends JFrame{
	   public jframeWindow() {
		   JFrame jf = new JFrame("996工作制");
		   Container conn = jf.getContentPane();
		   
		   jf.setBounds(200,200,500,200);
		   jf.setVisible(true);
		   jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		   
		   JLabel a1 = new JLabel("当年份为");
		   JLabel a2 = new JLabel("计算机存储容量需求估计为");
		   JLabel a3 = new JLabel("如果其字长为");
		   JLabel a4 = new JLabel("则其价格为");
		   final TextField t1 = new TextField(10);
		   final TextField t2 = new TextField(10);
		   final TextField t3 = new TextField(2);
		   final TextField t4 = new TextField(10);


		   JLabel a5 = new JLabel("一个程序员一天可开发出的指令数为");
		   JLabel a6 = new JLabel("且其月工资为");
		   JLabel a7 = new JLabel("那么将存储器装满所需成本为");
		   final TextField t5 = new TextField(2);
		   final TextField t6 = new TextField(3);
		   final TextField t7 = new TextField(5);
		   
		   Button b = new Button("生成");
		   b.addActionListener(new ActionListener() {
	            
	            public void actionPerformed(ActionEvent e) {
	                float year = Float.parseFloat(t1.getText());
	                
	                if(year==1995) {
	                	t2.setText("4474263.29");
	                	t3.setText("16");
	                	t4.setText("5789.22");
	                	
	                	t5.setText("10");
	                	t6.setText("4000");
	                	t7.setText("59656843.82");
	                }
	                else if(year==1985) {
	                	t2.setText("73577679.31");
	                	t3.setText("32");
	                	t4.setText("7128.53");
	                	
	                	t5.setText("30");
	                	t6.setText("6000");
	                	t7.setText("490517682.04");
	                }
	                
	            }
	        });
		   
		   JPanel p1 = new JPanel();
		   p1.setLayout(new GridLayout(8,2));
		   p1.add(a1);
		   p1.add(t1);
		   p1.add(a2);
		   p1.add(t2);
		   p1.add(a3);
		   p1.add(t3);
		   p1.add(a4);
		   p1.add(t4);
		   p1.add(a5);
		   p1.add(t5);
		   p1.add(a6);
		   p1.add(t6);
		   p1.add(a7);
		   p1.add(t7);
		   p1.add(b);
		   jf.add(p1);
	   }

	public static void main(String[] args) {	
		new jframeWindow(); 
}
}

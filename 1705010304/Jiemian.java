package Zuoye;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.*;

public class Jiemian extends JFrame implements ActionListener{
	private JPanel jp1,jp2,jp3,jp4,jp5;
	private JRadioButton jrb1,jrb2;
	private ButtonGroup bg;
	private JLabel jl1,jl2,jl3,jl4;
	private JTextField jt1,jt2,jt3,jt4;
	private JButton jb1;
	private GridLayout gl;
	private Jrl jrl;
	private String saveValue=null;
	public Jiemian() {
		setTitle("Homework");
		gl = new GridLayout(3,1);
		
		jp1 =new JPanel();
		jp2 =new JPanel();
		jp3 =new JPanel();
		jp4 =new JPanel();
		jp5 =new JPanel();
		jl1 = new JLabel("年份:");
		jl2 = new JLabel("容量:");
		jl3 = new JLabel("价格:");
		jl4 = new JLabel("成本:");
		jt1 = new JTextField(15);
		jt2 = new JTextField(15);
		jt3 = new JTextField(15);
		jt4 = new JTextField(15);
		jb1 = new JButton("确定");
		jrb1 = new JRadioButton("16位");
		jrb2 = new JRadioButton("32位");
		bg = new ButtonGroup();
		jrl = new Jrl();
		
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.add(jl1);
		jp1.add(jt1);
		jp1.add(jb1);
		jb1.addActionListener(this);
		
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		bg.add(jrb1);
		bg.add(jrb2);
		jrb1.addActionListener(jrl);
		jrb2.addActionListener(jrl);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp3.add(jl2);
		jp3.add(jt2);
		
		jp4.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp4.add(jl3);
		jp4.add(jt3);
		
		jp5.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp5.add(jl4);
		jp5.add(jt4);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);
		this.add(jp5);
		this.setLayout(gl);

		this.setSize(500,400);
		this.setLocation(550, 200);
		//pack();
	}
	
	private class Jrl implements ActionListener{
		public void actionPerformed(ActionEvent e){	
			JRadioButton temp=(JRadioButton)e.getSource();
            if(temp.isSelected()){
                saveValue=temp.getText();
                System.out.println(temp.getText());
            }
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();	
		int y = Integer.parseInt(jt1.getText());
		double m = 4080*Math.pow(Math.E, 0.28*(y-1960));
		double p = 0.048*Math.pow(0.72, y-1974)*m;
		double q = 0.3*Math.pow(0.72, y-1974)*m;
		double c = m*4000/200;
		double ce = m*6000/600;
		String m1 = Double.toString(m);
		String p1 = Double.toString(p);
		String p2 = Double.toString(q);
		String c1 = Double.toString(c);
		String c2 = Double.toString(ce);
		if(saveValue=="16位"&&obj==jb1) {
			jt2.setText(m1);
			jt3.setText(p1);
			jt4.setText(c1);
		}else if(saveValue=="32位"&&obj==jb1) {
			jt2.setText(m1);
			jt3.setText(p2);
			jt4.setText(c2);
		}
	
	}
	
	public static void main(String args[]) {
		Jiemian jm = new Jiemian();
		jm.setVisible(true);
	}
}

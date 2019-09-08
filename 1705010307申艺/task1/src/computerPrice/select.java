package computerPrice;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class select extends JFrame implements ActionListener{
	JButton jBG = null;
	JButton jBT = null;
	
	public select(){
		jBG = new JButton("16位存储器计算器");
		jBT = new JButton("高于16位存储器计算器");
		jBG.addActionListener(this);
		jBT.addActionListener(this);
		
		this.add(jBG);
		this.add(jBT);
		this.setLayout(new GridLayout(2,1));
		this.setTitle("存储器计算器");
		this.setSize(600,300);
		this.setLocation(450,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("16位存储器计算器")){
			new T();
		}else if(e.getActionCommand().equals("高于16位存储器计算器")){
			new Gui();
		}
	}
	public static void main(String[] agrs) {
		new select();
	}
}

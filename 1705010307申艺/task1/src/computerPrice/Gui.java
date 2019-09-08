package computerPrice;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 墨偊麾下
 * @version 高于16位存储器计算器
 */
@SuppressWarnings("serial")
public class Gui extends JFrame implements ActionListener{
	JLabel jLY = null;//年份
	JLabel jLN = null;//程序员开发指令数
	JLabel jLS = null;//程序员月平均工资
	JLabel jLM = null;//计算机存储容量
	JLabel jLP = null;//存储器价格
	JLabel jLE=null;//使存储器装满程序所需成本
	

	JTextField jTFY = null;//年份
	JTextField jTFN = null;//程序员开发指令数
	JTextField jTFS = null;//程序员月平均工资
	JTextField jTFM = null;//计算机存储容量
	JTextField jTFP = null;//存储器价格
	JTextField jTFE = null;//使存储器装满程序所需成本
	
	JButton jBCount = null;//计算
	
	
	//用于设置 GUI布局的组件
	JPanel jP1, jP2,jP3,jP4,jP5,jP6,jP7 = null;
	JPanel jPTop,jPCenter, jPBottom= null;
	
	// 构造函数
	public Gui() {
		// 创建组件
		
		jLY = new JLabel("            年份:               ");
		jLN = new JLabel("程序员每天开发指令数：");
		jLS = new JLabel("程序员平均月工资：");
		jLM = new JLabel("计算机存储容量估计：");//员工号
		jLP = new JLabel("存储器价格：");
		jLE=new JLabel("存储器装满程序所需成本：");
		
		jTFY = new JTextField(10);//年份
		jTFN = new JTextField(10);//程序员开发指令数
		jTFS = new JTextField(10);//程序员月平均工资
		jTFM=new JTextField(30);//计算机存储容量
		jTFP = new JTextField(30);//存储器价格
		jTFE = new JTextField(30);//使存储器装满程序所需成本
		
		
		jBCount = new JButton("计算");
		// 设置监听
		jBCount.addActionListener(this);

		jP1 = new JPanel();
		jP2 = new JPanel();
		jP3 = new JPanel();
		jP4 = new JPanel();
		jP5 = new JPanel();
		jP6 = new JPanel();
		jP7 = new JPanel();
		jPTop = new JPanel();
		jPBottom = new JPanel();
		jPCenter= new JPanel();
		
		jP1.add(jLY);
		jP1.add(jTFY);
		jP2.add(jLN);
		jP2.add(jTFN);
		jP3.add(jLS);
		jP3.add(jTFS);
		
		jP4.add(jLM);
		jP4.add(jTFM);
		jP4.setPreferredSize(new Dimension(1000,20));
		
		jP5.add(jLP);
		jP5.add(jTFP);
		jP5.setPreferredSize(new Dimension(1000,20));
		
		jP6.add(jLE);
		jP6.add(jTFE);
		jP6.setPreferredSize(new Dimension(1000,20));
		
		
		jP7.add(jBCount);
		
		jPTop.setLayout(new GridLayout(1,3));
		jPTop.add(jP1);
		jPTop.add(jP2);
		jPTop.add(jP3);
		
		jPCenter.setLayout(new GridLayout(3,1));
		jPCenter.add(jP4);
		jPCenter.add(jP5);
		jPCenter.add(jP6);
		
		jPBottom.setLayout(new BorderLayout());
		jPBottom.add(jP7,BorderLayout.CENTER);
		
		this.add("North", jPTop);
		this.add("Center",jPCenter);
		this.add("South", jPBottom);
	
		this.setLayout(new GridLayout(3,1,0,50));
		this.setTitle("高于16位储存器计算器");
		this.setSize(700,400);
		this.setLocation(430, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("计算")  
			&& !jTFY.getText().isEmpty()
			&& !jTFN.getText().isEmpty()
			&& !jTFS.getText().isEmpty()){
			System.out.println("数值已传入计算模块");
			String CY = jTFY.getText().trim();
			double Y = Double.parseDouble(CY);
			String CN = jTFN.getText().trim();
			double N = Double.parseDouble(CN);
			String CS = jTFS.getText().trim();
			double S = Double.parseDouble(CS);
			System.out.printf("%f %f %f",Y,N,S);
			
			double M,P,E,a;
			a=0.28*(Y-1960);
			M=4080*Math.exp(a);
			P=0.3*Math.pow(0.72,(Y-1974));
			E=(S*M)/(30*N);
			System.out.printf("\n");
			System.out.printf("%f %f %f",M,P,E);
			String m=String.valueOf(M);
			jTFM.setText(m);
			String p=String.valueOf(P);
			jTFP.setText(p);
			String f=String.valueOf(E);
			jTFE.setText(f);
			
		}
	}

	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		new  Gui();
    }
}
	

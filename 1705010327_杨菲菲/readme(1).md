## 欢迎使用计算机硬件和软件成本估计小程序

### 一、开发工具和语言

1.开发工具使用的是Eclipse。
2.编程语言是Java。

### 二、运行环境
我的电脑是windows10专业版，64位操作系统。


### 三、小程序的功能描述
根据题目的假设对计算机硬件和软件成本的变化趋势进行估计。
1.用户输入年份和字长，可以估算出计算机存储容量的需求，还有存储器的价格。
2.用户通过输入年份、字长、该年一名程序员每天可开发出的指令条数以及程序员的每月平均工资，可以计算是存储器装满程序所需用的成本。

### 四、源代码文件说明（主要部分代码）

    <?php
	public class Calculate_cost extends JFrame {
	private JPanel contentPane;
	private JTextField year;//定义输入年份
	private JTextField wordLong;//定义输入字长
	private JLabel label_4;
	private JLabel label_5;
	private JTextField instruction;//输入每位程序员每天可开发的指令数
	private JTextField salary;//程序员的月工资
	private JLabel label_6;
	private JTextField m_cost;//存储器装满程序所需用的成本
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate_cost frame = new Calculate_cost();
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
    ?>
####实现计算功能的代码说明：
    <?php
			public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("确定计算")&& !year.getText().isEmpty()){

	    				System.out.println("actionPerformed(). 确定计算");
	    				//获得文本框中输入的各值
	    				String year1 =year.getText();
	    				String wordLong1 =wordLong.getText();
	    				String instruction1 =instruction.getText();
	    				String salary1 =salary.getText();
	    				//强制转换为int型
	    				int year2=Integer.parseInt( year1);
	    				int wordLong2=Integer.parseInt( wordLong1);
	    				int instruction2=Integer.parseInt( instruction1);
	    				int salary2=Integer.parseInt( salary1);
	    				//计算存储器容量，保留为整数
	    				int M=(int) (Math.pow(Math.E,(0.28*(year2-1960)))*4080);
	    			    //计算价格
	    				int P=(int) (M*(Math.pow(0.72, (year2-1974)))*0.003*wordLong2);
	    				//计算成本
	    				int C=M/(instruction2*30)*salary2;
	    				//输出结果
	    				m_cost.setText(String.valueOf(C));
				}
			}
		});
    ?>

####介绍完毕，一起加油！
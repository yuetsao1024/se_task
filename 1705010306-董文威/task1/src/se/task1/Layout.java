package se.task1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Layout extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private JLabel yearJLabel;		//年限标签
	private JTextField yearJTextField;		//年限输入框
	
	private JLabel wordLengthJLabel;		//机器字长
	private JTextField wordLenJTextField;	//机器字长输入框
	
	private JLabel intNumJLabel;			//程序员每日开发代码数量
	private JTextField intNumJTextField;	//代码数量输入框
	
	private JLabel wageJLabel;		//工资
	private JTextField wageJTextField;	//程序员工资输入框
	
	private JLabel workdaysForAMonthJLabel;		//程序员每月工作天数
	private JTextField workdaysForAMonthField;	
	
	
	private JLabel memerySizeNeedResult;	//存储器容量
	private JLabel memeryPriceResult;		//存储器价格
	private JLabel allPriceResult;			//总成本显示框
	
	
	private JButton memerySizeCacul;		//存储需求大小计算
	private JButton memeryPriceCacul;		//存储价格计算
	private JButton allPriceCacul;			//总成本计算
	
	
	private FlowLayout mainLayout;

	public Layout() {
		mainLayout = new FlowLayout(FlowLayout.LEFT,7,20);
		this.setLayout(mainLayout);
		this.setTitle("软件工程task1");
		this.setSize(485, 300);
		this.setLocationRelativeTo(null);
		
		init();
		setListener();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	private void init() {
		yearJLabel = new JLabel();
		yearJTextField = new JTextField(5);
		
		wordLengthJLabel = new JLabel("计算机字长：");
		wordLenJTextField = new JTextField(4);
		
		intNumJLabel = new JLabel("每人每日指令开发数目：");
		intNumJTextField = new JTextField(4);
		
		wageJLabel = new JLabel("程序员每月工资：");
		wageJTextField = new JTextField(6);
		
		workdaysForAMonthJLabel = new JLabel("每月工作天数：");
		workdaysForAMonthField = new JTextField(4);
		
		
		memerySizeCacul = new JButton();
		memeryPriceCacul = new JButton();
		allPriceCacul = new JButton();
		
		memerySizeNeedResult = new JLabel();
		memeryPriceResult = new JLabel();
		allPriceResult = new JLabel();
		
		memerySizeCacul.setText("存储大小需求计算");
		memeryPriceCacul.setText("存储器价格计算");
		allPriceCacul.setText("成本计算");
		yearJLabel.setText("时间（年）：");
		
		memerySizeNeedResult.setPreferredSize(new Dimension(140, 20));
		memeryPriceResult.setPreferredSize(new Dimension(140,20));
		
		this.add(yearJLabel);
		this.add(yearJTextField);
		
		this.add(memerySizeCacul);
		this.add(memerySizeNeedResult);
		
		this.add(wordLengthJLabel);
		this.add(wordLenJTextField);
		
		this.add(memeryPriceCacul);
		this.add(memeryPriceResult);
		
		this.add(intNumJLabel);
		this.add(intNumJTextField);
		
		this.add(wageJLabel);
		this.add(wageJTextField);
		
		this.add(workdaysForAMonthJLabel);
		this.add(workdaysForAMonthField);
		
		
		this.add(allPriceCacul);
		this.add(allPriceResult);
	}
	
	private void setListener() {
		memerySizeCacul.addActionListener(this);
		memeryPriceCacul.addActionListener(this);
		allPriceCacul.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int year = Integer.parseInt(yearJTextField.getText().trim());
		DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
		switch (e.getActionCommand()) {
		case "存储大小需求计算":
			if(yearJTextField.getText()==null||yearJTextField.getText().trim().equals("")) {
				memerySizeNeedResult.setText("年限为空！！！");
				break;
			}
			int mSize = (int) Math.ceil((Function.getNeedMemerySize(year)/(1024)));
			if(mSize/1024>=1) {
				
				memerySizeNeedResult.setText("Size : 约" + String.valueOf(df.format(mSize*1.0/1024)) + " M字");
			}else {
				memerySizeNeedResult.setText("Size : 约" + String.valueOf(mSize) + " K字");
			}
			break;
		case "存储器价格计算":
			if(yearJTextField.getText().trim()==""||wordLenJTextField.getText().trim()=="") {
				memeryPriceResult.setText("有信息为空！");
				break;
			}
			int len = Integer.parseInt(wordLenJTextField.getText().trim()); 
			memeryPriceResult.setText("价格约："+String.valueOf(df.format(Function.getMemeryPrice(year, len)))+"美元");
			break;
		case "成本计算":
			if(yearJTextField.getText().trim()==""||workdaysForAMonthField.getText().trim()==""||
			intNumJTextField.getText().trim()==""||wageJTextField.getText().trim()=="") {
				memeryPriceResult.setText("有信息为空！");
				break;
			}
			int num = Integer.parseInt(intNumJTextField.getText().trim());
			int days = Integer.parseInt(workdaysForAMonthField.getText().trim());
			int wage = Integer.parseInt(wageJTextField.getText().trim());
			allPriceResult.setText("总成本约为："+String.valueOf(df.format(Function.getAllPrice(year, num, wage, days)))+"美元");
			break;
		default:
			break;
		}
	}
}

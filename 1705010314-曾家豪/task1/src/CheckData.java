package project01;

import javax.swing.JOptionPane;

public class CheckData {
	public CheckData() {
	}
	
	public boolean check(String s) {
		//判断数字是否合法
		if (s.equals("")) {
			JOptionPane.showMessageDialog(null, "不能为空，请输入合法数字", "提示", JOptionPane.ERROR_MESSAGE);
			return false;
		} 
		else {
			try {
				double d = Double.parseDouble(s);
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "输入的数字中含有非法字符，请输入合法数字", "数据错误", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}
		return true;
	}
}
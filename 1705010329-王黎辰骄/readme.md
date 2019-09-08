#开发工具
eclipse

#语言
Java

#运行环境
Microsoft Windows7以上

#功能描述
* 输入年份点击计算容量按钮，即可显示储存容量
* 输入字长和年份，点击存储器，即可查看存储器价格
* 输入年份、指令、月均工资点击成本价格按钮即可查看成本价格

#核心代码
##main.java

```
import java.math.*;
import java.util.Arrays;

import javax.swing.JTextField;

public class function  {
static double e = Math.E;
 public static double money(double year,double B){
	 { if(B>15.9999&&B<16.00001) {
		return (0.048  *  Math.pow(0.72,year-1974.0) *need(year));
	   }
	    else
	    {
	    return (0.3*Math.pow(0.72,year-1974.0)*need(year)/B);
	    }
	 }
 }
 public static double need(double year) {
	 return (4080*Math.pow(e,0.28*(year-1960.0)));
 }
 public static double cost(double z,double g,double year) {
	 return need(year)/(z*20)*g; 
 }
 
}

```

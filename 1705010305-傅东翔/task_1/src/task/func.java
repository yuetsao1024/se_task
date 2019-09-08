package task;

public class func {	
	double mem;//存储器容量
	double e = Math.E;
	
	//计算机存储容量需求估算
	public String memory(int year) {
		mem = 4080 * (Math.pow(e, (0.28*(year-1960))));
		return String.format("%.3f", mem);
	}
	
	//存储器价格估算
	public String price(int year, int bit) { //bit--计算机字长位数
		double memoryPrice;
		mem = 4080 * (Math.pow(e, (0.28*(year-1960))));
		memoryPrice = 0.3 * (Math.pow(0.72, (year-1974))) * mem * bit * 0.01;
		return String.format("%.3f", memoryPrice);
	}
	
	//程序装满存储器所需成本估算
	public String cost(int year, int daily, int salary) { //daily--程序员每日开发指令数（默认一条指令一个字长）， salary--程序员月工资
		double cost;//所需成本
		mem = 4080 * (Math.pow(e, (0.28*(year-1960))));
		cost = ((mem/daily)/30) * salary;
		return String.format("%.3f", cost);
	}
}

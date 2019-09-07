package se.task1;

public class Function {
	
	public static double getNeedMemerySize(int year) {
		double memerySize;
		memerySize = 4080*Math.pow(Math.E, 0.28*(year-1960));
		System.out.println("NeedMemerySize : "+memerySize);
//		return Math.ceil(memerySize);
		return memerySize;
	}
	
	public static double getMemeryPrice(int year,int wordLen) {
		double result;
		if(wordLen == 16) {
			result = 0.048*Math.pow(0.72, (year-1974))*getNeedMemerySize(year);
		}else {
			result = 0.003*wordLen*Math.pow(0.72, (year-1974))*getNeedMemerySize(year);
		}
		return result;
	}
	
	public static double getAllPrice(int year,int num,int wage,int days) {
		return getNeedMemerySize(year)/(num*days)*wage;
	}
}

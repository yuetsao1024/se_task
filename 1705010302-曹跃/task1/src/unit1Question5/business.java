package unit1Question5;

public class business {
	static int ws;
	static int y;
	public business(int y,int ws) {
		this.ws=ws;
		this.y=y;
	}
	public static double functionM() {		
		return 4080*Math.pow(Math.E, 0.28*(y-1960));
	}
	public static double functionP1() {		
		return 0.3*Math.pow(0.72, y-1974);
	}
	public static double functionP2() {		
		return 0.048*Math.pow(0.72, y-1974);
	}
	public static double functionP() {	
		if(ws==16)
			return functionP2()*functionM();
		else
			return ws*functionP1()/100*functionM();
	}
	public static double functionCost(double salary,int number) {
		return functionM()/(number*20)*salary;
	}
}

package project01;

public class Calculate {

	public static double[] cal(double data1, double data2, double data3, String op) {
		// TODO Auto-generated method stub
		double[] rel=new double[5];
		double temp, P = 0;
		rel[0] = 4080*Math.pow(Math.E,0.28*(data1 - 1960));
		switch (op) {
			case "16λ":
				P = 0.048*Math.pow(0.72, data1-1974);
				break;
			case "32λ":
				P = 0.3*Math.pow(0.72, data1-1974);
				break;
			default:
				break;
		}
		rel[1] = rel[0]*P;
		temp = rel[0]/(20*data2);
		rel[2] = ((int)temp)*data3;
		return rel;
	}

}
package com.homeWork;
public class Business {
	View view;
	 double M;
	double cost;
	double price;int Y;int lenth;int salary;int mount;
	public Business(int Y,int lenth,int salary,int mount){
		this.Y = Y;
		this.lenth = lenth;
		this.salary = salary;
		this.mount = mount;
	}
	public void count(){
		view = new View();
		M = 4080*Math.pow(Math.E, 0.28*(Y-1960));
		price = M*lenth*0.003*Math.pow(0.72, Y-1974);
		cost = M/mount/30*salary;
	}
	public void outPut(){
		
	}
}

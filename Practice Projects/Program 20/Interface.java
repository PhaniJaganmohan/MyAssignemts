package com.jagan.learning;

public class Interface implements SalaryShape{
	
	int totalsalary = 3000;
	
	public void show(){
		System.out.println("inside show");
	}

	

	@Override
	public void shape() {
		System.out.println("inside shape");	
	}
	
	public static void main(String args[]){
		Interface obj = new Interface();
		obj.shape();
		obj.show();
		
		
		SalaryShape ref = new Interface();
		System.out.println("My salary "+ref.mysalary);
		
		System.out.println("Total salary  "+ obj.totalsalary);		
	}
}



interface SalaryShape{
	int mysalary = 2000;
	void shape(); 
	void show();
}

interface Demo extends SalaryShape{	
}
	
	
package Calc;

abstract class Calc{
	
	public abstract void choice(int choice, double x, double y);
	public abstract double getRes();
	
}

abstract class operate{
	
	abstract double addition(double x, double y);
	abstract double substraction(double x, double y);
	abstract double multiplication(double x, double y);
	abstract double division(double x, double y);
	
}

public class Calculation extends Calc{
	private double z;
	private double result;
	
	public void choice(int choice, double x, double y){
		z = choice;
		
		operation solve = new operation();
		
		if(z==1){
			result = solve.addition(x,y);
		}
		else if(z==2){
			result = solve.substraction(x,y);
		}
		else if(z==3){
			result = solve.multiplication(x,y);
		}
		else if(z==4){
			result = solve.division(x,y);
		}
	}
	
	public double getRes(){
		return result;
	}
}

class operation extends operate{
	
	double addition(double x, double y){
		return x + y;
	}
	double substraction(double x, double y){
		return x - y;
	}
	double multiplication(double x, double y){
		return x * y;
	}
	double division(double x, double y){
		return x / y;
	}
}
package Conv;
import Menu.menu;

abstract class main1 extends main{
	
	public abstract void setNum(double x);
	public abstract double getNum();
	public abstract void Hello();
}
public class Conversion extends main1{
	private double num;
	private double result;
	
	public void setNum(double x){
			this.num = x;
	}
	public double getNum(){
			return num;
	}
	public void Hello(){
		System.out.println("hai");
		print(1,"23123");
	}
}
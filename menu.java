package Menu;
import java.util.Scanner;

abstract class main{
	
	public void menu1(){
		
	}
	public void print(int x,String words){//print strings out more easily
		if(x == 1){
			System.out.print(words);
		}
		else if (x == 2){
			System.out.println(words);
		}
	}
}
abstract class main2{	

	abstract public void menuCalc();
	abstract public void menuConv();
	
}

public class menu extends main{
	public void menu1(){
		
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		print(2,"");
		print(2,"*\t Unit Conversion and Calculator \t*");
		print(2,"*\t       V1.0 by Jajal inc.       \t*");
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		print(2,"");
		print(2,"*\t Choose your desired function : \t*");
		print(2,"*\t\t\t\t\t\t*");
		print(2,"*\t     Unit Conversion(1)         \t*");
		print(2,"*\t       Calculator(2)            \t*");
		print(2,"*\t        About Us(3)             \t*");
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
	}
	
}

class menu2 extends main{
	public void menuCalc(){
		
		for(int i= 0; i<= 20; i++){
			print(2,"");
		}
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		print(2,"");
		print(2,"Choose an operation : ");
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		print(2,"");
		print(2,"* 1) Addition  \t\t\t\t\t*");
		print(2,"* 2) Subtraction \t\t\t\t*");
		print(2,"* 3) Multiplication \t\t\t\t*");
		print(2,"* 4) Division \t\t\t\t\t*");
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		
	}
	public void menuConv(){
		
		for(int i= 0; i<= 20; i++){
			print(2,"");
		}
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		print(2,"");
		print(2, "Select unit you want to convert");
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
		print(2,"");
		print(2, "*  1)cm --> metre \t\t\t\t*");
		print(2, "*  2)metre --> cm \t\t\t\t*");
		print(2, "*  3)mililitre --> litre \t\t\t*");
		print(2, "*  4)litre --> mililitre \t\t\t*");
		print(2, "*  5)cm --> mm \t\t\t\t\t*");
		print(2, "*  6)mm --> cm \t\t\t\t\t*");
		print(2, "*  7)m2 --> cm2 \t\t\t\t*");
		print(2, "*  8)cm2 --> m2 \t\t\t\t*");
		for(int i= 0; i<= 48; i++){
			print(1,"*");
		}
	}
}
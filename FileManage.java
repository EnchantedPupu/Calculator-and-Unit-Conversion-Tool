package Calc;
import java.io.*;
import java.util.StringTokenizer;
import Calc.Calculation;

//abstract class containing user credentials that inherited by both register and login class
abstract class Outline{
	protected String Username;
	protected String Password;
	
	//mutator for the variable
	public void setValue(String username, String password){
		this.Username = username;
		this.Password = password;
	}
	//both is getter for later processing
	public String getUsername(){
		return Username;
	}
	
	public String getPassword(){
		return Password;
	}
}

//accept value for name and password thus creating new file if not-exist yet then make new line contains username and password
class Register extends Outline{
	
	public Register(String username, String password){
		setValue(username,password);
	}
	
	//write to a file
	public void newLog()throws IOException{
		//write into file and check if file exist or not
		FileWriter fw = new FileWriter("loginInfo.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter write = new PrintWriter(bw);
		
		write.println(getUsername() + ":" + getPassword());
		write.close();
		
		Calculation calculator = new Calculation();
		calculator.menu1();
	}
}

class Login extends Outline{
	//login class
	public Login(String username, String password){
		setValue(username,password);
	}
	
	//check if user inputted credentials is available and log the user
	public void checkLog()throws IOException{
		File check = new File("loginInfo.txt");
		
		FileReader fr = new FileReader(check);
		BufferedReader br = new BufferedReader(fr);
		
		String creds = br.readLine();
		String user;
		String pass;
		boolean loggedin = false;
		
		//loop to check if lines in the text file containing matched info
		while(creds != null){
			StringTokenizer st = new StringTokenizer(creds, ":");
			user = st.nextToken();
			pass = st.nextToken();
			
			if(getUsername().equals(user) && getPassword().equals(pass)){
				System.out.println("Welcome! , " + getUsername());
				loggedin = true;
				Calculation calculator = new Calculation();
				calculator.menu1();
			}
			
			creds = br.readLine();
		}
		if(loggedin== false){
			System.out.println("Error logging(wrong username/password) please rerun the program--");
		}
	}
}

//class that refer to both login and register classes
public class FileManage{
	private boolean Reg;
	//main class that submerge two subclasses above
	public FileManage(String username, String password, boolean x){
		this.Reg = x;
		
		if(Reg == true){
			Register reg = new Register(username,password);
			
			try{
				reg.newLog();
			}
			catch(Exception E){}
		}
		else{
			Login login = new Login(username, password);
			try{
				login.checkLog();
			}
			catch(Exception E){}
		}
	}
	
}
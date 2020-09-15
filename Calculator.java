import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Calc.Calculation;
import Calc.FileManage;


//NIELS EVANT ROBORT
//2019244488

//MAIN CLASS TO RUN THE PROGRAMM
public class Calculator{
	
	public void setValue(String user, String pass, boolean method){
		FileManage file = new FileManage(user,pass,method);
	}
	
	public static void main(String[] args){
		
		MainLogin menu1 = new MainLogin();
		menu1.menu();
		
	}
}

//The first interface which allows user to register or login and then listen for any event clicked by the user
class MainLogin extends Calculator implements ActionListener{
	
	private JLabel title;
	private JLabel version;
	private JLabel user;
	private JLabel pass;
	private JTextField userText;
	private JPasswordField userPass;
	private JButton Login;
	private JButton Register;
	private JLabel test;
	
	//declaring JLabel and JFrame objects outside of menu() so that can be accessed later
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	
	public void menu(){
		//set the windows size
		frame.setSize(490, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		title = new JLabel("Private Calculator and Unit Conversion");
		title.setBounds(140, 50, 250, 50);
		panel.add(title);
		
		version = new JLabel("  V1.0 designed for Sir Hadi");
		version.setBounds(160, 80, 200, 15);
		panel.add(version);
		
		user = new JLabel("Username");
		user.setBounds(100, 100, 80, 25);
		panel.add(user);
		
		pass = new JLabel("Password");
		pass.setBounds(100,120, 80, 25);
		panel.add(pass);
		
		userText = new JTextField();
		userText.setBounds(180, 100 ,165,25);
		panel.add(userText);
		
		userPass = new JPasswordField();
		userPass.setBounds(180, 120, 165, 25);
		panel.add(userPass);
		
		Login = new JButton("Login");
		Login.setBounds(102, 150, 120, 25);
		Login.addActionListener(this);
		panel.add(Login);
		
		Register = new JButton("Register");
		Register.setBounds(222, 150, 120, 25);
		Register.addActionListener(this);
		panel.add(Register);
		
		test = new JLabel("");
		test.setBounds(10, 180, 80, 25);
		panel.add(test);
		
		frame.setVisible(true);
	}
	
	//open windows for the next frame which is the calculator
	public void newCalc(){
		frame.remove(panel);
		Calculation calculate = new Calculation();
		calculate.menu1();
		frame.add(calculate.menuCalc);
		frame.setVisible(true);
	}
	
	//option to hide or show the panel after opening new window
	public void showPanel(boolean show){
		panel.setVisible(show);
	}
	
	//listen for any event from the user and process it to a certain 
	@Override
	public void actionPerformed(ActionEvent e){
		String pw = new String(userPass.getPassword());
		if(e.getSource() == Login){
			showPanel(false);
			setValue(userText.getText(), new String(userPass.getPassword()), false);
		}
		else if(e.getSource() == Register){
			System.out.println("Registering...");
			showPanel(false);
			setValue(userText.getText(), new String(userPass.getPassword()), true);
		}
	}
	
}
	


package Calc;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import Calc.Conversion;

//class for the calculator
public class Calculation implements ActionListener{
	public JPanel menuCalc = new JPanel();
	private JLabel notimessage;
	private JTextField textarea;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMul,bDiv,bClr,bEq,change;
	private boolean operate,cantype;
	JFrame frame = new JFrame();
	
	//menu for showing the gui of the calculator
	public void menu1(){
		
		menuCalc.setLayout(null);
		
		frame.setSize(490, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(menuCalc);
		
		notimessage = new JLabel("Only two variable operation available at a time--");
		notimessage.setBounds(0,0,300,20);
		menuCalc.add(notimessage);
		
		textarea = new JTextField("");
		textarea.setBounds(8,17,462,90);
		textarea.setEditable(false);
		menuCalc.add(textarea);
		
		change = new JButton("Go to conversion");
		change.setBounds(300,0,150,18);
		change.addActionListener(this);
		menuCalc.add(change);
		
		b7 = new JButton("7");
		b7.setBounds(5,120,90,35);
		b7.addActionListener(this);
		menuCalc.add(b7);
		
		b4 = new JButton("4");
		b4.setBounds(5,160,90,35);
		b4.addActionListener(this);
		menuCalc.add(b4);
		
		b1 = new JButton("1");
		b1.setBounds(5,200,90,35);
		b1.addActionListener(this);
		menuCalc.add(b1);
		
		b8 = new JButton("8");
		b8.setBounds(100,120,90,35);
		b8.addActionListener(this);
		menuCalc.add(b8);
		
		b5 = new JButton("5");
		b5.setBounds(100,160,90,35);
		b5.addActionListener(this);
		menuCalc.add(b5);
		
		b2 = new JButton("2");
		b2.setBounds(100,200,90,35);
		b2.addActionListener(this);
		menuCalc.add(b2);
		
		b9 = new JButton("9");
		b9.setBounds(195,120,90,35);
		b9.addActionListener(this);
		menuCalc.add(b9);
		
		b6 = new JButton("6");
		b6.setBounds(195,160,90,35);
		b6.addActionListener(this);
		menuCalc.add(b6);
		
		b3 = new JButton("3");
		b3.setBounds(195,200,90,35);
		b3.addActionListener(this);
		menuCalc.add(b3);
		
		bClr = new JButton("CLR");
		bClr.setBounds(195,240,90,35);
		bClr.addActionListener(this);
		menuCalc.add(bClr);
		
		b0 = new JButton("0");
		b0.setBounds(5,240,185,35);
		b0.addActionListener(this);
		menuCalc.add(b0);
		
		bAdd = new JButton("+");
		bAdd.setBounds(290,120,90,48);
		bAdd.addActionListener(this);
		menuCalc.add(bAdd);
		
		bSub = new JButton("-");
		bSub.setBounds(290,173,90,48);
		bSub.addActionListener(this);
		menuCalc.add(bSub);
		
		bMul = new JButton("x");
		bMul.setBounds(290,226,90,48);
		bMul.addActionListener(this);
		menuCalc.add(bMul);
		
		bDiv = new JButton("/");
		bDiv.setBounds(380,120,90,101);
		bDiv.addActionListener(this);
		menuCalc.add(bDiv);
		
		bEq = new JButton("=");
		bEq.setBounds(380,226,90,48);
		bEq.addActionListener(this);
		menuCalc.add(bEq);
		
		frame.setVisible(true);
	}
	
	public void newConversion(){
		frame.remove(menuCalc);
		Conversion conv = new Conversion();
		conv.Conv();
		frame.add(conv.menuConv);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		//check for any event by the user and add the suggested number to the textarea variable
		String data = textarea.getText();
		if(cantype == false){
			data = "";
			cantype = true;
		}
		String newData = data;
		String result = "";
		if(e.getSource() == b0){
			newData = newData + "0";
			textarea.setText(newData);
		}
		else if(e.getSource() == b1){
			newData = newData + "1";
			textarea.setText(newData);
		}
		else if(e.getSource() == b2){
			newData = newData + "2";
			textarea.setText(newData);
		}
		else if(e.getSource() == b3){
			newData = newData + "3";
			textarea.setText(newData);
		}
		else if(e.getSource() == b4){
			newData = newData + "4";
			textarea.setText(newData);
		}
		else if(e.getSource() == b5){
			newData = newData + "5";
			textarea.setText(newData);
		}
		else if(e.getSource() == b6){
			newData = newData + "6";
			textarea.setText(newData);
		}
		else if(e.getSource() == b7){
			newData = newData + "7";
			textarea.setText(newData);
		}
		else if(e.getSource() == b8){
			newData = newData + "8";
			textarea.setText(newData);
		}
		else if(e.getSource() == b9){
			newData = newData + "9";
			textarea.setText(newData);
		}
		else if(e.getSource() == bAdd){
			if(operate == false){
				newData = newData + " + ";
				textarea.setText(newData);
				operate = true;
			}
			else{
				result = process(newData);
				newData = newData + " = " + result;
				textarea.setText(newData);
				operate = false;
				cantype = false;
			}
		}
		else if(e.getSource() == bMul){
			if(operate == false){
				newData = newData + " * ";
				textarea.setText(newData);
				operate = true;

			}
			else{
				result = process(newData);
				newData = newData + " = " + result;
				textarea.setText(newData);
				operate = false;
				cantype = false;
			}
		}
		else if(e.getSource() == bDiv){
			if(operate == false){
				newData = newData + " / ";
				textarea.setText(newData);
				operate = true;
			}
			else{
				result = process(newData);
				newData = newData + " = " + result;
				textarea.setText(newData);
				operate = false;
				cantype = false;
			}
		}
		else if(e.getSource() == bSub){
			if(operate == false){
				newData = newData + " - ";
				textarea.setText(newData);
				operate = true;
				
			}
			else{
				result = process(newData);
				newData = newData + " = " + result;
				textarea.setText(newData);
				operate = false;
				cantype = false;
			}
		}
		else if(e.getSource() == bClr){
			textarea.setText("");
		}
		else if(e.getSource() == bEq){
			operate = false;
			cantype = false;
			result = process(newData);
			newData = newData + " = " + result;
			textarea.setText(newData);
		}
		else if(e.getSource() == change){
			newConversion();
			//go to the conversion menu
		}
	}
	
	public String process(String x){
		//processing class to take the operation in textarea above and separate it into double by StringTokenizer
		double z,y;
		String res = "";
		//determine whether the String tokenizer recognize any operation stated
		if(x.indexOf('*') != -1){
			StringTokenizer st = new StringTokenizer(x, "*");
			z = Integer.parseInt(st.nextToken().trim());
			y = Integer.parseInt(st.nextToken().trim());
			System.out.println(z);
			res =Double.toString(z * y);
			System.out.println(z);
		}
			
		else if(x.indexOf('/') != -1){
			StringTokenizer st = new StringTokenizer(x, "/");
			z = Integer.parseInt(st.nextToken().trim());
			y = Integer.parseInt(st.nextToken().trim());
			System.out.println(z);
			res =Double.toString(z / y);
			System.out.println(z);
		}
		else if(x.indexOf('+') != -1){
			StringTokenizer st = new StringTokenizer(x, "+");
			z = Integer.parseInt(st.nextToken().trim());
			y = Integer.parseInt(st.nextToken().trim());
			System.out.println(z);
			res =Double.toString(z + y);
			System.out.println(z);
		}
		else if(x.indexOf('-') != -1){
			StringTokenizer st = new StringTokenizer(x, "-");
			z = Integer.parseInt(st.nextToken().trim());
			y = Integer.parseInt(st.nextToken().trim());
			System.out.println(z);
			res =Double.toString(z - y);
			System.out.println(z);
		}
		//return the value of the final calculation in a string form
		return res;
	}
}
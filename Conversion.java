package Calc;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class Conversion implements ActionListener{
	
	JPanel menuConv = new JPanel();
	private JRadioButton KMToM,MtoKM,CMtoM,MtoCM,MMtoCM,KGtoG,GtoKG;
	private JTextField input,output;
	private JButton convert;
	
	//menu for the conversion gui
	public void Conv(){
		
		menuConv.setLayout(null);
		
		JLabel noti1 = new JLabel("INPUT");
		noti1.setBounds(45,90,50,20);
		menuConv.add(noti1);
		
		JLabel noti2 = new JLabel("OUTPUT");
		noti2.setBounds(380,90,80,20);
		menuConv.add(noti2);
		
		input = new JTextField("");
		input.setBounds(8,110,120,30);
		menuConv.add(input);
		
		output = new JTextField("");
		output.setBounds(343,110,120,30);
		menuConv.add(output);
		
		KMToM = new JRadioButton("Kilometer to meter");
		KMToM.setBounds(170,40,150,20);
		menuConv.add(KMToM);
		
		MtoKM = new JRadioButton("Meter to Kilometer");
		MtoKM.setBounds(170,70,150,20);
		menuConv.add(MtoKM);
		
		CMtoM = new JRadioButton("Centimeter to meter");
		CMtoM.setBounds(170,100,150,20);
		menuConv.add(CMtoM);
		
		MtoCM = new JRadioButton("Meter to Centimeter");
		MtoCM.setBounds(170,130,150,20);
		menuConv.add(MtoCM);
		
		MMtoCM = new JRadioButton("Milimeter to Centimeter");
		MMtoCM.setBounds(170,160,150,20);
		menuConv.add(MMtoCM);
		
		KGtoG = new JRadioButton("Kilogram to Gram");
		KGtoG.setBounds(170,190,150,20);
		menuConv.add(KGtoG);
		
		GtoKG = new JRadioButton("Gram to Kilogram");
		GtoKG.setBounds(170,220,150,20);
		menuConv.add(GtoKG);
		
		convert= new JButton("Convert");
		convert.setBounds(180,240,120,25);
		convert.addActionListener(this);
		menuConv.add(convert);
		
		JLabel notimessage = new JLabel("Simple Unit Conversion");
		notimessage.setBounds(180,0,300,20);
		menuConv.add(notimessage);
	}
	
	//listen for any event by the user
	@Override
	public void actionPerformed(ActionEvent e){
		Double val = Double.parseDouble(input.getText());
		Double res;

		if(KMToM.isSelected()){
			res = val * 1000;
			output.setText(Double.toString(res) + "Meter");
		}
		if(MtoKM.isSelected()){
			res = val / 1000;
			output.setText(Double.toString(res) + "Kilometer");
		}
		if(CMtoM.isSelected()){
			res = val / 100;
			output.setText(Double.toString(res) + "meter");
		}
		if(MtoCM.isSelected()){
			res = val * 100;
			output.setText(Double.toString(res) + "Centimeter");
		}
		if(MMtoCM.isSelected()){
			res = val * 0.1;
			output.setText(Double.toString(res) + "Centimeter");
		}
		if(KGtoG.isSelected()){
			res = val * 1000;
			output.setText(Double.toString(res) + "Gram");
		}
		if(GtoKG.isSelected()){
			res = val / 1000;
			output.setText(Double.toString(res) + "Kilogram");
		}
	}
}
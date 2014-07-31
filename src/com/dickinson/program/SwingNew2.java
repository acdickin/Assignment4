package com.dickinson.program;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingNew2 {
	
	
	private JFrame frame;
	private JPanel panel;
	

	private JLabel lblUnitSize;
	private JTextField txtUnitSize;
	private JLabel lblCalories;
	private JTextField txtCalories;
	private JLabel lblFat;
	private JTextField txtFat;
	private JLabel lblProtein;
	private JTextField txtProtein;
	private JLabel lblCarbs;
	private JTextField txtCarbs;
	
	private JButton btnAdd;
	
	private final int OFFSETX=300;
	private final int OFFSETY=300;
	private final int x=200;
	private final int y=200;
	
public SwingNew2(){

		CreateFrame();
}

private void CreateFrame(){
	frame = new JFrame();
	frame.add(CreatePanel());
	frame.setTitle("Ingrediants");
	frame.setBounds(OFFSETX,OFFSETY,x,y);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
private JPanel CreatePanel(){
	panel= new JPanel();
	panel.setLayout(new GridLayout(2,4,5,5));
	
			
	lblUnitSize=new JLabel("Unit Size:") ;
	txtUnitSize=new JTextField();
	lblCalories=new JLabel("Calories:") ;
	txtCalories=new JTextField();
	lblFat=new JLabel("Fat:");
	txtFat=new JTextField() ;
	lblProtein= new JLabel("Protein:");
	txtProtein =new JTextField();
	lblCarbs=new JLabel("Carbs:") ;
	txtCarbs=new JTextField();
	

	
	btnAdd=new JButton("Add Ingrediant");
	btnAdd.addActionListener(new SubmitListener());
	

	panel.add(lblUnitSize);
	panel.add(txtUnitSize);
	panel.add(lblCalories);
	panel.add(txtCalories);
	panel.add(lblFat);
	panel.add(txtFat);
	panel.add(lblProtein);
	panel.add(txtProtein );
	panel.add(lblCarbs);
	panel.add(txtCarbs);
	panel.add(btnAdd,BorderLayout.SOUTH);
	return panel;

}



private class SubmitListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try{
			SwingNew s=new SwingNew();
			String name=s.IngName();
			String u= txtUnitSize.getText();
			double	cal= Double.parseDouble(txtCalories.getText());	
			double	f= Double.parseDouble(txtFat.getText());	
			double	p= Double.parseDouble(txtProtein.getText());
			double	car= Double.parseDouble(txtCarbs.getText());
			
			Ingredient i=new Ingredient(u,cal,f,p,car);
			i.setName(name);
			Recipe r= new Recipe();
			String rec =s.RecName();
			r.addIngredient(i);
			r.setName(rec);
		}
		
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"not a Valid Number","invalid Number",0);
			txtUnitSize.setText("");
			txtCalories.setText("");
			txtFat.setText("");
			txtProtein.setText("");
			txtCarbs.setText("");
			txtUnitSize.grabFocus();
		}
}
}
}
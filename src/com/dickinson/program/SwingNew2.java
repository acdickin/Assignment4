package com.dickinson.program;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private JLabel lblIng;
	private JTextField txtIng;
	private JButton btnAdd;
	private JButton btnSubmit;
	private JLabel lblRecipe;
	private JTextField txtRecipe;
	private JLabel lblIns;
	private JTextField txtIns;
	
	private final int OFFSETX=300;
	private final int OFFSETY=300;
	private final int x=800;
	private final int y=100;
	double	cal;	
	double	f;	
	double	p;
	double	car;
	String u;
	//class variables
	Recipe r;
	SwingNew s ;
	RecipeBook rb; 
	private ArrayList<item> ingredients;
	
public SwingNew2(){
	rb= new RecipeBook();
	r= new Recipe();
	s= new SwingNew();
ingredients=new ArrayList<item>();
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
	
	
	lblRecipe=new JLabel("Recipe Name:");
	txtRecipe=new JTextField();
	lblIns=new JLabel("Instructions:");
	txtIns=new JTextField();
	lblIng=new JLabel("Enter Ingrediants:");
	txtIng=new JTextField();	
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

	panel.add(lblRecipe);
	panel.add(txtRecipe);
	panel.add(lblIns);
	panel.add(txtIns);
	btnAdd=new JButton("Add Ingrediant");
	btnAdd.addActionListener(new addListener());
	btnSubmit= new JButton("Add Receipe");
	btnSubmit.addActionListener(new SubmitListener());
	panel.add(lblRecipe);
	panel.add(txtRecipe);
	panel.add(lblIns);
	panel.add(txtIns);
	panel.add(lblIng);
	panel.add(txtIng);
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
	panel.add(btnSubmit,BorderLayout.SOUTH);
	return panel;

}


private class addListener implements ActionListener{
	public void actionPerformed(ActionEvent arg0){
	try{
		
		String name=txtIng.getText();
		u= txtUnitSize.getText();
		cal= Double.parseDouble(txtCalories.getText());	
		f= Double.parseDouble(txtFat.getText());	
		p= Double.parseDouble(txtProtein.getText());
		car= Double.parseDouble(txtCarbs.getText());
		Ingredient i=new Ingredient(u,cal,f,p,car);
		i.setName(name);
		
		ingredients.add(i);
		txtUnitSize.setText("");
		txtIng.setText("");
		txtCalories.setText("");
		txtFat.setText("");
		txtProtein.setText("");
		txtCarbs.setText("");
		
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

private class SubmitListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
			String	rec= txtRecipe.getText();	
			String	instructions= txtIns.getText();
			r.setName(rec);
			r.setInstructions(instructions);
			for(item i: ingredients){
				Ingredient ingredient = (Ingredient)i;
				r.addItem(ingredient);
			}
			rb.addItem(r);
			frame.dispose();
	}
	}

}



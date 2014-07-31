package com.dickinson.program;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingNew {
	
	private JLabel lblSearch;
	private JTextField txtSearch;
	private JButton btnSearch;
	private JTextArea txaSearch;
	private JFrame frame;
	private JPanel panel;
	private JLabel lblRecipe;
	private JTextField txtRecipe;
	private JLabel lblIng;
	private JTextField txtIng;
	private JLabel lblIns;
	private JTextField txtIns;
	private JButton btnIng;
	private JButton btnSubmit;
	
	private final int OFFSETX=200;
	private final int OFFSETY=300;
	private final int x=420;
	private final int y=420;
public SwingNew(){

		CreateFrame();
}


private void CreateFrame(){
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Recipe Book");
	frame.setBounds(OFFSETX,OFFSETY,x,y);
	frame.add(CreatePanel());
	frame.setVisible(true);
	 }
private JPanel CreatePanel(){
	panel= new JPanel();
	panel.setLayout(new GridLayout(3,3,5,5));
	
	
	lblSearch=new JLabel("Search:");
	txtSearch=new JTextField();
	 btnSearch= new JButton("Search for Recipe");
	 btnSearch.addActionListener(new SearchListener());
	txaSearch= new JTextArea("Results");
	
	
	lblRecipe=new JLabel("Recipe Name:");
	txtRecipe=new JTextField();
	lblIng=new JLabel("Enter Ingrediants:");
	txtIng=new JTextField();
	btnIng= new JButton("add ingrediant");
	btnIng.addActionListener(new IngListener());
	lblIns=new JLabel("Instructions:");
	txtIns=new JTextField();
	btnSubmit=new JButton("Add to Recipe book");
	btnSubmit.addActionListener(new SubmitListener());
	
	
	panel.add(lblSearch,BorderLayout.WEST);
	panel.add(txtSearch,BorderLayout.WEST);
	panel.add(btnSearch,BorderLayout.WEST);
	panel.add(txaSearch,BorderLayout.WEST);
	//,BorderLayout.EAST
	panel.add(lblRecipe);
	panel.add(txtRecipe);
	panel.add(lblIng);
	panel.add(txtIng);
	panel.add(btnIng);
	panel.add(lblIns);
	panel.add(txtIns);
	
	panel. add(btnSubmit,BorderLayout.SOUTH);
	return panel;

}

public String IngName(){
	
	String Ing=txtIng.getText();
	return Ing;
}
public String RecName(){
	
	String rec=txtRecipe.getText();
	return rec;
}

private class IngListener implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		new SwingNew2();
}
}

private class SearchListener implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		   
}
}



private class SubmitListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	
	
		try{
			
			
			
			String	cal= txtRecipe.getText();	
			String	f= txtIng.getText();	
			String	p= txtIns.getText();
			RecipeBook rB= new RecipeBook();
			
			rB.addReceipe();
			
		}


	
		}
		catch(NumberFormatException e){
		
		}
	}
}
}

package com.dickinson.program;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private JButton btnReceipe;
	private JFrame frame;
	private JPanel panel;
	


	
	private final int OFFSETX=200;
	private final int OFFSETY=300;
	private final int x=500;
	private final int y=400;
	RecipeBook rb; 
	
public SwingNew(){

	 rb= new RecipeBook(); 
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
	panel.setLayout(new GridLayout(4,5,5,5));
	
	lblSearch=new JLabel("Search:");
	txtSearch=new JTextField();
	 btnSearch= new JButton("Search for Recipe");
	 btnSearch.addActionListener(new SearchListener());
	txaSearch= new JTextArea("Results");
	btnReceipe=new JButton("Add A recipe");
	btnReceipe.addActionListener(new IngListener());

	
	
	panel.add(lblSearch);
	panel.add(txtSearch);
	panel.add(btnSearch);
	panel.add(txaSearch);
	panel.add(btnReceipe);
	//,BorderLayout.EAST

	
	
	return panel;

}


private class IngListener implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		new SwingNew2();
}
}

private class SearchListener implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		
		String recs=txtSearch.getText();
		if(rb.GetItems() != null){
		
		Recipe thisr=(Recipe)rb.getItem(recs); 
		String ingList=thisr.Fix();
		String inst=thisr.getInstructions();
		txaSearch.setText("Receipe name: "+recs+"\nIngrediants: "+ingList+"\n Instructions:"+inst );
	
	
		
		}
		else{
		txaSearch.setText(recs +" was not found. Try again");	
			
		}
	}
	}
}

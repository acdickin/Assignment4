package com.dickinson.program;
import java.util.ArrayList;
public class Recipe extends item implements ManageItems   {
	
	private ArrayList<item>  ingredients;
	private String instructions;
	public Recipe(){
		 ingredients = new ArrayList<item>();
	}
	public String getInstructions() {
		return instructions;
	}

	void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	@Override
	public void addItem(item i) {
		// TODO Auto-generated method stub
		ingredients.add(i);
	}

	@Override
	public void editItem(item i) {
		for(item it:  ingredients){
			if (it.getName().equals(i.getName())){
				 ingredients.remove(it);
				 ingredients.add((Ingredient)i);
			}
		}
		
	}
	@Override
	public item getItem(String name) {
		item it=null;
		for(item i: ingredients){
			if(i.getName().equals(name)){
				it=i;
			}
		}
		return it;
		}

	@Override
	public void deleteItem(item i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<item> GetItems() {
		return  ingredients;
		}

	public String Fix(){
		String fix="";
		for (item i  :ingredients){
			fix+= i+" ";
		}
		return fix;
	}
	
}


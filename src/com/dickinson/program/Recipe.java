package com.dickinson.program;
import java.util.ArrayList;
public class Recipe extends item implements ManageItems   {
	private ArrayList<Ingredient> ing=new ArrayList<Ingredient>();;
	private String instructions;
	public void addIngredient(Ingredient i) {
		ing.add(i);

	}

	public void deleteIngredient(Ingredient i) {
		for(Ingredient b: ing){
			if (b.getName().equals(b.getName())){
				ing.remove(b);

			}
		}

	}


	public item getIngredient(String name) {
		item it = null;
		for(Ingredient i: ing){
			if (i.getName().equals(name)){
				it=i;
			}
		}
		return it;
	}
	public ArrayList<Ingredient> GetIngredients() {
		
		return ing;
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
		
	}

	@Override
	public void editItem(item i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(item i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public item getItem(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<item> GetItems() {
	
		return null;
	}


	
}


package com.dickinson.program;

import java.util.ArrayList;

public class RecipeBook implements ManageItems{
	private ArrayList<item> recipes=new ArrayList<item>();;

	public void addItem(item i) {
		recipes.add(i);

	}

	@Override
	public void editItem(item i) {
		for(item b: recipes){
			if (b.getName().equals(i.getName())){
				recipes.remove(b);
				recipes.add(i);
			}
		}

	}

	@Override
	public void deleteItem(item i) {
		for(item r:recipes){
			if (r.getName().equals(i.getName())){
				recipes.remove(r);

			}
		}

	}

	@Override
	public item getItem(String name) {
		item it = null;
		for(item r: recipes){
			if (r.getName().equals(name)){
				it=r;
			}
		}
		return it;
	}

	@Override
	public ArrayList<item> GetItems() {

		return recipes;
	}

	

}



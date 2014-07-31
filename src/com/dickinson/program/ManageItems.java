package com.dickinson.program;
import java.util.ArrayList;
public interface ManageItems {
	void addItem(item i);
	void editItem(item i);
	void deleteItem(item i);
	item getItem(String name);
	ArrayList<item> GetItems();

}

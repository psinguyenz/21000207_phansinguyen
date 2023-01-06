package com.iterator;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
  
	public void addItem(String name) {
		String newarr[] = new String[menuItems.length+1];
		for (int i = 0; i < MAX_ITEMS+1; i++) {
			newarr[i] = menuItems[i];
		}
		newarr[menuItems.length+1] = name;
		menuItems = newarr;
	}
 
	public String[] getMenuItems() {
		/* TODO */
		return null;
	}
  
	public Iterator createIterator() {
		return null;
	}
 
	public String toString() {
		return "My Array Structure";
	}
}

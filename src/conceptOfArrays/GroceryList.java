package conceptOfArrays;

import java.util.ArrayList;

public class GroceryList {
	//private int[] myNumber;
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item){
		groceryList.add(item);
	}
	
	public void printGroceryList(){
		System.out.println("you have" + groceryList.size() + "items in your groceryList");
		for(int i=0; i<groceryList.size();i++){
			System.out.println((i+1) + "." + groceryList.get(i));
		}
	}
	//this is added new
	public void modifyGroceryItem(String currentItem,String newItem){
		int position = findItem(currentItem);
		if(position>=0){
			modifyGroceryItem(position, newItem);
		}
	}
	//this was public
	private void modifyGroceryItem(int position, String newItem){
		groceryList.set(position, newItem);
		System.out.println("Grocery Item" + (position + 1) + "has modified");
	}
	//This is addes new
	public void removeGroceryItem(String item){
		int position = findItem(item);
		if(position>=0){
			removeGroceryItem(position);
		}
	}
	//this one was public
	private void removeGroceryItem(int position){
		//String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
	/*public String findItem(String searchItem){
	//	boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position>=0){
			return groceryList.get(position);
		}
		return null;
	} */ //this was the First step i have used - where we were returning String
	private int findItem(String searchItem){
		return groceryList.indexOf(searchItem);
	}
	
	public boolean onFile(String searchItem){
		int position = findItem(searchItem);
		if(position>=0){
			return true;
		}
		return false;
	}
}

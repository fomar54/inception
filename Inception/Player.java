	//Player.java
/* 
 * Title: Player 
 * Author:Fatima Omar 
 * Date: March 20 2024 
 */

package Inception;
 import java.util.ArrayList;
import java.util.Random;

import Inventoryproject.Materials;

import java.io.*;
 
public class Player {
 public int health= 100;
 public int days = 5; 
 Random rand = new Random();
 Random rand2 = new Random(); 

private  ArrayList<Items>  Inventory = new  ArrayList<Items> ();
public static ArrayList<String> fileImport = new ArrayList<String>();

public static ArrayList<String> loadStringList(String filename){
	
	ArrayList<String> temp = new ArrayList<String>(); 
	  try {
	    BufferedReader file = new BufferedReader(new FileReader(filename));
	    while (file.ready()){
	      temp.add(file.readLine());
	    }
	    file.close();
	  } catch (IOException e){
	    System.out.println(e);
	  }
	  return temp;
	}

public void SaveStringList(String filename){
	  try{
	    PrintWriter file = new PrintWriter(new FileWriter(filename));
	    for (int i = 0; i < this.Inventory.size(); i++){
	      file.println(this.Inventory.get(i));
	    }
	    file.close();
	  }catch(IOException ex ){
	    System.out.println(ex.toString());

	  }
	}


public  int  heal() {
	int potion;
	// uses random function to pick a number between 0-20 and assign that to a variable 
	potion = rand.nextInt(23);
	// returns to game 
	//GETTER 
	return potion;
	
	
}	

  public boolean freeze(int level){
	  // in level 2 you get a new weapon  
	  // boolean states the chance of the enemy to frezze 
	  boolean freeze = false;
	 Random rand3 = new Random();
	        // if the user is in level 2 then the function random will a number to 2 
	        if (level == 2) {
	            int freeze1 = rand3.nextInt(3);
	            // assign rnadom number to an int to store 
	            if(freeze1 == 2) {
	               freeze = true;
	                // if the int freeze is the number 2 then frezze boolean turns on indicating the enemy is frozen 
	            }	        }
	        
	        return freeze; 
}


public ArrayList  viewItems() {
	// OUTPUT // returning inventory 
	// GETTER 
	return Inventory ;
		// showing inventory to player 
	}




public int attack() {
	//PROCESSING // uses random function to pick a number then assign that to a variable 
// random function rolls number between 0-23 
	int  damageE;
	damageE = rand2.nextInt(23);
	// assign that number to a int variable then return it to game 
//OUTPUT//
	//returning it to main game 
	return damageE;
}


public void addeditem(Items item) {
	// PROCESSING//
	
	this.Inventory.add(item);
	// takes input and add that to the arraylist Inventory 
		
}



public void removeItem(String name) {
 this.Inventory.remove(name);
 // Removing item to arraylisst inventory 
}



public static void main(String[] args) {
	
	fileImport = loadStringList(null);
	System.out.println(fileImport);

	
}

}

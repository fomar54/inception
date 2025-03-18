// Items.java 
/* 
 * Title: Items 
 * Author:Fatima Omar 
 * Date: March 20 2024 
 */

package Inception;
public class Items {

private String itemName;	
// every item has an name

public Items(String name) {
		this.itemName = name;	
		// assigns the parameter as a item
	}

	public static void main(String[] args) {
	 Items item = new Items("hi");
	 	
	}
	
	public String toString() {
		// prints variable as itemName
		return this.itemName;
	}
}

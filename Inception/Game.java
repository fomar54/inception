	//Game.java
/* 
 * Title:  RPG Game
 * Author:Fatima Omar 
 * Date: March 20 2024 
 */

package Inception;

import java.util.Scanner;

import Inventoryproject.Materials;

public class Game {
 public Scanner  scanner = new Scanner(System.in);
 public Scanner scanner2 = new Scanner(System.in);
 public Scanner scanner3 = new Scanner(System.in);
 public Scanner scanner4 = new Scanner(System.in);
public Scanner scanner5 = new Scanner(System.in);
 public Scanner scanner7 = new Scanner(System.in);
public Scanner scanner8 = new Scanner(System.in);
public Scanner scanner9 = new Scanner(System.in);
private Enemy  enemy = new Enemy();
 private Player player = new Player();
 // string colours to make sentences coloured
 public String RED= "\u001B[31m";
public String RESET = "\u001B[0m";
public String GREEN = "\u001B[32m ";
public String BLUE = "\u001B[34m";
// armor & lvl has a public ints that will be updated each level 
public int armor = 2;
public int lvl= 1;


private void setup() {
		
		// title Screen 
		System.out.println(RED + "\r\n"
				+ "_________ _        _______  _______  _______ __________________ _______  _       \r\n"
				+ "\\__   __/( (    /|(  ____ \\(  ____ \\(  ____ )\\__   __/\\__   __/(  ___  )( (    /|\r\n"
				+ "   ) (   |  \\  ( || (    \\/| (    \\/| (    )|   ) (      ) (   | (   ) ||  \\  ( |\r\n"
				+ "   | |   |   \\ | || |      | (__    | (____)|   | |      | |   | |   | ||   \\ | |\r\n"
				+ "   | |   | (\\ \\) || |      |  __)   |  _____)   | |      | |   | |   | || (\\ \\) |\r\n"
				+ "   | |   | | \\   || |      | (      | (         | |      | |   | |   | || | \\   |\r\n"
				+ "___) (___| )  \\  || (____/\\| (____/\\| )         | |   ___) (___| (___) || )  \\  |\r\n"
				+ "\\_______/|/    )_)(_______/(_______/|/          )_(   \\_______/(_______)|/    )_)\r\n"
				+ "                                                                                 \r\n"
				+ "" + RESET);
		
		System.out.println(" Enter any key to continue ");
		System.out.println("Enter [S] to save game ");
		//When user enters input, the scanner skips to next method 
		scanner.nextLine();
		
		// if the input of the user matchs with S then scanners directs user to save method 
		if (scanner.equals("S") ) {
			save();
		}
}
	private void run() throws InterruptedException {
		
		// takes user input processes it and stores it to a string variable "name"
		 String name; 
	      System.out.println("Insert name" );   
          name = scanner2.nextLine();    
          
		 String message =  "welcome, " + name +"  you have been trapped in your own dream, \n the only way out is to fight your biggeset fears to escape ";
	        char[] chars = message.toCharArray();
	        // Print a char from the array, then sleep for 1/10 second
 
	        // for loop goes through character printing it out one by one 
	        for (int i = 0; i < chars.length; i++) {
	            System.out.print(chars[i]);
	             Thread.sleep(100); 
	        }	
	}
	
	private void addItem()  {
		// INPUT // 
		// takes user input from a scanner 
		//Each level get new items will have options menu 
		System.out.println("\n You have woken in sliver armor ");
        System.out.println( " \n The first steps to escape is to pick a weapons of choice ");
	int newitem ;
	//PROCESSING 
	// takes the scanner as a int variable 

	//newitem = scanner3.nextInt();
// the different possible options comparing scanner input to possible items 
	// while loop 
while (true ) {
	// printint options 
	System.out.println("which would you like to add ?");
	System.out.println("[1] Plasma Grendade "
			+ "[2] Swarn Launcher  "
			+ "[3] Knuckle Sandwich Launcher");
	// takes use input as a int variable 
	newitem = intVaildtor();
	// if the user input matches the three options break the loop
	if (newitem == 1 ||  newitem == 2 || newitem == 3 ) {
	break;
	} else {
		// if not print the error line then the loop will continue 
		System.out.println("Invaild Input, try again!");
		
	}
	
}//while loop ends 
	
	
	if (newitem == 1) {
	player.addeditem(new Items( "Plasma Grendade"));
// then adding that item using the added item in player class to add new item in Inventory 
	}if (newitem == 2 ){
	player.addeditem(new Items("Swarn Launcher "));
	}
	if (newitem == 3) {
	 player.addeditem(new Items("Knuckle Sandwich Launcher"));
	}
	// OUTPUT   
	// prints out players method that returns Inventory arraylist
	System.out.println( player.viewItems());
	}
	
	
	private void fight() {
		// turns boolean true 
	boolean fighting = true; 
	int fight ;
	
	int num;
	
	// while players health is greater than or equal to  0 OR fighting boolean is true this code will go 
		while(player.health>=0 || fighting ) {
		// prints out level , armor number, the options in the fight , weapons 
			System.out.println( RED + "PREPARE TO DIE PLAYER" + RESET);
			System.out.println("Level:" + this.lvl);
			System.out.println( " Players Armor #: " + this.armor);
			System.out.println("This will help by blocking some damage from enemy");
			System.out.println("FIGHTING WEAPONS " + player.viewItems() );	
			// while loop containing the options for fight 
			
		while (true){
			// options 
			System.out.println("[1] Attack Enemy  \n [2]  Use healing Potion  \n [3] RUN AWAY \n ");			
			//INPUT  takes userinput 
			fight  = intVaildtor();
			 // if the userinput matches with the three options available break the loop and continue game 
			  if(fight == 1|| fight == 2 || fight == 3 ) { 
				 
				break;
			
			 }	else {
					System.out.println("Invaild Input Try Again!");
 
			 }
				 // if not then loop the options again 			
			   
			
		}
			
		
			  
			  
			// !numberEntered 
			  
			 	  // PROCESSING: takes scanner input and compares to the 3 options 	 
		// User picked to run away 
			if (fight == (3)) {
				 System.out.println("You ran away like a baby... " + "\n while you were running away you walked straight in a mouth of a huge bear and" + RED + "DIED" + RESET);
				 System.out.println("What a loser... now you are stuck in your dreams... " + RED +" FOREVER" + RESET);
				// prints statement of death then going to reset method that will reset game to the start again in fight mode 
				 reset();	
				 }		
			if (fight == (2)) {
				//uses remove item method in player class to remove potion from inventory arraylist
		 player.removeItem("potion");
		 int healing = player.heal();
		 // assigns the return variable of players method heal to the int variabke healing that will be added to players health later 	 
		 // comparing if players health is greater than 100 
	 if (player.health > 100) {
		 // makes sure players health can't go above 100 
		 // printing out a error line 
		 System.out.println("Health is at max " + player.health);
	 } 
	 // if adding the healing variable to the players health adds up above 100 
	 if ((healing + player.health)> 100) {
			 //  doesnt have any effect on players health 
		 // error prints 
			 System.out.println("Drank potion and never occured :( ");
		 }
	 else {
		 // when  both if arent true then add healing variable to the players health
		 player.health += healing;
		 // the print the new number for health 
		 System.out.println("Player's health after potion:" + player.health) ;
	 }
	}	
			
	if(fight == (1)) {	
		// assigns the return variable of enemy strength to a variable and adds the parameter of the lvl variable 
		int dodge = enemy.Strength(this.lvl);
		// return variable for players class attack method assigning it to  the variable damageEnemy
		int damageEnemy = player.attack();
		///  same thing but now in enemy class 
		int damage = enemy.attackplayer();
		// takes the the return variable of players class freeze method using the parameters ofthe current level 
		boolean frozen	= player.freeze(this.lvl) ;
			
			// prints out players attack on enemy 
		System.out.println(" Attacked Enemy damage " + damageEnemy); 
		
		// compares dodge variable from enemy strength to damage enemy
		// if the dodge variable is greater this code will proceed to be go 
			if(dodge> damageEnemy ) {
				// makes them equal to one another 
			dodge = damageEnemy;
				//prints out how enemy dodged entire attack 
				System.out.println( "Enemy dodged your attack!");
			}
			else {
				// else will print how much enemy blocked if dodge is less then damage for enemy 
				System.out.println( " Enemy blocked " + dodge + " Damage");
			}
			
	
		// updates enemy health by subtracting the damage and adding how much it dodged 
			enemy.health = ( enemy.health - damageEnemy  + dodge);
			// printing new enemy health
			System.out.println( "Enemy health: "+ enemy.health);
				
			// updates players health by subtarcting the damage the player taken that round 
			player.health = (player.health - damage );
			
			// now before adding the armor we compare if we add armor to player health are we above the max health of 100 
			if ((player.health + this.armor)< 100) {
				// if not we add armor to players health 
				player.health = (player.health - damage + this.armor );
			
			
			}
			// if the boolean frozen is true (can only happen int level 2 ) 
			if(frozen == true) {
				// prints out statement
				System.out.println( BLUE +"Enemey is frozen ! , the damage will not effect you health:)" + RESET);
				// adds the damage back to players health 
			int frozenEnemy = (player.health + damage );
			// prints out health 
				System.out.println("Players health:" + frozenEnemy);
				}else {
					// OR if boolean is off prints health after the attack from enemy 
					System.out.println("Players health:" + player.health);

				}
			// IF players health OR  enemy health is less than 100 
		if(player.health<0 || enemy.health<0) {
			// turninh boolean fighting false 
			fighting = false;
		}	
	}
		// if  players health is not at 0 and fighting has been turned false 
	if(enemy.health < 0 && fighting == false ) {
		System.out.println("Insert any key to Continue to next level ");
		// take to next level 
		scanner.next();	
		// compare current level then proceed to go to the next level or win method 
		if(this.lvl==1) {
			level2();
		}
		if (this.lvl==2){
			level3();
		}
		else{
			win();
		} 
	}
		
	}

		//reset option	
		
		}// end of fight
	private void level2() {
		// updating variable lvl number and armor number each New level 
		//SETTER
		this.lvl = 2;
		this.armor = 5;
		player.health= 100;
		enemy.health= 100;
		// title page for level 2 
		System.out.println(GREEN + "     __  __                        __   ____                               \r\n"
				+ " |  \\/  | __ _ _______    ___  / _| |  _ \\ _ __ ___  __ _ _ __ ___  ___ \r\n"
				+ " | |\\/| |/ _` |_  / _ \\  / _ \\| |_  | | | | '__/ _ \\/ _` | '_ ` _ \\/ __|\r\n"
				+ " | |  | | (_| |/ /  __/ | (_) |  _| | |_| | | |  __/ (_| | | | | | \\__ \\\r\n"
				+ " |_|  |_|\\__,_/___\\___|  \\___/|_|   |____/|_|  \\___|\\__,_|_| |_| |_|___/\r\n"
				+ "                                                                        " + RESET);
		
		System.out.println(   "congratulations for beating your first fear,  \n  walking away from your battle \n  you find a chest containing a gold plated chestplate and a healing potion" );
	
					System.out.println( "You have found a new weapon!, the ForstBite Riffle \n now when you attack enemy you have a chance to fezze enemny and attack again !!! ");
			// usinng the players class addeditem method adding new itmes to the inventory 	
		player.addeditem(new Items( "Healthing potion"));
		player.addeditem(new Items("ForstBite Riffle "));
		
	// go back to  fight method
		fight();
	}
	
	
	private void level3() {
		// updating variables 
		//SETTER
	this.lvl= 3;
	this.armor = 7;
	player.health= 100;
	enemy.health= 100;
	// Title page for level 3 
	System.out.println( GREEN + "   ____  _               _                       _   ____            _               \r\n"
			+ " / ___|| |__   __ _  __| | _____      _____  __| | |  _ \\ ___  __ _| |_ __ ___  ___ \r\n"
			+ " \\___ \\| '_ \\ / _` |/ _` |/ _ \\ \\ /\\ / / _ \\/ _` | | |_) / _ \\/ _` | | '_ ` _ \\/ __|\r\n"
			+ "  ___) | | | | (_| | (_| | (_) \\ V  V /  __/ (_| | |  _ <  __/ (_| | | | | | | \\__ \\\r\n"
			+ " |____/|_| |_|\\__,_|\\__,_|\\___/ \\_/\\_/ \\___|\\__,_| |_| \\_\\___|\\__,_|_|_| |_| |_|___/\r\n"
			+ "                                                                                    "
			
			+ RESET);
	player.removeItem(("ForstBite Riffle "));
	System.out.println("After defeating your second enemy , sadly your ForstBite Riffle was destoryed :(");
		System.out.println("The final battle is coming....  \n walking away from the second battle you find a chest.. \n saying the following.. " + RED +" In the depths of blue, where mysteries hide,\r\n"
				+ "Waves dance and sway with the incoming tide. " + RESET);
	}
	
	private void win() {
		// prints out when you finish last level 
		int reset;
		System.out.println("Contraglations  YOU HAVE WON ");
		System.out.println("[1] Restart Game [2] Quit game ");
		
	reset = scanner8.nextInt();
	if (reset == 1) {
		reset();
	} else {
		System.exit(0);
		}	
			}
	private void save() {
		// save game to text file and loads text file 
	player.SaveStringList("player.txt");
	player.loadStringList("player.txt");
	// prints out saved game to user 
	System.out.println("Saved Game");
	// puts player back in game 
	reset();
	}
	private void reset() {
		// reseting game by setting players & enemy health to 100 
		// going to setup method and fight method 
		System.out.println("Restarting Game......");
player.health= 100;
enemy.health= 100;
		setup();
		fight();
	}
	public static int intVaildtor() {
		Scanner input = new Scanner(System.in);
		 boolean numberEntered = false ; 

		// while loop
		while(numberEntered == false ) {
			System.out.println(" Enter option selected");
			if(input.hasNextInt()) {
				numberEntered = true;
			}else {// if input is string 
				System.out.println("Invaild Input. Enter number ");
				input.nextLine();
			}
			
		}
		int num = input.nextInt();
		return num;
		
	}

	public static void main(String[] args) throws InterruptedException {
	Game game = new Game();
	game.setup();
	game.run();
	game.addItem();
	game.fight();
	
	}
}

// This class is used as an  main connecting point for enemy,player and item classes to be used together. 
// Debugging included is for invalid input, fixing this was if the input didn't match with the options there then loop the options again and prompt the user to retry with a valid input 
// Encapsulation: Using private voids for all my methods the code can take the user's input in what action they would like to do.Proceed to do that then print out the result 
// never giving the user access variables but just telling them what the variables are at the time. This makes sure the users doesn't cheat the game and protecting the code \
// I also use getter and setter methods  for the methods to access the interaction of the variables without giving up  the protection aspect. 

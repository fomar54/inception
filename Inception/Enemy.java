	//Enemy.java
/* 
 * Title: Enemy 
 * Author:Fatima Omar 
 * Date: March 20 2024 
 */ 


package Inception;

import java.util.Random;

public class Enemy {
public  int damage;
public  int health= 100;
private int strength2 = 19;
private int strength3 = 35;

// random functions in use by picking a number between the limt given 
Random rand = new Random ();
Random rand2 = new Random();

public int attackplayer() {
	//Input// Calling the method
	// the damage to the player 
	// random function picks a number between 0-15 
	// Processing // 
	// use the rand functions and assigns it to variable damage 
		damage = rand.nextInt(12);
		// prints  enemy damage on player
		//OUTPUT // 
		// printing out how damage enemy had on player 
		System.out.println("Enemy Damage on Player: " + damage);
		return damage;
		
	}

	public int Strength(int level) {
		
		// level 2 & 3 ONLY
			if (level == 2 ) {
				// if the parameter matches to 2 then random functions going to the limt 
				// of the int strength2 equaling to 20 
		 damage = rand2.nextInt(strength2 );

		}

	if(level == 3 ) {
		// if the parameter matches to 3 (stating how we are in level 3 now)
		// changes the limitation to the made integer strength3 = 35  
		 damage = rand2.nextInt(strength3);
		 // assining this number to the variable damage 
	}
	// then returning it to game 
		return damage ;
	
	}


	
	
	public static void main(String[] args) {
	Enemy Fatima = new Enemy();
	Fatima.attackplayer();
	}
}

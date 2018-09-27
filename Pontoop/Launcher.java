package Pontoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
	
	static Scanner kboard = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		boolean drawCard = true;
		int gameTotal;
		String choice;
		int houseValue = 18;
		boolean playAgain = true;
		String playChoice;
		
		ArrayList<ArrayList<Integer>> matchArray = new ArrayList();//multi-dimensional arrayList
		while(matchArray.size() < 5 && playAgain == true) {//while less than 5 games and player chooses to play again
			gameTotal = 0;//reset game total
			ArrayList<Integer>gameArray = new ArrayList();//arraylist for multi-dimensional one
			do {
				
				Card newCard = new Card();//create new card with random number
				gameArray.add(newCard.cardNo);//add value to game array
				gameTotal = gameTotal + newCard.cardNo;//add value to running total for game
				System.out.println("Your current total = "+gameTotal);
				if(gameTotal < 21) {
					
					System.out.println("Do you want another card?");
					choice = kboard.next();
					if(choice.equalsIgnoreCase("Y")) {
						drawCard = true;
					}else {
						drawCard = false;
					}
					
				}else {
					drawCard = false;
				}
				
			}while(drawCard == true && gameTotal < 21);//decide the output for win/lose/draw
				
			if(gameTotal > houseValue && gameTotal < 22) {
				System.out.println("You won!");
			}else if(gameTotal < houseValue || gameTotal > 21){
				System.out.println("You lost!");
			}else if(gameTotal == houseValue){
				System.out.println("It's a draw!");
			}
			matchArray.add(gameArray);//add game arraylist to match arraylist
			
			if(matchArray.size() < 5) {
				System.out.println("Do you want to play again?");
				playChoice = kboard.next();
				if(playChoice.equalsIgnoreCase("Y")) {
					playAgain = true;
				}else {
					playAgain = false;
				}
			}
		}
		//print array list
		for(int i = 0; i < matchArray.size(); i++) {//accesses the 1st level index number of multi-dmsnl arraylist
			System.out.println("\nGame Number "+(i+1));//prints that value (+1 for user benefit, stops "game 0 = " etc)
			for(int j = 0; j < matchArray.get(i).size(); j++) {//access 2nd level of multi-dmsnl arraylist - .get 1st level index, length of array at that index
				System.out.println("Card "+(j+1)+" was a "+matchArray.get(i).get(j));//prints value (get i, get j, accesses 1st, then 2nd level)
			}
		}
	}
}

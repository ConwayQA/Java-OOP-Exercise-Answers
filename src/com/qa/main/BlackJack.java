package com.qa.main;

import java.util.Scanner;

public class BlackJack {
	
	public void callMethod() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input player 1's total: ");
		int player1 = input.nextInt();
		System.out.println("Please input player 2's total: ");
		int player2 = input.nextInt();
	
		blackJackChecker(player1, player2);
		
		input.close();
	}
	
	public void blackJackChecker(int player1, int player2) {
		if (player1 > player2 && player1 <= 21) {
			System.out.println("Player 1 wins! With a hand of: " + player1);
		} else if (player1 > player2 && player2 <= 21) {
			System.out.println("Player 2 wins! With a hand of: " + player2);
		} else if (player2 > player1 && player2 <= 21) {
			System.out.println("Player 2 wins! With a hand of: " + player2);
		} else if (player2 > player1 && player1 <= 21) {
			System.out.println("Player 1 wins! With a hand of: " + player1);
		} else if (player1 > 21 && player2 > 21) {
			System.out.println("Game ends in a tie! Both players went bust!");
		} else if (player1 == player2) {
			System.out.println("Game ends in a tie! with both players hands totalling: " + player1);
		}
	}

}

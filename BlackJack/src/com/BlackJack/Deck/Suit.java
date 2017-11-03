package com.BlackJack.Deck;

public enum Suit {

	SPADES("Spades"),
	HEARTS("Hearts"),
	DIAMONDS("Diamonds"),
	CLUBS("Clubs");
	
	private final String suitText;
	
	private Suit(String suitText){
		this.suitText = suitText;
	}
	
	public String printSuit(){
		return suitText;
	}
}

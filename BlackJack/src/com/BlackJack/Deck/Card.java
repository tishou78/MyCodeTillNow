package com.BlackJack.Deck;

public class Card {

	private Suit suit;
	private Rank rank;
	private boolean isFaceUp;
	
	public Card(Rank rank,Suit suit){
		this.rank = rank;
		this.suit = suit;
		isFaceUp = false;
	}
	
	public String getSuit(){
		return suit.printSuit();
	}
	
	public int getRank(){
		return rank.getRank();
	}
	
	public String printRank(){
		//get rank as a string(primarily for Aces)
		return rank.printRank();
	}
	
	public void flipCard(){
		isFaceUp = true;
	}

	@Override
	public String toString() {

		String str = "";
		
		if (isFaceUp) {
			str += rank.printRank() + " of " + suit.printSuit();
		}else{
			str = "Face down (nothing to see here)";
		}
		return str;
	}
	
}

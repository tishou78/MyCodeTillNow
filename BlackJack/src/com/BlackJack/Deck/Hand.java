package com.BlackJack.Deck;

import java.util.ArrayList;

public class Hand {

	protected ArrayList<Card> cards;
	
	public Hand(){
		cards = new ArrayList<>();
	}
	
	public void clear(){
		cards.clear();
	}
	
	public void add(Card card){
		cards.add(card);
	}
	
	public String showHand(){
		String str = "";
		for (Card c : cards) {
			str += c.toString() + "\n";
		}
		return str;
	}
	
	public boolean give(Card card, Hand otherHand){
		if (!cards.contains(card)){
			return false;
		}else{
			cards.remove(card);
			otherHand.add(card);
			return true;
		}
	}
	
	public int getTotal(){
		int totalPts = 0;
		boolean hasAce = false;
		
		for (int i = 0; i < cards.size(); i++) {
			totalPts += cards.get(i).getRank();
			if(cards.get(i).printRank() == "Ace"){
				hasAce = true;
			}
			if(hasAce && totalPts <= 11){
				totalPts += 10;
			}
		}
		
		return totalPts;
	}
	
}

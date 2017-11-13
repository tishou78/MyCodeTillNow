package com.BlackJack.Deck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Hand {
    
	public void populate(){
		for (Suit suit : Suit.values()) {
			for(Rank rank: Rank.values()){
				Card card = new Card(rank, suit);
				card.flipCard();
				cards.add(card);
				//this.add(card);
			}
		}
	}
	public void shuffling(){
		Collections.shuffle(cards);
	}
	
	public void splitCards(int num){
		ArrayList<Card> temp = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			temp.add(cards.get(i));
		}
		while(num > 0){
			cards.remove(0);
			num--;
		}
		cards.addAll(51-temp.size(), temp);
	   
	}
	
	public void deal(Hand[] hands, int perHand){
		for (int i = 0; i < perHand; i++) {
			for (int j = 0; j < hands.length; j++) {
				this.give(cards.get(0), hands[j]);
			}
		}
	}
	
	public void deal(Hand hand, int perHand){
		for (int i = 0; i < perHand; i++) {
			this.give(cards.get(0), hand);
		}
	}
	
	public void flipCard(Card c){
		c.flipCard();
	}
	
}

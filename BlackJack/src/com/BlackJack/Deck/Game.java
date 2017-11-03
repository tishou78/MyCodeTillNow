package com.BlackJack.Deck;

public class Game {

	public static void main(String[] args) {
		Card c1, c2;

		c1 = new Card(Rank.ACE, Suit.CLUBS);
		c2 = new Card(Rank.JACK, Suit.HEARTS);

		c1.flipCard();
		c2.flipCard();

		Hand h1 = new Hand();
		Hand h2 = new Hand();
		h1.add(c1);
		h1.add(c2);
		System.out.println(h1.showHand());
		h1.give(c1, h2);
		h1.clear();
		System.out.println("Hand 1 is: " + h1.showHand() + "\n" +
		"Hand 2 is: " + h2.showHand());

	}

}

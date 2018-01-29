package com.BlackJack.Deck;

public class Game {

	public static void main(String[] args) {

		// create a deck
		Deck d1 = new Deck();
		d1.populate();
		d1.shuffling();

		// Create our playing hands
		Hand h1, h2, h3, dealer;
		h1 = new Hand();
		h2 = new Hand();
		h3 = new Hand();
		dealer = new Hand();
		Hand[] hands = { h1, h2, h3 };

		// Deal cards to our hands
		d1.deal(hands, 3);

		// Deal two cards to dealer
		d1.deal(dealer, 2);

		// Show the players' hands
		for (int i = 0; i < hands.length; i++) {
			hands[i].flipCards();
			System.out.println(hands[i].showHand());
		}

		// Flip the dealer's first card
		dealer.cards.get(0).flipCard();

		// Show the dealer's cards
		System.out.println("\nDealer's Cards: \n" + dealer.showHand());

	}

}

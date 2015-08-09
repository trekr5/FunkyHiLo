package com.funkygames.funkyhilo.services;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.model.Card;
import com.funkygames.funkyhilo.model.Dealer;
import com.funkygames.funkyhilo.model.Game;
import com.funkygames.funkyhilo.model.GameResult;

public class HiLoGameService implements GameService {

	private Dealer dealer;

	public HiLoGameService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Game startGame() {
		// 1 create a new Game object
		Game game = new Game();

		// 2 deal the first card
		// 2. deal the first card
		Card firstCard = dealer.deal();
		// 3 add the first card to the game
		game.setFirstCard(firstCard);
		
		// 4 deal the second card
		Card secondCard = dealer.deal();
		// 5 add the second card to the game
		game.setSecondCard(secondCard);
		
		// return the game
		return game;
	}

	@Override
	public GameResult endGame(Game game, Choice playerChoice) {
		// TODO Auto-generated method stub
		return null;
	}

}
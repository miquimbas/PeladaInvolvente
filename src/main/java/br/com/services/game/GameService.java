package br.com.services.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.entities.Game;

@Component
public class GameService {

	@Autowired
	GameGateway gameGateway;
	
	public Game getNextGame() {
		return gameGateway.getNextGameData();
	}
}

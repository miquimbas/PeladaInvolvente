package br.com.controllers.game;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.entities.Game;
import br.com.entities.Player;
import br.com.services.game.GameGateway;

@Component
public class GameGatewayImpl implements GameGateway{

	@Override
	public Game getNextGameData() {
		Game game = new Game();
		game.setDay(new Date());
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		for (int i = 0; i < 5; i++) {
			Player player = new Player();
			player.setNickName("Miquimbas" + i);
			players.add(player);
		}
		
		game.setPlayers(players);
		game.setWaitingList(players);
		return game;
	}
	
}

package br.com.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.entities.Game;
import br.com.entities.Player;

@RestController
@RequestMapping("/pelada")
public class GameController {
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	Game getGame () {
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

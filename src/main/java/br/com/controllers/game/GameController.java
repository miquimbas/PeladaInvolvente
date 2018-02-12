package br.com.controllers.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.entities.Game;
import br.com.services.game.GameService;

@RestController
@RequestMapping("/pelada")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	Game getGame () {
		return gameService.getNextGame();
	}
}

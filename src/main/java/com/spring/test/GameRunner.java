package com.spring.test;

public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}
	public void run()
	{
		game.down();
		game.up();
		game.left();
	}
}

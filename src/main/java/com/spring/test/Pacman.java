package com.spring.test;

public class Pacman implements GamingConsole {
	public void up()
	{
		System.out.println("shoot");
	}
	
	public void down()
	{
		System.out.println("heal");
	}
	
	public void left()
	{
		System.out.println("sit");
	}
	
	public void right()
	{
		System.out.println("go forward");
	}
}

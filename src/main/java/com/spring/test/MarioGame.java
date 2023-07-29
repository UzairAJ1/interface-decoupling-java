package com.spring.test;

public class MarioGame implements GamingConsole {
	public void up()
	{
		System.out.println("jump");
	}
	
	public void down()
	{
		System.out.println("duck");
	}
	
	public void left()
	{
		System.out.println("go back");
	}
	
	public void right()
	{
		System.out.println("go forward");
	}
}

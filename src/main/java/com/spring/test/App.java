package com.spring.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        var game=new MarioGame();
        //var game=new Pacman();
        var gameRunner=new GameRunner(game);
        gameRunner.run();
    }
}

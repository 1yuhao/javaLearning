package javaLearning_07;

import java.util.Scanner;

public class Main extends Game
{
    public static void main(String[] args)
    {

        Game game = new Game();
        game.printWelcome();
        game.play();
        System.out.println("感谢您的光临。再见！");
    }
}

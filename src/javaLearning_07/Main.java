package javaLearning_07;

import java.util.Scanner;

public class Main extends Game
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        game.printWelcome();

        while (true)
        {
            String line = in.nextLine();
            String[] words = line.split(" ");
            if (words[0].equals("help"))
            {
                game.printHelp();
            } else if (words[0].equals("go"))
            {
                game.goRoom(words[1]);
            } else if (words[0].equals("bye"))
            {
                break;
            } else {
                System.out.println("命令不对，请查看help");
            }
        }

        System.out.println("感谢您的光临。再见！");
        in.close();
    }
}

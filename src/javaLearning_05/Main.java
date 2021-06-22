package javaLearning_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin c = new Coin();
        System.out.println(c.getName(amount));
    }
}

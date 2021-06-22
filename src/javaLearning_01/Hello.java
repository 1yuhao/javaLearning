package javaLearning_01;

import java.util.Scanner;

public class Hello
{

    public static boolean isPrime(int j)
    {
        boolean isPrime = true;
        return isPrime;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int factor = 1;
//        while(i<=n) {
//            factor = factor * i;
//            i=i+1;
//        }
        for (i = 1; i <= n; i = i + 1)
        {
            factor = factor * i;
            System.out.println(factor);
        }

    }
}

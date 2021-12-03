package OverviewOFWork;

import java.util.Scanner;
import java.math.*;
class CentsToDollars
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        double money;
        double dollars;
        double cents;

        System.out.println("How many cents do you have?");
        money = scan.nextDouble();

        dollars = Math.floor(money / 100);
        cents = Math.round((money / 100) % 1);

        System.out.println("dollars: " + dollars + " Cents: " + cents);
    }
}

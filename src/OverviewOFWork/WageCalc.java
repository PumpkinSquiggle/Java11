package OverviewOFWork;

import java.util.Scanner;
class WageCalc
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        double payPerHour;
        int hoursWorked;
        double grossPay, taxAmount, netIncome;

        System.out.println("How much are you payed per hour?");
        payPerHour = scan.nextDouble();

        System.out.println("How many hours did you work");
        hoursWorked = scan.nextInt();

        grossPay = hoursWorked * payPerHour;
        taxAmount = grossPay * 0.3;
        netIncome = grossPay - taxAmount;

        System.out.println("your gross pay is $" + grossPay);
        System.out.println("You should pay " + taxAmount + " dollars in taxes");
        System.out.println("Your net income is $" + netIncome);
    }
}
package OverviewOFWork;

import java.util.Scanner;
class TicketCostCalc
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        int tickets;
        double costPerTicket;
        double subtotal;
        double finalCost;

        System.out.println("How many Tickets:");
        tickets = scan.nextInt();

        System.out.println("How much per ticket");
        costPerTicket = scan.nextDouble();

        subtotal = tickets*costPerTicket;

        double GST = 0.06 * subtotal;
        double PST = 0.07 * subtotal;

        finalCost = subtotal + GST + PST;

        System.out.println("The final cost is: " + finalCost);

    }

}

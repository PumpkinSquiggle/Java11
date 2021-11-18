package Assignment15;

import java.util.Scanner;
class overdueFineCalc
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        int daysOverdue = 1;
        char fineCategory;
        double finalFine = 0;

        while (daysOverdue != 0) {

            System.out.println("How many days is the book overdue? (For Exit enter 0)");
            daysOverdue = scan.nextInt();

            if (daysOverdue == 0) {return;}

            System.out.println("What category of book/fine is it (A,B,C,D,E,F) ?");
            fineCategory = scan.next(".").charAt(0);

            switch (fineCategory) { // WOW fancy way of doing switch
                case 'A' -> finalFine = 0.10 * daysOverdue;
                case 'B' -> finalFine = 0.25 * daysOverdue;
                case 'C' -> finalFine = 0.50 * daysOverdue;
                case 'D' -> finalFine = 1.00 * daysOverdue;
                case 'E' -> finalFine = 2.00 * daysOverdue;
                case 'F' -> finalFine = 5.00 * daysOverdue;
            }

            System.out.println(finalFine + " Dollars");
        }
    }
}

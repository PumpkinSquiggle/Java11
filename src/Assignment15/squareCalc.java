package Assignment15;

import java.util.Scanner;
class squareCalc
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        int num;
        int numSquared;
        int keepGoing = 1;

            while (keepGoing == 1) {

                System.out.println("If you want to keep going enter 1 to end the program enter 0:");
                keepGoing = scan.nextInt();

                if (keepGoing == 0) {
                    return;
                }
                else {

                    System.out.println("Enter the number you want to find the square of:");
                    num = scan.nextInt();

                    numSquared = num * num;

                    System.out.println("The square of " + num + " is " + numSquared);

                }


            }
    }
}

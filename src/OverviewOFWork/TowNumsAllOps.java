package OverviewOFWork;

import java.util.Scanner;

class TowNumsAllOps
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        double numOne;
        double numTwo;

        System.out.println("Enter one number than another");
        numOne = scan.nextDouble();
        numTwo = scan.nextDouble();

        System.out.println(numOne + " + " + numTwo + " = " + numOne + numTwo);
//        if (numOne > numTwo) {
//            System.out.println(numOne + " - " + numTwo + " = " + numOne - numTwo);
//        } else {
//            System.out.println(numTwo + " - " + numOne + " = " + numTwo - numOne);
//        }
        // Hmm cant seem to subtract doubles...
        System.out.println(numOne + " * " + numTwo + " = " + numOne * numTwo);
        System.out.println(numOne + " / " + numTwo + " = " + numOne / numTwo);
    }
}

package OverviewOFWork;

import java.util.Scanner;
class PackageShippingCost
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        double height, width, depth, weight;
        double oversizeCost = 0;
        double overweightCost = 0;
        double finalCharge = 5;
        int run = 1;

        while (run == 1) {

            System.out.println("Do you want to run this program? 1 yes 0 no");
            run = scan.nextInt();

            if (run == 0) {
                break;
            }

            System.out.println("Enter measurements in meters and Kg");

            System.out.println("Enter the height: ");
            height = scan.nextDouble();

            System.out.println("Enter the width: ");
            width = scan.nextDouble();

            System.out.println("Enter the depth: ");
            depth = scan.nextDouble();

            System.out.println("Enter the weight: ");
            weight = scan.nextDouble();

            double volume = height * width * depth;

            if (volume > 5) {
                oversizeCost += 20;
            }

            if (weight > 5) {
                overweightCost += 10;
            }

            System.out.println("The base cost is: $" + finalCharge);
            System.out.println("The oversize cost is: $" + oversizeCost);
            System.out.println("The overweight cost is: $" + overweightCost);
            System.out.println("The final cost is" + finalCharge + oversizeCost + oversizeCost);

            oversizeCost = 0;
            overweightCost = 0;
        }
    }
}

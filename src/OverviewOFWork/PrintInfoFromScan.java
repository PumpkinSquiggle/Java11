package OverviewOFWork;

import java.util.Scanner;
class PrintInfoFromScan
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        String name;
        String address;
        String province;
        String postalCode;

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Enter your address");
        address = scan.nextLine();

        System.out.println("Enter your province");
        province = scan.nextLine();

        System.out.println("Enter your postal code");
        postalCode = scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Province: " + province);
        System.out.println("Postal Code: " + postalCode);


    }
}

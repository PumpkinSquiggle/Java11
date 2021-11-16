package Chap24;

import java.text.*;
import java.util.Locale;
import java.util.Scanner;

class formatTest
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner (System.in);

        double value;
        String yourLocale;

        System.out.println("Enter a number with decimals:");
        value = scan.nextDouble();

        Locale.setDefault( Locale.getDefault() );
        DecimalFormat triDecimalsForm = new DecimalFormat("0.000");
        DecimalFormat percentForm = new DecimalFormat("0%");
        DecimalFormat currencyForm = new DecimalFormat("$0.00");

        System.out.println( "Three decimals " + triDecimalsForm.format(value) );
        System.out.println( "Percent " + percentForm.format(value) );
        System.out.println( "Currency " + currencyForm.format(value) );
    }
}

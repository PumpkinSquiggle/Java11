package Chap24;

import java.util.Scanner ;
import java.util.Random ;

    class random1To100

    {

        public static void main(String[] args )

        {

            Scanner scan = new Scanner( System.in );//hello

            Random generatorRandom = new Random();

            int num,counter ;

            int total = 0;

            for ( counter=1; counter<=100; counter++ )

            { //brackets work like pascal's begin...end statements

                num= generatorRandom.nextInt (25)+1;

                System.out.println ( counter+" "+num);

                total = total + num;

            }

            System.out.print ( "Let's enter a number just for fun:");

            num = scan.nextInt ();

            System.out.println ( "The number you entered was: "+num);
            System.out.println("The total sum of all the numbers: " + total);

        }

    }


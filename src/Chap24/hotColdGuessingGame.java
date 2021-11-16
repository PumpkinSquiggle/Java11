package Chap24;

import java.util.Scanner ;
import java.util.Random ;

class hotColdGuessingGame

{

    public static void main(String[] args )

    {

        Scanner scan = new Scanner( System.in );//hello

        Random randomGen = new Random();

        int num,guess ;

        int wantToPlay = 1;
        int attempts = 0;

        while (wantToPlay == 1) {

            num = randomGen.nextInt (100)+1;

            do //putting a do here instead of the while guarantee’s that the loop will execute
            // at least once…with a while you have to make sure the conditions will cause the
            // loop to happen at least once.

            {

                System.out.print("Guess the number: ");

                guess = scan.nextInt();

                attempts++;

                if (guess > num) System.out.println("Too High");

                if (guess < num) System.out.println("Too Low");

            }

            while (num != guess);//this means while num is not equal to guess. by putting the while here
            // it evaluates after you have guessed

            System.out.println("You got it in " + attempts + " attempts");
            attempts = 0;
            System.out.println("Do you want to play again? (1 = yes, 0 = no)");
            wantToPlay = scan.nextInt();
        }

        System.out.println("Good Game");

    }

}


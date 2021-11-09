package Chap24;

import java.util.Scanner;
import java.util.Random;

    class randomGuess
    {
        public static void main (String[] args)
        {
            Scanner scan = new Scanner (System.in);
            Random randomGen = new Random();

            int guess, num, difference;

            num = randomGen.nextInt(100);

            System.out.println("Enter your guess: (1-100)");
            guess = scan.nextInt();

            if (num == guess) {
                System.out.println("Correct!!");
            }
            else if (guess > num) {
                difference = guess - num;
                System.out.println("The answer was " + num + ", you were off by " + difference);
            }
            else {
                difference = num - guess;
                System.out.println("The answer was " + num + ", you were off by " + difference);
            }




        }
    }

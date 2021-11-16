package Chap24;

import java.util.Random;
import java.util.Scanner;
class randomLuck
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Random randomGen = new Random();

        int counter;
        int guess;
        int guessRight = 0, guessWrong = 0;

        for (counter = 1; counter <= 10; counter++) {

            int num = randomGen.nextInt(100) + 1;

            System.out.println("Is the random number higher than 50 or lower? 1 = low, 2 = high");
            guess = scan.nextInt();

            if (num > 50)
                num = 2;
            else
                num = 1;

            if (guess == num) {
                System.out.println("Correct!");
                guessRight++;
            } else {
                System.out.println("Incorrect!");
                guessWrong++;
            }
        }

        System.out.println("right: " + guessRight + " wrong: " + guessWrong);

        if (guessRight >= 6) {
            System.out.println("Lucky!");
            
        }
    }
}

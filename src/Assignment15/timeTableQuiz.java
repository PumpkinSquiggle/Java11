package Assignment15;

import java.util.Scanner;
class timeTableQuiz// Change at end to rep what it does
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);

        int timeTable;
        int endPoint = 12;
        int counter = 1;
        int guess;
        int answer;
        int answersRight = 0, answersWrong = 0;

        System.out.println("Enter what time table you want to practice: ");
        timeTable = scan.nextInt();


        while (counter <= endPoint) {

            answer = timeTable * counter;

            System.out.println(timeTable + " x " + counter);
            guess = scan.nextInt();

            if (guess == answer) {
                answersRight++;
                System.out.println("CORRECT!");
            }
            else {
                answersWrong++;
                System.out.println("Incorrect!");
            }

            counter++;
        }
        System.out.println(answersRight + "/" + endPoint + " correct");
    }
}

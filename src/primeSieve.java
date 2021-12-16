import java.util.*;

class primeSieve
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner (System.in);

        List<Boolean> numList = new ArrayList<Boolean>();
        Collections.fill(numList, true);

        int arrayCounter;
        int arrayNumToFalse = 0;
        int arrayNum = 2; // (arrayCounter * arrayNum = arrayNumToFalse)
        int testCounter = 0;
        int topNum;
        double startTime = System.nanoTime();


        System.out.println("To what number do you want to test to?");
        topNum = scan.nextInt();

        // common uses of this program below
        /*
            10 - 4
            100 - 25
            1,000 - 168
            10,000 - 1,229
            100,000 - 9,592
            1,000,000 - 78,498
            10,000,000 - 664,579
            100,000,000 - 5,761,455
            1,000,000,000 - 50,847,534
        */

        numList.add(0, false);
        numList.add(1, false);


        System.out.println("done creating array, starting logic");
        arrayCounter = 1;

        while (arrayNum < Math.sqrt(topNum)) {

            if (numList.get(arrayNum)) {
                while (arrayNumToFalse < (topNum - arrayNum)) {
                    arrayCounter++;
                    arrayNumToFalse = arrayNum * arrayCounter;
                    numList.add(arrayNumToFalse, false);
                }
            }
            arrayNum++;
            arrayCounter = 1;
            arrayNumToFalse = arrayNum * arrayCounter;
        }

        System.out.println("Prints primes");

        numList.removeIf( num -> num);

        System.out.println(numList);

        double timeRunning = (java.lang.System.nanoTime() - startTime) / 1_000_000_000;
        System.out.println("has been running for " + timeRunning + " seconds");
        System.out.println("There are " + testCounter + " primes in " + topNum);
    }
}

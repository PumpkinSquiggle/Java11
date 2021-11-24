import java.math.*;
import java.util.Arrays;

class primeSieve2
{
    public static void main (String[] args)
    {
        boolean[] primeArray = new boolean[10_000_000];
        Arrays.fill(primeArray, Boolean.TRUE);
        int arrayCounter;
        int arrayNumToFalse = 0;
        int arrayNum = 2; // (arrayCounter * arrayNum = arrayNumToFalse)
        int testCounter = 0;
        double startTime = System.nanoTime();
        int[] isPrime = new int[664_579];

        primeArray[1] = false;
        primeArray[0] = false;


        System.out.println("done creating array, starting logic");
        arrayCounter = 1;

        while (arrayNum < Math.sqrt(primeArray.length)) {

            if (primeArray[arrayNum]) {
                while (arrayNumToFalse < (primeArray.length - arrayNum)) {
                    arrayCounter++;
                    arrayNumToFalse = arrayNum * arrayCounter;
                    primeArray[arrayNumToFalse] = false;
                }
            }
            arrayNum++;
            arrayCounter = 1;
            arrayNumToFalse = arrayNum * arrayCounter;
        }

        primeArray[1] = false;
        primeArray[0] = false;

        System.out.println("Prints primes");

        arrayCounter = 0;
        while (arrayCounter <= primeArray.length - 1) {
            if (primeArray[arrayCounter]) {
                isPrime[testCounter] = arrayCounter;
                testCounter++;
            }
            arrayCounter++;
        }

        System.out.println(Arrays.toString(isPrime));

        double timeRunning = (java.lang.System.nanoTime() - startTime) / 1_000_000_000;
        System.out.println("has been running for " + timeRunning + " seconds");
        System.out.println("There are " + testCounter + " primes in " + primeArray.length);
    }
}

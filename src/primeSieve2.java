class primeSieve2
{
    public static void main (String[] args)
    {
        boolean[] primeArray = new boolean[10_000_000];
        int arrayCounter = 0;
        int arrayNumToFalse = 0;
        int arrayNum = 2; // (arrayCounter * arrayNum = arrayNumToFalse)
        int testCounter = 0;
        double startTime = System.nanoTime();

        primeArray[1] = false;
        primeArray[0] = false;

        while (arrayCounter != primeArray.length) { // generates an array 10mil long and sets all to true
            primeArray[arrayCounter] = true;
            arrayCounter++;
        }

        System.out.println("done creating array, starting logic");
        arrayCounter = 1;

        while (arrayNum < primeArray.length) {


            if (primeArray[arrayNumToFalse] == true) {
                System.out.println("Can skip # " + arrayNum);
                arrayNum++;
                continue;
            }


            while (arrayNumToFalse < (primeArray.length - arrayNum)) {
                arrayCounter++;
                arrayNumToFalse = arrayNum * arrayCounter;
                primeArray[arrayNumToFalse] = false;
                //System.out.println("Increasing array counter");
            }
            arrayNum++;
            arrayCounter = 1;
            arrayNumToFalse = arrayNum * arrayCounter;
            //System.out.println("Increasing array num");
        }

        primeArray[1] = false;
        primeArray[0] = false;

        System.out.println("prints array");

        arrayCounter = 0;
        while (primeArray.length - 1 >= arrayCounter) {
            System.out.println((arrayCounter) + " - " + primeArray[arrayCounter]);
            arrayCounter++;
        }

        System.out.println("Prints primes");

        arrayCounter = 0;
        while (arrayCounter <= primeArray.length - 1) {
            if (primeArray[arrayCounter]) {
                System.out.println(arrayCounter + " is prime");
                testCounter++;
            }
            arrayCounter++;
        }
        double timeRunning = (java.lang.System.nanoTime() - startTime) / 1_000_000_000;
        System.out.println("has been running for " + timeRunning + " seconds");
        System.out.println("There are " + testCounter + " primes in " + primeArray.length);
    }
}

class primeTest2 {

    public static void main(String[] args) {
        long testNumber = 1;
        int numOfPrimes= 1;
        double startTime = java.lang.System.nanoTime();


        // kinda a cheat but whatever
        System.out.println("2 is prime");

        while (testNumber < 10_000_000) {

            double root = Math.sqrt(testNumber);
            long wholeRoot = Math.round(root);
            long i; // counter
            boolean isPrime = true;
            //long lastDigit = testNumber % 10; // try dif combos in optimizations

            if (root == wholeRoot) {
                testNumber+=2;
                continue;
            }


            for (i=3;i<wholeRoot;i+=2) {
                if (testNumber % i == 0) {
                   isPrime = false;
                   break;
                }
            }

            if (isPrime) {
                System.out.println(testNumber + " is prime");
                numOfPrimes++;
            }

            testNumber+=2;
        }
        double timeRunning = (java.lang.System.nanoTime() - startTime) / 1_000_000_000;
        System.out.println("has been running for " + timeRunning + " seconds");

        System.out.println(numOfPrimes); // test if I have all primes for 10mil should be 664579
    }
}

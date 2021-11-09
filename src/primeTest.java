class primeTest {
    public static void main(String[] args) {

        long testNumber = 1;
        double testNumberRoot;
        long startTime = System.nanoTime();
        long endTime;
        double rootDivideCounter = 1;
        double rootDivideAnswer;
        boolean isPrime = true;


        // continues until having tested 10 million numbers
        while (testNumber <= 10000000) {

            testNumberRoot = Math.sqrt(testNumber);

            rootDivideCounter = testNumberRoot;

            Math.round(rootDivideCounter);



            // if root is whole # is not prime
            // if whole
            if (testNumberRoot % 1 == 0) {
                // TODO next number
            }

            // Maybe prime
            // if not whole
            else {


                while (rootDivideCounter > 1 ) {

                    rootDivideAnswer = testNumber / rootDivideCounter;

                    if (rootDivideAnswer % 1 == 0) {
                        rootDivideCounter--;
                    }
                    else {
                        isPrime = false;
                    }

                    // TODO divide number by all numbers below root
                    // TODO check if any of them (not 1) are whole if they are

                }

                if (isPrime) {
                    System.out.println(testNumber);
                }

            }

            testNumber = testNumber + 2;
        }

        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
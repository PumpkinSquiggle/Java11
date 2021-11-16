class primeTest2 {

    public static void main(String[] args) {
        long testNumber = 1;
        int rootCounter = 1;

        while (testNumber < 1000) {

            double root = Math.sqrt(testNumber);
            long wholeRoot = Math.round(root);
            long i = 3; // counter
            boolean isPrime = true;

            for (i=3;i<=wholeRoot;i++) {
                if (testNumber % i == 0) {
                    System.out.println(testNumber + "is not prime");
                    isPrime = false;
                }
            }


            testNumber+=2;
                // TODO if (num % i) are true
                // if num % i is 0 cannot be prime restart until reaching root of num
                // if all are not 0 then prime else break
        }
    }
}

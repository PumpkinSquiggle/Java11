class primeSieve
{
    public static void main (String[] args)
    {
        boolean[] primeArray = new boolean[100];
        int arrayCounter = 0;
        int multiplyingNum = 2;
        int multiplyingCounter = 2;
        int arrayNumToFalse;

        while (arrayCounter != primeArray.length) { // generates an array 10mil long and sets all to false
            primeArray[arrayCounter] = true;
            arrayCounter+=2;
        }

        while (multiplyingNum <= (primeArray.length - 1)) {
            arrayNumToFalse = multiplyingNum * multiplyingCounter;

            if (primeArray[arrayNumToFalse]) {
                while (multiplyingCounter < (primeArray.length - 1)) {
                    primeArray[arrayNumToFalse] = false;
                    multiplyingCounter++;
                    arrayNumToFalse = multiplyingNum * multiplyingCounter;
                }
            }
            multiplyingNum++;
        }
        System.out.println(primeArray[52]);
        // done
    }
}

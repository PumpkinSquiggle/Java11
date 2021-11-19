import java.math.BigInteger;

class primeSieve
{
    public static void main (String[] args)
    {
        boolean[] primeArray = new boolean[10_000_000];
        int arrayCounter = 0;
        int multiplyingNum = 2;
        int multiplyingCounter = 2;
        int arrayNumToFalse;

        while (arrayCounter != 10_000_000) { // generates an array 10mil long and sets all to false
            primeArray[arrayCounter] = true;
            arrayCounter+=2;
        }

        while (multiplyingNum <= 10_000_000) {
            arrayNumToFalse = multiplyingNum * multiplyingCounter;

            if (!primeArray[arrayNumToFalse]) {
                multiplyingNum++;
            }
            else {
                while (multiplyingCounter < 10_000_000) {
                    primeArray[arrayNumToFalse] = false;
                    multiplyingCounter++;
                    arrayNumToFalse = multiplyingNum * multiplyingCounter;
                }
                multiplyingNum++;
            }
        }
        System.out.println(primeArray[366_402]);
        // done
    }
}

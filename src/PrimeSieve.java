import java.math.*;

class PrimeSieve
{
        public static void main (String[] args)
        {

                int[] allNumbers = {};
                int allNumbersCounter = 0; // array[allNumbersCounter] = x
                int innitAllNumbers = 1; // array[x] = innitAllNumbers


                while (allNumbers.length < 100) {

                        allNumbers[allNumbersCounter] = innitAllNumbers;

                        allNumbersCounter++;
                        innitAllNumbers+=2;

                        System.out.println(allNumbers[innitAllNumbers]);
                }
        }
}

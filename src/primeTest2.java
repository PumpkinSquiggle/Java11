class primeTest2
{
    public static void main (String[] args)
    {
       long testNumber = 1;

       while (testNumber < 100) {

           double root = Math.sqrt(testNumber);
           long wholeRoot = Math.round(root);
           long i; // counter
           boolean isPrime = false;

           for (i = 2;/*add root opt*/testNumber % i == 1; i++) {
               if (i >= wholeRoot) {
                   System.out.println(testNumber);
                   break;
               }
               else {
                    break;
               }
           }
           testNumber = testNumber + 2;

               // TODO if (num % i) are true
               // if num % i is 0 cannot be prime restart until reaching root of num
               // if all are not 0 then prime else break
       }
    }
}

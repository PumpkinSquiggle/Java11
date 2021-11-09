package Templates;

import java.util.Scanner;
import java.io.*;

class writeToFile

{

    public static void main ( String[] args ) throws IOException

    {

        Scanner scan = new Scanner(System.in);

        int data=0;

        File file = new File( "data.txt" );

        PrintStream print = new PrintStream( file );

        while (data !=-1)

        {

            System.out.print("DATA(-1 to exit): ");

            data= scan.nextInt();

            print.println( data );

        }

        print.close();

    }

}
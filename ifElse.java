// Task
// Given an integer,n , perform the following conditional actions:

// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5 , print Not Weird
// If n is even and in the inclusive range of 6 to 20 , print Weird
// If n is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not n is weird.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(( N%2 != 0) || (N%2 == 0 && N > 6  && N <= 20)){
            System.out.print("Weird");
        }else if ((N%2 == 0 && N > 20) || (N%2 == 0 && N > 2 && N < 5)){
            System.out.print("Not Weird");
        }
        bufferedReader.close();
    }
}

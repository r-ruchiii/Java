// Given two strings of lowercase English letters, A and B, perform the following operations:

// Sum the lengths of A and B.
// Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
// Capitalize the first letter in A and B and print them on a single line, separated by a space.

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A  = sc.nextLine();
        String B = sc.nextLine();
        
        System.out.println(A.length() + B.length());
        
        int comp = A.compareTo(B);
        if(comp > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        String a = String.valueOf(A.charAt(0)).toUpperCase();
        String b = String.valueOf(B.charAt(0)).toUpperCase();

        String Aleft = A.substring(1, A.length());
        String Bleft = B.substring(1, B.length());
        
        System.out.println(a+Aleft+ " "  + b+Bleft);
        
    }
}

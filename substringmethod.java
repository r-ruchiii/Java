// Given a string,s , and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1 . 
// You'll find the String class' substring method helpful in completing this challenge.

import java.util.Scanner;

public class Substringmethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
        
    }
}
